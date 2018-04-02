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
 *  answering all the questions 100% incorrect
 */
public class I5_Psychometrics {
	
WebDriver driver;
	
By secondcheckbox=By.xpath("//div[@id='answer-form']/div[2]/div/label");
By thirdcheckbox=By.xpath("//div[@id='answer-form']/div[3]/div/label");
By fourthcheckbox=By.xpath("//div[@id='answer-form']/div[4]/div/label");
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
	public void I5001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate2", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5001LoginCandidate"})
	public void I5002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentPsychometrics();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5002SelectAssessmentandStart"})
	public void I5003EitherOr() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EitherOrPsycho(secondcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5003EitherOr"})
	public void I5004Order() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.OrderPsychoincorrect();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5004Order"})
	public void I5005MultipleResponse() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponsePsycho(thirdcheckbox, fourthcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5005MultipleResponse"})
	public void I5006MultipleChoice() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleChoicePsycho(secondcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5006MultipleChoice"})
	public void I5007FillTheBlank() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlankPsycho("blank 90", "blank 69");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5007FillTheBlank"})
	public void I5008ShortAnswer() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswerPsycho("Getaaa");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5008ShortAnswer"})
	public void I5009SelectFromList() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromListPsycho("distractor 4", "distractor 2");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5009SelectFromList"})
	public void I5010Hotspot() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.HotspotmultiplePsychoIncorrect();
		Thread.sleep(2000);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5010Hotspot"})
	public void I5011Numeric() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.NumericPsycho("69");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5011Numeric"})
	public void I5012MultipleResponsePolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponsePsycho(thirdcheckbox, fourthcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5012MultipleResponsePolytomous"})
	public void I5013SelectFromListPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromListPsycho("distractor 3", "distractor 1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5013SelectFromListPolytomous"})
	public void I5014FillTheBlankPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlankPsycho("blank 90", "blank 69");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5014FillTheBlankPolytomous"})
	public void I5015MatchDichotomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MatchPsycho(choiceoption4, matchoption7, choiceoption5, matchoption6, choiceoption6, matchoption5, choiceoption7, matchoption4);
		
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I5015MatchDichotomous"})
	public void I5016MatchPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MatchPsycho(choiceoption4, matchoption7, choiceoption5, matchoption6, choiceoption6, matchoption5, choiceoption7, matchoption4);
		
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
