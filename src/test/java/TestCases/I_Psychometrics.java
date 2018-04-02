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

import Pages.LoginPage;
import Pages.Library;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs that are going to create questions in Psychometrics only Dichotomous
 */
public class I_Psychometrics {
	
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

	}
	else if(browserName.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver", "./Browsers/IEDriverServer32.exe");
		driver = new InternetExplorerDriver();
	}
		driver.manage().window().maximize();
		driver.get(url+"/author/login");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void I001LoginAssessor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"I001LoginAssessor"}, enabled=true)
	public void I002AddCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.addCollection("Psychometrics");
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I003AddMCquestion() 
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addMCforPsychometrics();
		library.selectCorrectAnswer();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I004AddMultipleResponseQuestion() 
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addMRforPsychometrics("This is a multiple response question Dichotomous");
		library.scoringDichotomous();
		library.selectCorrectAnswers();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I005AddEitherOrQuestion() 
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addEitherOrQuestionDetails();
		library.selectCorrectAnswer();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I006AddShortAnswerQuestion() 
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addShortAnserQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I007AddSelectFromListQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addSelectFromListQuestionDetails("This is a Select from list type of question. Select distractor 5 and distractor 6. Dichotomous");
		library.scoringDichotomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I008AddFillInTheBlankQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addFillInTheBlankQuestionDetails("This is a Fill in the blank type of question. Dichotomous");
		library.scoringDichotomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I009AddOrderQuestion() 
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addOrderForPsychometrics();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");

	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I010AddHotspotQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addHotspotQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
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
