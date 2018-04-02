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
import Pages.Marking;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs that the Marker is going to perform to verify C3_Delivery, C4_Delivery and C5_Delivery (results are saved when time expires, browser is closed, normal finish)
 */
public class D2_Marking {
	
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
	
	@Test (groups = {"positive"}, enabled=true, priority=0)
	public void D2001LoginMarker() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"D2001LoginMarker"}, enabled=true, priority=1)
	public void D2002ScoreAssessment() throws InterruptedException
	{
		
		Marking marking=new Marking(driver);
		marking.scoreAssessmentLimitedTime();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"D2002ScoreAssessment"}, enabled=true, priority=2)
	public void D2003VerifyExamSummary() throws InterruptedException
	{
		Marking marking=new Marking(driver);
		marking.VerifyExamSummary2();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"D2001LoginMarker"}, enabled=true, priority=3)
	public void D2004ScoreAssessment2() throws InterruptedException
	{
		Marking marking=new Marking(driver);
		marking.scoreAssessmentLimitedTime3();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"D2004ScoreAssessment2"}, enabled=true, priority=4)
	public void D2005VerifyExamSummary() throws InterruptedException
	{
		Marking marking=new Marking(driver);
		marking.VerifyExamSummary2();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"D2001LoginMarker"}, enabled=true, priority=5)
	public void D2006ScoreAssessment3() throws InterruptedException
	{
		Marking marking=new Marking(driver);
		marking.scoreAssessmentLimitedTime2();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"D2006ScoreAssessment3"}, enabled=true, priority=6)
	public void D2007VerifyExamSummary() throws InterruptedException
	{
		Marking marking=new Marking(driver);
		marking.VerifyExamSummary2();
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
