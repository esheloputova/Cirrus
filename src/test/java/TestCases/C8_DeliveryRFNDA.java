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

import Pages.Delivery;
import Pages.Screenshot;


/**
 * @author Teodor
 *		This class is for running Delivery on an assessment with NDA ("Registration form and NDA")
 *		This candidate is not verified in marking it's only verified in the report summary at the end of the assessment
 */


public class C8_DeliveryRFNDA {

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
		driver.get(url+"/delivery/login");
	}
	
	@Test (groups = {"positive"})
	public void C8001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate1", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8001LoginCandidate"})
	public void C8002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentwithNDA();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8002SelectAssessmentandStart"})
	public void C8003ShortAnswer() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswer();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8003ShortAnswer"})
	public void C8004EitherOr() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EitherOr();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8004EitherOr"})
	public void C8005EssayType() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EssayType();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8005EssayType"})
	public void C8006SelectFromList() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromList();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8006SelectFromList"})
	public void C8007MCwithMap() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithMap();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8007MCwithMap"})
	public void C8008Numeric() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Numeric();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8008Numeric"})
	public void C8009Hotspot() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Hotspot();
		Thread.sleep(2000);
//		Assert.assertTrue(delivery.clearhotspotbtn() == 0);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8009Hotspot"})
	public void C8010ExtendedMatch() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ExtendedMatch();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8010ExtendedMatch"})
	public void C8011MCwithYouTube() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithYouTube();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8011MCwithYouTube"})
	public void C8012Order() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Order();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8012Order"})
	public void C8013UploadFile() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.UploadFile();
		Thread.sleep(2000);
		Assert.assertTrue(delivery.uploadedfile() == 1);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8013UploadFile"})
	public void C8014FillTheBlank() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlank();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8014FillTheBlank"})
	public void C8015MultipleChoice() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleChoice();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8015MultipleChoice"})
	public void C8016MultipleResponse() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponse();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8016MultipleResponse"})
	public void C8017Match() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Match();
		delivery.CompleteAssessment();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C8017Match"})
	public void C8018VerifyExamSummary()
	{

		Delivery delivery=new Delivery(driver);
		delivery.VerifyExamSummary();
		
	}
	
	@AfterMethod 
	public void TakeScreenshot(ITestResult result, Method m) throws InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.captureScreenshot(driver, result.getName());
			Delivery delivery=new Delivery(driver);
			delivery.completeassessment(m);
			
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
