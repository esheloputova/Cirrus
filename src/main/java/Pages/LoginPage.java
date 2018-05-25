/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author Teodor
 * This class will store all the locators and methods of login page
 */
public class LoginPage {
	
	WebDriver driver;
	
	
	By username=By.xpath("//input[@id='login']");
	By password=By.xpath("//input[@id='view_password']");
//	By password=By.id("view_password");
	By loginButton=By.xpath("//button[@class='btn btn-green-filled submitButton']");
	By errormessage=By.xpath("//span[@class='has-error']");
	By version=By.xpath("//label[@class='version']");
	
	
	
	public LoginPage(WebDriver driver)
	{
		this. driver=driver;
		
	}

	private void waitforelementandclick(By element)
    {
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
		    myDynamicElement.click(); 
    }

	public void loginauthor(String userid, String pass)
	{

		waitforelementandclick(username);
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
			
	}

	public void verifyErrorMessage()
	{
		WebElement element = driver.findElement(errormessage);
		String strng = element.getText();
		Assert.assertEquals(strng, "Invalid username or password.");
		
	}
	
	public Integer countalertmessage()
	{
		Number countalertmessage;
		countalertmessage= driver.findElements(errormessage).size();
		return countalertmessage.intValue();
		//Assert.assertTrue(countalertmessage() > 0);
	}
}
