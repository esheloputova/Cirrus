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


import Pages.Delivery;
import Pages.Screenshot;

/**
 * @author Teodor
 *		This class if for running single TC
 */

public class Exam_for_Jeremy {

	
	
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
	public void C2001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("candidate-121", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
		
	@Test (groups = {"positive"}, dependsOnMethods = {"C2001LoginCandidate"})
	public void C2002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentUniversal("E-ATP Quiz");
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"C2002SelectAssessmentandStart"})
	public void C2003MC1() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MC1();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C2003MC1"})
	public void C2004MC2() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MC1();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C2004MC2"})
	public void C2005MC3() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MC1();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C2005MC3"})
	public void C2006MC4() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MC1();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C2006MC4"})
	public void C2012MC10() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MC2();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C2012MC10"})
	public void C2013Complete() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.CompleteAssessment();
		
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
