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
 *		This class is for running Delivery with all types of questions but spending more than 5 minutes on the essay question
 */


public class C6_DeliveryLongTime {

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
	public void C6001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate2", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6001LoginCandidate"})
	public void C6002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentAutomatedtest();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6002SelectAssessmentandStart"})
	public void C6003ShortAnswer() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswer();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6003ShortAnswer"})
	public void C6004EitherOr() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EitherOr();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6004EitherOr"})
	public void C6005EssayTypeLong() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EssayTypeLong();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6005EssayTypeLong"})
	public void C6006SelectFromList() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromList();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6006SelectFromList"})
	public void C6007MCwithMap() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithMap();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6007MCwithMap"})
	public void C6008Numeric() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Numeric();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6008Numeric"})
	public void C6009Hotspot() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Hotspot();
		Thread.sleep(2000);
//		Assert.assertTrue(delivery.clearhotspotbtn() == 0);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6009Hotspot"})
	public void C6010ExtendedMatch() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ExtendedMatch();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6010ExtendedMatch"})
	public void C6011MCwithYouTube() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithYouTube();
		
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6011MCwithYouTube"})
	public void C6012Order() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Order();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6012Order"})
	public void C6013UploadFile() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.UploadFile();
		Thread.sleep(2000);
		Assert.assertTrue(delivery.uploadedfile() == 1);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6013UploadFile"})
	public void C6014FillTheBlank() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlank();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6014FillTheBlank"})
	public void C6015MultipleChoice() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleChoice();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6015MultipleChoice"})
	public void C6016MultipleResponse() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponse();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6016MultipleResponse"})
	public void C6017Match() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.Match();
		delivery.CompleteAssessment();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C6017Match"})
	public void C6018VerifyExamSummary() throws InterruptedException
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
