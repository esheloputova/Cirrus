package Pages;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Praktijkleren {

WebDriver driver;

//	By inloggen=By.xpath("//div[@class='button spl-button']/div[2]");
//	By inloggen=By.xpath("//div[contains(text(), 'Praktijkeren account')]/../div[2]");
	By inloggen=By.xpath("//span[contains(text(), 'via Praktijkleren')]/../span[2]");
	By username=By.xpath("//input[@id='user']");
	By password=By.xpath("//input[@id='pass']");
	By loginButton=By.xpath("//input[@value='Inloggen']");
	By gaNaarCirrus=By.xpath("//a[@title='Ga naar Cirrus']");
	By gaNaarCirrusauthor=By.xpath("//a[@title='Naar de auteursomgeving van Cirrus']");
	By gebruikerid=By.xpath("//div[@class='name']/span");
	By gebruikeridlabel=By.xpath("//div[@class='form-group form-candidate-id']/label");
	By usermenu=By.xpath("//div[@class='name']/span");
	

	public Praktijkleren(WebDriver driver)
	{
		this. driver=driver;
	}
	
	
	
    private void waitforelementandclick(By element)
    {
		WebElement myDynamicElement = (new WebDriverWait(driver, 15))
		        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
		    myDynamicElement.click(); 
    }
	
    private void waitforelementtext(By element, String text)
    {
		WebDriverWait wait = new WebDriverWait(driver, 15);
	      wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));        
	}

	
	public void authenticateAsStudent(String userid, String pass) 
	{
			driver.get("http://www.stichtingpraktijkleren.nl/inloggen/mijn-account/beheer/cirrus-assistent/");
			waitforelementandclick(inloggen);
			waitforelementandclick(username);
			driver.findElement(username).sendKeys(userid);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(loginButton).click();
			waitforelementandclick(gaNaarCirrus);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    waitforelementtext(gebruikerid, "Cirrus Teststudent");
//			Assert.assertEquals(driver.findElement(gebruikerid).getAttribute("value"), "Cirrus Teststudent", "Incorrect user id");
			
				
	}
	
	public void authenticateLast(String userid, String pass)
	{
			driver.get("https://saml.cirrusplatform.com/saml2/praktijkleren/www-platform/Login.ashx?return_url=delivery/app");
			waitforelementandclick(inloggen);
			waitforelementandclick(username);
			driver.findElement(username).sendKeys(userid);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(loginButton).click();
			waitforelementtext(gebruikerid, "Cirrus Teststudent");
//			Assert.assertEquals(driver.findElement(gebruikerid).getAttribute("value"), "Cirrus Teststudent", "Incorrect user id");
				
	}
	
	public void authenticateAsTeacher(String userid, String pass)
	{
			driver.get("http://www.stichtingpraktijkleren.nl/inloggen/mijn-account/beheer/cirrus-assistent/");
			waitforelementandclick(inloggen);
			waitforelementandclick(username);
			driver.findElement(username).sendKeys(userid);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(loginButton).click();
			waitforelementandclick(gaNaarCirrusauthor);
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    
			
				
	}
	
	public void authenticateTeacherLast(String userid, String pass)
	{
			driver.get("https://saml.cirrusplatform.com/saml2/praktijkleren/www-platform/Login.ashx?return_url=author/app");
			waitforelementandclick(inloggen);
			waitforelementandclick(username);
			driver.findElement(username).sendKeys(userid);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(loginButton).click();
//			waitforelementandclick(usermenu);
//			Assert.assertEquals(driver.findElement(usermenu).getText(), "Author Testuser", "Incorrect user");
				
	}
	
	public void verifyLoggedUser(String loggedUser)
	{
			
			waitforelementandclick(usermenu);
			Assert.assertEquals(driver.findElement(usermenu).getText(), loggedUser, "Incorrect user");
			
	}
	
}
