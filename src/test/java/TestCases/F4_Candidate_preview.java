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
import Pages.Delivery;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs that the author is going to perform in Assessments (preview assessment with NDA and Registration form as Candidate)
 */
public class F4_Candidate_preview {
	
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
	public void F401LoginAssessor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"F401LoginAssessor"}, enabled=true)
	public void F402PreviewAssessment() 
	{
		Assessments assessments=new Assessments(driver);
		assessments.previewAssessmentAsCandidate();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F402PreviewAssessment"}, enabled=true)
	public void F403AcceptNDA()
	{
		Assessments assessments=new Assessments(driver);
		assessments.acceptNDA();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F403AcceptNDA"}, enabled=true)
	public void F404FillRegistrationForm() throws InterruptedException
	{
		Assessments assessments=new Assessments(driver);
		assessments.fillRegistrationForm();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F404FillRegistrationForm"}, enabled=true)
	public void F405TakeAssessment() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswerNDA();
		delivery.EitherOrTS();
		delivery.EssayTypeNDA();
		delivery.SelectFromListTS();
		delivery.MCwithMapTS();
		delivery.NumericNDA();
		delivery.HotspotTS();
		Thread.sleep(2000);
		delivery.ExtendedMatchTS();
		delivery.MCwithYouTubeTS();
		delivery.OrderTS();
		delivery.UploadFileTS();
		delivery.FillTheBlankTS();
		delivery.MultipleChoiceTS();
		delivery.MultipleResponseTS();
		delivery.MatchTS();
		delivery.CompleteAssessment();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"F405TakeAssessment"}, enabled=true)
	public void F406VerifyExamSummary()
	{
		Delivery delivery=new Delivery(driver);
		delivery.VerifyExamSummary();
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
