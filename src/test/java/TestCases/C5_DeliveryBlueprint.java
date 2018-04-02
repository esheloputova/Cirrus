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
 *		This class is for running Delivery with an assessment ("Blueprint") with limited time and user properly finishes the assessment
 */

public class C5_DeliveryBlueprint {

	
	
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
	public void C5001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate1", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
		
	@Test (groups = {"positive"}, dependsOnMethods = {"C5001LoginCandidate"})
	public void C5002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentBlueprint();
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"C5002SelectAssessmentandStart"})
	public void C5003EnterPin() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.enterPin();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C5003EnterPin"})
	public void C5004HotspotMultiple() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Hotspotmultiple();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C5004HotspotMultiple"})
	public void C5005NumericWithRange() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.NumericWithRange();
		
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"C5005NumericWithRange"})
	public void C5006EssayWithCKEditor() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EssayTypeWithCKEditor();
		delivery.CompleteAssessment();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C5006EssayWithCKEditor"})
	public void C5007VerifyExamSummary() throws InterruptedException
	{
//		Thread.sleep(5000);
		Delivery delivery=new Delivery(driver);
		delivery.VerifyExamSummary2();
		
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
