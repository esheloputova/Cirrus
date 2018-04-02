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
public class E2_Library {
	
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

	
	
	@Test (groups = {"positive"}, enabled=true)
	public void E020CreateCopy() throws InterruptedException
	{
		Library library=new Library(driver);
		library.createCopy();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E020CreateCopy"}, enabled=true)
	public void E021DeleteItem() throws InterruptedException
	{
		Library library=new Library(driver);
		library.deleteItem();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E021DeleteItem"}, enabled=true)
	public void E022ApplyLabel() throws InterruptedException
	{
		Library library=new Library(driver);
		library.applyLabel();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E022ApplyLabel"}, enabled=true)
	public void E023ArchiveCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.archiveCollection();
			
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E023ArchiveCollection"}, enabled=true)
	public void E024UnarchiveCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.unarchiveCollection();
			
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E024UnarchiveCollection"}, enabled=true)
	public void E025ShareCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.shareCollection();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E025ShareCollection"}, enabled=true)
	public void E026UnshareCollection() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_author", "a");
		Thread.sleep(4000);
		Assert.assertTrue(login.countalertmessage() == 0);
		Library library=new Library(driver);
		library.removeSharedCollection();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E026UnshareCollection"}, enabled=false)
	public void E027ArchiveItem() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(4000);
		Assert.assertTrue(login.countalertmessage() == 0);
		Library library=new Library(driver);
		library.archiveItem();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E027ArchiveItem"}, enabled=false)
	public void E028UnarchiveItem() throws InterruptedException
	{
		
		Library library=new Library(driver);
		library.unarchiveItem();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E026UnshareCollection"}, enabled=true)
	public void E029ApplyLabelItems() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		login.loginauthor("teo_assessor", "a");
		Thread.sleep(4000);
		Assert.assertTrue(login.countalertmessage() == 0);
		Library library=new Library(driver);
		library.applyLabelItems();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E029ApplyLabelItems"}, enabled=false)
	public void E030DeleteAllFromItems() throws InterruptedException
	{
		Library library=new Library(driver);
		library.deleteAllFromItems();
		
	}
	
	@Test (groups = {"positive"}, dependsOnMethods = {"E029ApplyLabelItems"}, enabled=true)
	public void E031DeleteCollection() throws InterruptedException
	{
		Library library=new Library(driver);
		library.deleteCollection();
		
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
