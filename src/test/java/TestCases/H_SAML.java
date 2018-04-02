/**
 * 
 */
package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Pages.Praktijkleren;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs for SAML SSO test script
 *	Specifications can be find at Google Drive\Cirrus Product Information\Quality Assurance\Automated\H_SAML.pdf
 */
public class H_SAML {
	
WebDriver driver;
	
	
	
	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String browserName)
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
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H001scenario01() //Authenticate first – as a student
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateAsStudent("praktijkleren@cirrusplatform.com", "Welkom123!");
		
	}

	@Test (groups = {"positive"}, enabled=true)
	public void H002scenario02() //Authenticate last – as a student
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateLast("praktijkleren@cirrusplatform.com", "Welkom123!");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H003scenario03() //Authenticating first - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateAsTeacher("author@cirrusplatform.com", "Welkom123!");
		praktijkleren.verifyLoggedUser("Author Testuser");
		
	}

	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario04() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("author@cirrusplatform.com", "Welkom123!");
		praktijkleren.verifyLoggedUser("Author Testuser");
	}
	

	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario05() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_docent@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Docent Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario06() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_bureauredacteur@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Bureauredacteur Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario07() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_constructeur@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Constructeur Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario08() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_kernconstructeur@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Kernconstructeur Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario09() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_planner@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Planner Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario10() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_opco@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Opco Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario11() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_screener@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Screener Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario12() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_surveillant@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Surveillant Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario13() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_beoordelaar@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Surveillant/Beoordelaar Test");
	}
	
	@Test (groups = {"positive"}, enabled=true)
	public void H004scenario14() //Authenticating last - as a teacher
	{
		
		Praktijkleren praktijkleren=new Praktijkleren(driver);
		praktijkleren.authenticateTeacherLast("cirrus_vaststeller@stichtingpraktijkleren.nl", "Welcome_062317");
		praktijkleren.verifyLoggedUser("Cirrus Vaststeller Test");
	}
	
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.captureScreenshot(driver, result.getName());
		}
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
