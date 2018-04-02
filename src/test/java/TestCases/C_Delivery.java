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
 *		This class is for running Delivery with all types of questions. ("Automated test")
 */


public class C_Delivery {

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
		delivery.logincandidate("teo_candidate1", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C001LoginCandidate"})
	public void C002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentAutomatedtest();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C002SelectAssessmentandStart"})
	public void C003ShortAnswer() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswer();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C003ShortAnswer"})
	public void C004EitherOr() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EitherOr();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C004EitherOr"})
	public void C005EssayType() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EssayType();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C005EssayType"})
	public void C006SelectFromList() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromList();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C006SelectFromList"})
	public void C007MCwithMap() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithMap();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C007MCwithMap"})
	public void C008Numeric() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Numeric();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C008Numeric"})
	public void C009Hotspot() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Hotspot();
		Thread.sleep(2000);
//		Assert.assertTrue(delivery.clearhotspotbtn() == 0);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C009Hotspot"})
	public void C010ExtendedMatch() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ExtendedMatch();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C010ExtendedMatch"})
	public void C011MCwithYouTube() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithYouTube();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C011MCwithYouTube"})
	public void C012Order() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Order();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C012Order"})
	public void C013UploadFile() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.UploadFile();
		Thread.sleep(2000);
		Assert.assertTrue(delivery.uploadedfile() == 1);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C013UploadFile"})
	public void C014FillTheBlank() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlank();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C014FillTheBlank"})
	public void C015MultipleChoice() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleChoice();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C015MultipleChoice"})
	public void C016MultipleResponse() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponse();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C016MultipleResponse"})
	public void C017Match() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Match();
		delivery.CompleteAssessment();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C017Match"})
	public void C018VerifyExamSummary() throws InterruptedException
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
