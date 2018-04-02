/**
 * 
 */
package TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.Schedule;
import Pages.Assessments;
import Pages.Library;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs that are going to create assessment for Psychometrics and schedule it
 */
public class I3_Psychometrics {
	
WebDriver driver;
	
	
	
	@BeforeClass
	@Parameters({ "browser", "url" })
	public void setUp(String browserName, String url)
	{
	if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","./Browsers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);

	}
	else if(browserName.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver", "./Browsers/IEDriverServer32.exe");
		driver = new InternetExplorerDriver();
	}
		driver.manage().window().maximize();
		driver.get(url+"/author/login");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void I301LoginAssessor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I301LoginAssessor"}, enabled=true)
	public void I302AddAssessment() throws InterruptedException 
	{
		Assessments assessments=new Assessments(driver);
		assessments.addAssessmentManual("Psychometrics");
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I302AddAssessment"}, enabled=true)
	public void I303SetInformation() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.setInformation();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I303SetInformation"}, enabled=true)
	public void I304SetOptions() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.setOptions();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I304SetOptions"}, enabled=true)
	public void I305QuestionSelect() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.questionSelectionPsychometrics();
	}	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I305QuestionSelect"}, enabled=true)
	public void I306GenerateAssessment() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.generateAssessmentPsycho();
	}
	
	// Scheduling
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I306GenerateAssessment"}, enabled=true)
	public void I307AddSchedule() throws InterruptedException 
	{
		Schedule schedule=new Schedule(driver);
		schedule.addSchedule();
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I307AddSchedule"}, enabled=true)
	public void I308SetCandidates()
	{
		Schedule schedule=new Schedule(driver);
		schedule.setCandidates();
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I308SetCandidates"}, enabled=true)
	public void I309ScheduleAssessment()
	{
		Schedule schedule=new Schedule(driver);
		schedule.scheduleAssessment();
	}
	
		
	
	@AfterMethod
	public void IfFail(ITestResult result, Method m) throws InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.captureScreenshot(driver, result.getName());
			Library library=new Library(driver);
			library.deleteCollectionIfFail(m);
			
		}
	}
	
	@AfterClass
	public void tearDown()
	{
//		driver.quit();
	}
	
}
