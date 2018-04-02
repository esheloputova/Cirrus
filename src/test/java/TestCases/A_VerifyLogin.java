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
import Pages.Screenshot;

/**
 * @author Teodor
 *
 */
public class A_VerifyLogin 
{
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
		System.setProperty("webdriver.ie.driver", "./Browsers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.get(url+"/author/login");
	}	
	
	//1. Login does not work when using an invalid user name and invalid password
	@Test (groups = {"negative"}, enabled=true)
	public void verifyInvalidLogin1() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor1", "Cirrus2015!1");
//		login.loginauthor("teo_candidate6", "testa");
		Thread.sleep(1000);
		Assert.assertTrue(login.countalertmessage() > 0);
		
	}
	
	//2. Login does not work when using an invalid user name and correct password	
	@Test (groups = {"negative"}, dependsOnMethods = {"verifyInvalidLogin1"}, alwaysRun=true)
	public void verifyInvalidLogin2() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		driver.navigate().refresh();
		login.loginauthor("teo_assessor1", "Cirrus2015!");
		Thread.sleep(1000);
		Assert.assertTrue(login.countalertmessage() > 0);
		
	}
	//3. Login does not work when using an correct user name and invalid password
	@Test (groups = {"negative"}, dependsOnMethods = {"verifyInvalidLogin2"}, alwaysRun=true)
	public void verifyInvalidLogin3() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		driver.navigate().refresh();
		login.loginauthor("teo_assessor", "Cirrus2015!1");
		Thread.sleep(1000);
		login.verifyErrorMessage();
	
	}
	//4. Login does not work when using no user name and no pin
	@Test (groups = {"negative"}, dependsOnMethods = {"verifyInvalidLogin3"}, alwaysRun=true)
	public void verifyInvalidLogin4() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		driver.navigate().refresh();
		login.loginauthor("", "");
		Thread.sleep(1000);
		Assert.assertTrue(login.countalertmessage() > 0);
		
	}
	
	//5. Login works with correct user name and correct pin
	@Test (groups = {"positive"}, dependsOnMethods = {"verifyInvalidLogin4"}, alwaysRun=true)
	public void verifyValidLoginauthor() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		driver.navigate().refresh();
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	
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