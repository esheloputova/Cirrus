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
 *	This class has TCs that the author is going to perform in Library
 */
public class E_Library {
	
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
	
	@Test (groups = {"positive"}, enabled=true)
	public void E001LoginAssessor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"E001LoginAssessor"}, enabled=true)
	public void E002AddCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.addCollection("Teos automated test collection");
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E003AddMCquestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.addMCquestionDetails();
		library.selectCorrectAnswer();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E004AddMultipleResponseQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.addMultipleResponseQuestionDetails();
		library.scoringDichotomous();
		library.selectCorrectAnswers();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E005AddEitherOrQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addEitherOrQuestionDetails();
		library.selectCorrectAnswer();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E006AddNumericQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addNumericQuestionDetails();
		library.selectQuestionStatus("Live");
//		library.selectLearningObjective();
//		library.selectItemPurpose();
//		library.selectTaxonomy();
		library.addScoreAndSave("13");
		Thread.sleep(2000);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E007AddSelectFromListQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addSelectFromListQuestionDetails("This is a Select from list type of question. Select distractor 5.");
		library.scoringDichotomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E008AddFillInTheBlankQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addFillInTheBlankQuestionDetails("This is a Fill in the blank type of question. Dichotmous");
		library.scoringDichotomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E009AddOrderQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addOrderQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E010AddMatchQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addMatchQuestionDetails("This is a Match question Dichotomous");
		library.scoringDichotomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E011AddHotspotQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addHotspotQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E013AddShortAnswerQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addShortAnserQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E014AddEssayQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addEssayQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E015AddFileResponseQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addFileResponseQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("13");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E016AddSection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionAT();
		library.addSectionDetails();
		library.selectQuestionStatus("Live");
		library.save();
		Thread.sleep(2000);
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E002AddCollection"}, enabled=true)
	public void E017ImportFromAnotherCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.importFromACollection();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E017ImportFromAnotherCollection"}, enabled=true)
	public void E018ImportFromIMSQTI() throws InterruptedException
	{
		Library library=new Library(driver);
		library.importFromIMSQTI();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E018ImportFromIMSQTI"}, enabled=true)
	public void E019ImportFromExcel() throws InterruptedException
	{
		Library library=new Library(driver);
		library.importFromExcel();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E019ImportFromExcel"}, enabled=true)
	public void E020ImportMoodle() throws InterruptedException
	{
		Library library=new Library(driver);
		library.importMoodle();
		
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
		driver.quit();
	}
	
}
