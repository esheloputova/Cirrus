/**
 * 
 */
package TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
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
import Pages.Library;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs that are going to take the exam created in I_Psychometrics 
 *  answering all the questions 100% correct
 */
public class I4_Psychometrics {
	
WebDriver driver;
	
By firstcheckbox=By.xpath("//div[@id='answer-form']/div[1]/div/label");
By secondcheckbox=By.xpath("//div[@id='answer-form']/div[2]/div/label");
By choiceoption4=By.xpath("//div[contains(text(), 'dog')]");
By matchoption4=By.xpath("//div[contains(text(), 'pet')]/../div[3]");
By choiceoption5=By.xpath("//div[contains(text(), 'family')]");
By matchoption5=By.xpath("//div[contains(text(), 'home')]/../div[3]");
By choiceoption6=By.xpath("//div[contains(text(), 'driver')]");
By matchoption6=By.xpath("//div[contains(text(), 'car')]/../div[3]");
By choiceoption7=By.xpath("//div[contains(text(), 'trees')]");
By matchoption7=By.xpath("//div[contains(text(), 'park')]/../div[3]");
	
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
	public void I4001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate1", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4001LoginCandidate"})
	public void I4002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentPsychometrics();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4002SelectAssessmentandStart"})
	public void I4003EitherOr() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EitherOrPsycho(firstcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4003EitherOr"})
	public void I4004Order() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.OrderPsycho();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4004Order"})
	public void I4005MultipleResponse() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponsePsycho(firstcheckbox, secondcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4005MultipleResponse"})
	public void I4006MultipleChoice() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleChoicePsycho(firstcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4006MultipleChoice"})
	public void I4007FillTheBlank() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlankPsycho("blank 6", "blank 1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4007FillTheBlank"})
	public void I4008ShortAnswer() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswerPsycho("Geta");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4008ShortAnswer"})
	public void I4009SelectFromList() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromListPsycho("distractor 5", "distractor 6");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4009SelectFromList"})
	public void I4010Hotspot() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.HotspotmultiplePsycho();
		Thread.sleep(2000);
//		Assert.assertTrue(delivery.clearhotspotbtn() == 0);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4010Hotspot"})
	public void I4011Numeric() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.NumericPsycho("60");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4011Numeric"})
	public void I4012MultipleResponsePolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponsePsycho(firstcheckbox, secondcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4012MultipleResponsePolytomous"})
	public void I4013SelectFromListPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromListPsycho("distractor 5", "distractor 6");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4013SelectFromListPolytomous"})
	public void I4014FillTheBlankPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlankPsycho("blank 4", "blank 3");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4014FillTheBlankPolytomous"})
	public void I4015MatchDichotomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		//correct answer
		delivery.MatchPsycho(choiceoption4, matchoption4, choiceoption5, matchoption5, choiceoption6, matchoption6, choiceoption7, matchoption7);
		
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I4015MatchDichotomous"})
	public void I4016MatchPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		//correct answer
		delivery.MatchPsycho(choiceoption4, matchoption4, choiceoption5, matchoption5, choiceoption6, matchoption6, choiceoption7, matchoption7);
		
	}
	
	@AfterMethod
	public void IfFail(ITestResult result, Method m) throws InterruptedException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.captureScreenshot(driver, result.getName());
			Library library=new Library(driver);
			library.deleteCollectionIfFail(m);
			
		}
	}
	
	@AfterClass
	public void tearDown()
	{
//		driver.quit();
	}
	
}
