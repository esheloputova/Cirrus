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
 *	This class has TCs that the author is going to perform in Assessments (create a manual assessment - fix assessment)
 */
public class F_Assessments {
	
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
	public void F001LoginAssessor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"F001LoginAssessor"}, enabled=true)
	public void F002AddAssessment() throws InterruptedException 
	{
		Assessments assessments=new Assessments(driver);
		assessments.addAssessmentManual("Teos automated test assessment");
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F002AddAssessment"}, enabled=true)
	public void F003SetInformation() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.setInformation();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F003SetInformation"}, enabled=true)
	public void F004SetOptions() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.setOptions();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F004SetOptions"}, enabled=true)
	public void F005QuestionSelect() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.questionSelectionManual();
	}	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F005QuestionSelect"}, enabled=true)
	public void F006GenerateAssessment() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.generateAssessment();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F006GenerateAssessment"}, enabled=true)
	public void F007DeleteAssessment()
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
