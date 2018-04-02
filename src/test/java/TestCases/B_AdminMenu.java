/**
 * 
 */
package TestCases;

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

import Pages.Admin;
import Pages.LoginPage;
import Pages.Screenshot;

/**
 * @author Teodor
 *	This class has TCs that the System Administrator is going to perform
 */


public class B_AdminMenu 
	
	{
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
	public void B001Loginauthor() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teodor", "a");
		Thread.sleep(2000);
		Assert.assertTrue(login.countalertmessage() == 0);

	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B001Loginauthor"}, enabled=true)
	public void B002AddnewUser() throws InterruptedException
	{
		
		Admin admin=new Admin(driver);
		admin.clickadduser();
		admin.fillInNewUserCandidate();

	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B002AddnewUser"}, enabled=true)
	public void B003SearchUser() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.searchuser();
		admin.assertsearcheduser();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B003SearchUser"}, enabled=true)
	public void B004DeleteUser() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.deleteallusers();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B004DeleteUser"}, enabled=true)
	public void B005ImportUsers() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.importusers();
		admin.searchuser();
		admin.assertsearcheduser();
		admin.deleteallusers();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B004DeleteUser"}, enabled=true)
	public void B006EmptyTrashCan() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.emptyTrashCan();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B006EmptyTrashCan"},enabled=true, alwaysRun=true)
	public void B007AddHierarchy() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.addhierarchy();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B007AddHierarchy"}, enabled=true)
	public void B008DeleteHierarchy() throws InterruptedException

	{
		Admin admin=new Admin(driver);
		admin.deletehierarchy();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B008DeleteHierarchy"}, enabled=true, alwaysRun=true)
	public void B009AddQualification() throws InterruptedException

	{
		Admin admin=new Admin(driver);
		admin.addqualification();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B009AddQualification"}, enabled=true)
	public void B010DeleteQualification() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.deletequalification();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B010DeleteQualification"}, enabled=true, alwaysRun=true)
	public void B011AddTerm() throws InterruptedException

	{
		Admin admin=new Admin(driver);
		admin.addterm();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B011AddTerm"}, enabled=true)
	public void B012DeleteTerm() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.deleteterm();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B012DeleteTerm"}, enabled=true)
	public void B013AddNDA() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.addNDA();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B013AddNDA"}, enabled=true)
	public void B014DeleteNDA() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.deleteNDA();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B014DeleteNDA"}, enabled=true)
	public void B015AddRegistrationForm() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.addRegistrationForm();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B015AddRegistrationForm"}, enabled=true)
	public void B016DeleteRegistrationForm() throws InterruptedException

	{
		Admin admin=new Admin(driver);
		admin.deleteRegistrationForm();
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B016DeleteRegistrationForm"}, enabled=true)
	public void B017ImportLO() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.importLO();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"B017ImportLO"}, enabled=true)
	public void B018DeleteLO() throws InterruptedException
	{
		Admin admin=new Admin(driver);
		admin.deleteLO();
		
	}
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot.captureScreenshot(driver, result.getName());
		}
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
	

