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
 *  answering partly correct to Polytomous questions.
 */
public class I6_Psychometrics {
	
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
	public void I6001LoginCandidate() throws InterruptedException
	{
		
		Delivery delivery=new Delivery(driver);
		delivery.logincandidate("teo_candidate3", "a");
		Thread.sleep(1000);
		Assert.assertTrue(delivery.countalertmessage() == 0);
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6001LoginCandidate"})
	public void I6002SelectAssessmentandStart() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.selectassessmentPsychometrics();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6002SelectAssessmentandStart"})
	public void I6003EitherOr() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.EitherOrPsycho(secondcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6003EitherOr"})
	public void I6004Order() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.OrderPsychoincorrect();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6004Order"})
	public void I6005MultipleResponse() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponsePsycho(secondcheckbox, fourthcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6005MultipleResponse"})
	public void I6006MultipleChoice() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleChoicePsycho(secondcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6006MultipleChoice"})
	public void I6007FillTheBlank() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlankPsycho("blank 90", "blank 69");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6007FillTheBlank"})
	public void I6008ShortAnswer() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.ShortAnswerPsycho("Getaaa");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6008ShortAnswer"})
	public void I6009SelectFromList() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromListPsycho("distractor 5", "distractor 1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6009SelectFromList"})
	public void I6010Hotspot() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.HotspotmultiplePsychoIncorrect();
		Thread.sleep(2000);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6010Hotspot"})
	public void I6011Numeric() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.NumericPsycho("69");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6011Numeric"})
	public void I6012MultipleResponsePolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MultipleResponsePsycho(secondcheckbox, fourthcheckbox);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6012MultipleResponsePolytomous"})
	public void I6013SelectFromListPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.SelectFromListPsycho("distractor 5", "distractor 1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6013SelectFromListPolytomous"})
	public void I6014FillTheBlankPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.FillTheBlankPsycho("blank 6", "blank 69");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6014FillTheBlankPolytomous"})
	public void I6015MatchDichotomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MatchPsycho(choiceoption4, matchoption7, choiceoption5, matchoption5, choiceoption6, matchoption6, choiceoption7, matchoption4);
		
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I6015MatchDichotomous"})
	public void I6016MatchPolytomous() throws InterruptedException
	{
		Delivery delivery=new Delivery(driver);
		delivery.MatchPsycho(choiceoption4, matchoption7, choiceoption5, matchoption5, choiceoption6, matchoption6, choiceoption7, matchoption4);
		
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
