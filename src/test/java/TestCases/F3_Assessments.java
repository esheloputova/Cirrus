/**
 * 
 */
package TestCases;

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
import Pages.Assessments;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs that the author is going to perform in Assessments (create a fix assessment using timed section)
 */
public class F3_Assessments {
	
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
//		driver = new ChromeDriver();
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
	public void F301LoginAssessor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"F301LoginAssessor"}, enabled=true)
	public void F302AddAssessment() throws InterruptedException 
	{
		Assessments assessments=new Assessments(driver);
		assessments.addAssessmentManualWithTimedSection();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F302AddAssessment"}, enabled=true)
	public void F303SetInformation() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.setInformation();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F303SetInformation"}, enabled=true)
	public void F304SetOptions() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.setOptions();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F304SetOptions"}, enabled=true)
	public void F305QuestionSelect() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.questionSelectionManual();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F305QuestionSelect"}, enabled=true)
	public void F306AddTimedSection() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.addTimedSection();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F306AddTimedSection"}, enabled=true)
	public void F307GenerateAssessment() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.generateAssessmentWithSection();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F307GenerateAssessment"}, enabled=true)
	public void F308DeleteAssessment()
	{
		Assessments assessments=new Assessments(driver);
		assessments.deleteAssessment();
	}
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.captureScreenshot(driver, result.getName());
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
