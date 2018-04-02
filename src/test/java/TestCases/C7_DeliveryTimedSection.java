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
 *		This class is for running Delivery with Timed Section and all types of questions ("Automated test w TS")
 */


public class C7_DeliveryTimedSection {

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
	public void C7001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate5", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7001LoginCandidate"})
	public void C7002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentAutomatedtestWithTS();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7002SelectAssessmentandStart"})
	public void C7003EitherOr() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EitherOrTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7003EitherOr"})
	public void C7004SelectFromList() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromListTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7004SelectFromList"})
	public void C7005ShortAnswer() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswerTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7005ShortAnswer"})
	public void C7006Essay() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EssayTypeTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7006Essay"})
	public void C7007MCwithMap() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithMapTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7007MCwithMap"})
	public void C7008Numeric() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.NumericTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7008Numeric"})
	public void C7009Hotspot() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.HotspotTS();
		Thread.sleep(2000);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7009Hotspot"})
	public void C7010ExtendedMatch() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ExtendedMatchTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7010ExtendedMatch"})
	public void C7011MCwithYouTube() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MCwithYouTubeTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7011MCwithYouTube"})
	public void C7012Order() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.OrderTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7012Order"})
	public void C7013UploadFile() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.UploadFileTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7013UploadFile"})
	public void C7014FillTheBlank() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlankTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7014FillTheBlank"})
	public void C7015MultipleChoice() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleChoiceTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7015MultipleChoice"})
	public void C7016MultipleResponse() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponseTS();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7016MultipleResponse"})
	public void C7017Match() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MatchTS();	
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7017Match"})
	public void C7018VerifyTimedSection() throws InterruptedException
	{

		Delivery delivery=new Delivery(driver);
		delivery.VerifyTimedSection();
		delivery.CompleteAssessment();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"C7018VerifyTimedSection"})
	public void C7019VerifyExamSummary() throws InterruptedException
	{

		Delivery delivery=new Delivery(driver);
		delivery.VerifyTSExamSummary();
		
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
