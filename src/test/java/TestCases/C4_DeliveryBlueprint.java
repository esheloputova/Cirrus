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
 *		This class is for running Delivery with an assessment with limited time ("Blueprint") and time runs out (without user closing the browser)
 */

public class C4_DeliveryBlueprint {

	
	
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
	public void C4001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate3", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
		
	@Test (groups = {"positive"}, dependsOnMethods = {"C4001LoginCandidate"})
	public void C4002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentBlueprint();
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"C4002SelectAssessmentandStart"})
	public void C4003EnterPin() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.enterPin();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C4003EnterPin"})
	public void C4004HotspotMultiple() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Hotspotmultiple();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C4004HotspotMultiple"})
	public void C4005NumericWithRange() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.NumericWithRange();
		
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"C4005NumericWithRange"})
	public void C4006EssayWithCKEditor() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EssayTypeWithCKEditor();
		
		
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
//			driver.quit();
		}
	
	
}
