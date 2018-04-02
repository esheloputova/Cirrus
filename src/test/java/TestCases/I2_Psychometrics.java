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
 *	This class has TCs that are going to to create questions in Psychometrics2, mixed dichotomous and polytomous
 */
public class I2_Psychometrics {
	
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
	public void I201LoginAssessor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"I201LoginAssessor"}, enabled=true)
	public void I202AddCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.addCollection("Psychometrics2");
	}

	@Test (groups = {"positive"}, dependsOnMethods = {"I202AddCollection"}, enabled=true)
	public void I203AddMatchQuestionPolytomous() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics2();
		library.addMatchQuestionDetails("This is a Match question Polytomous");
		library.scoringPolytomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I202AddCollection"}, enabled=true)
	public void I204AddMatchQuestionDichotomous() throws InterruptedException 
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics2();
		library.addMatchQuestionDetails("This is a Match question Dichotomous");
		library.scoringDichotomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	/*@Test (groups = {"positive"}, dependsOnMethods = {"I002AddCollection"}, enabled=true)
	public void I013AddExtendedMatchQuestion()
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics();
		library.addExtendedMatchQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}*/
	
	
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I202AddCollection"}, enabled=true)
	public void I205AddNumericQuestion()  
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics2();
		library.addNumericQuestionDetails();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I202AddCollection"}, enabled=true)
	public void I206AddMultipleResponseQuestionPolytomous() 
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics2();
		library.addMRforPsychometrics("This is a multiple response question Polytomous");
		library.scoringPolytomous();
		library.selectCorrectAnswers();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I202AddCollection"}, enabled=true)
	public void I207AddSelectFromListQuestionPolytomous() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics2();
		library.addSelectFromListQuestionDetails("This is a Select from list type of question. Select distractor 5 and distractor 6. Polytomous");
		library.scoringPolytomous();
		library.selectQuestionStatus("Live");
		library.selectLearningObjective();
		library.selectItemPurpose();
		library.selectTaxonomy();
		library.addScoreAndSave("1");
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"I207AddSelectFromListQuestionPolytomous"}, enabled=true)
	public void I208AddFillInTheBlankQuestion() throws InterruptedException
	{
		Library library=new Library(driver);
		library.goToCollectionPsychometrics2();
		library.addFillInTheBlankQuestionDetails("This is a Fill in the blank type of question. Polytomous");
		library.scoringPolytomous();
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
