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

public class T101RunaTC {

	
	
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
	public void C001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate2", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
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
//			driver.quit();
		}
	
	
}
