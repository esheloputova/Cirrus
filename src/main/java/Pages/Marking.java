/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author Teodor
 * This class will store all the locators and methods for Delivery
 */
public class Marking {
	
	WebDriver driver;

	By markingmenu=By.xpath("//a[@title='Marking']");
	By tobeassessed=By.xpath("//a[contains(text(), 'Assess')]");
	By automatedtest=By.xpath("//div[contains(text(), 'code_1')]/../div[1]/a");
//	By automatedtest=By.xpath("//div[@id='react-content-region']/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[2]/div[1]/a");
//	By blueprinttest=By.xpath("//div[@id='react-content-region']/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/a");
	By blueprinttest=By.xpath("//div[contains(text(), 'code_2')]/../div[1]/a");
	By teocandidate1=By.xpath("//div[contains(text(), 'Teo Candidate1')]/../div[10]/a");
//	By teocandidate1=By.xpath("//div[contains(text(), 'Teo Candidate1')]/../div[8]/a");
	By teocandidate2=By.xpath("//div[contains(text(), 'Teo Candidate2')]/../div[10]/a");
	By teocandidate3=By.xpath("//div[contains(text(), 'Teo Candidate3')]/../div[10]/a");
//	By teocandidate2=By.xpath("//div[contains(text(), 'Teo Candidate2')]/../div[8]/a");
//	By teocandidate3=By.xpath("//div[contains(text(), 'Teo Candidate3')]/../div[8]/a");
	By statuscolumn1=By.xpath("//div[@class='listView_itemsContainer']/div[1]/div[9]/span");
	By statuscolumn2=By.xpath("//div[@class='listView_itemsContainer']/div[2]/div[9]/span");
	By statuscolumn3=By.xpath("//div[@class='listView_itemsContainer']/div[3]/div[9]/span");
	/*By statuscolumn1=By.xpath("//div[@class='listView_itemsContainer']/div[1]/div[7]/span");
	By statuscolumn2=By.xpath("//div[@class='listView_itemsContainer']/div[2]/div[7]/span");
	By statuscolumn3=By.xpath("//div[@class='listView_itemsContainer']/div[3]/div[7]/span");*/
	By scoreitembtn=By.xpath("//div[@class='listView_itemsContainer']/a[3]/div[3]/div/a");
	By essaytext=By.xpath("//div[@id='mt-text']");
	By score=By.xpath("//input[@class='form-control']");
	By saveandnextqbtn=By.xpath("//a[contains(text(), 'Save and next question')]");
	By saveandnextcand=By.xpath("//a[contains(text(), 'Save and next candidate')]");
	By cancelbtn=By.xpath("//a[contains(text(), 'Cancel')]");
//	By cancelbtn2=By.xpath("//a[@class='btn btn-link'][3]");
	By savebtn=By.xpath("//a[@class='btn btn-green-filled medium']");
	By popupconfsave=By.xpath("//strong[@class='mr5']");
	By attachment=By.xpath("//a[@class='alert-link']");
//	By scorewidget=By.xpath("//div[@id='evaluation-infoboxes']/div/div/div[1]/div/div[1]");
	By scorewidget=By.xpath("//div[@data-region='top-info']/div/div/div/div[1]/div/div[1]");
	By totalscore3=By.xpath("//div[@class='listView_itemsContainer']/a[3]/div[3]/div");
	By totalscore11=By.xpath("//div[@class='listView_itemsContainer']/a[11]/div[3]/div");
	By dashusername=By.xpath("//span[@class='username']");
	

	public Marking(WebDriver driver)
	{
		this. driver=driver;
	}
	
	private void waitforelementandclick(By element)
    {
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
		    myDynamicElement.click(); 
    }
	
	private void waitforelement(By element)
    {
		(new WebDriverWait(driver, 10))
		        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
		    ; 
    }
	
	private void waitforelementtext(By element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));        
					}
	
	
	
	public void scoreAssessmentAllTypes() throws InterruptedException
	{
		waitforelementandclick(markingmenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(tobeassessed);
		Thread.sleep(3000);
		waitforelementandclick(automatedtest);
		Thread.sleep(5000);
		waitforelementandclick(teocandidate1);
		Thread.sleep(5000);
		waitforelementandclick(scoreitembtn);
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(essaytext).getText(), "Summer vacation (also called summer holiday or summer break) is a school holiday in summer between school years and the longest break in the school year. Students and instructors are off school typically between 6 and 14 weeks, depending on the country and district. In America, Ireland, Italy, Greece, Lithuania and Russia, summer holidays are normally three months, compared to six to eight weeks in Australia, Britain, The Netherlands, Canada, and Germany.");
		waitforelementandclick(score);
		driver.findElement(score).clear();
		driver.findElement(score).sendKeys("8");
		driver.findElement(saveandnextqbtn).click();
		driver.findElement(popupconfsave).click();
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!"); 
	    Assert.assertEquals(driver.findElement(attachment).getText(), "download.jpg");
		waitforelementandclick(score);
		driver.findElement(score).clear();
		driver.findElement(score).sendKeys("7");
		driver.findElement(saveandnextqbtn).click();
		driver.findElement(popupconfsave).click();
		/*driver.findElement(savebtn).click();
		driver.findElement(popupconfsave).click();
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!");*/
		driver.findElement(cancelbtn).click();
		
		}
	
	public void scoreAssessmentAllTypesLong() throws InterruptedException
	{
		waitforelementandclick(markingmenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(tobeassessed);
		Thread.sleep(3000);
		waitforelementandclick(automatedtest);
		Thread.sleep(5000);
		waitforelementandclick(teocandidate2);
		Thread.sleep(5000);
		waitforelementandclick(scoreitembtn);
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(essaytext).getText(), "Summer vacation (also called summer holiday or summer break) is a school holiday in summer beyears and the longest break in the school year. Students and instructors are off school typically between 6 and 14 tween school weeks, depending on the country and district. In America, Ireland, Italy, Greece, Lithuania and Russia, summer holidays are normally three months, compared to six to eight weeks in Australia, Britain, The Netherlands, Canada, and Germany.");
		waitforelementandclick(score);
		driver.findElement(score).clear();
		driver.findElement(score).sendKeys("8");
		driver.findElement(saveandnextqbtn).click();
		driver.findElement(popupconfsave).click();
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!"); 
	    Assert.assertEquals(driver.findElement(attachment).getText(), "download.jpg");
		waitforelementandclick(score);
		driver.findElement(score).clear();
		driver.findElement(score).sendKeys("7");
		driver.findElement(saveandnextqbtn).click();
//		driver.findElement(savebtn).click();
		driver.findElement(popupconfsave).click();
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!"); 
		driver.findElement(cancelbtn).click();
		
		}
	
	public void scoreAssessmentLimitedTime() throws InterruptedException
	{
		waitforelementtext(dashusername, "Teodor Assessor");
		waitforelementandclick(markingmenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(tobeassessed);
		Thread.sleep(2000);
		waitforelementandclick(blueprinttest);
		waitforelement(statuscolumn1);
		Assert.assertEquals(driver.findElement(statuscolumn1).getText(), "Handed in", "Status for candidate 1 is not correct");
		Thread.sleep(4000);
		waitforelementandclick(teocandidate1);
		Thread.sleep(4000);
		waitforelementandclick(scoreitembtn);
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(essaytext).getText(), "The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.");
		/*JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down to be removed when bug https://eassessment.atlassian.net/browse/CD-145 is fixed
		jse.executeScript("scroll(0, 1000);");*/
		waitforelementandclick(score);
		driver.findElement(score).clear();
		driver.findElement(score).sendKeys("1");
		driver.findElement(saveandnextcand).click();
		driver.findElement(popupconfsave).click();
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!"); 
	    driver.findElement(cancelbtn).click();
			
		}
	
	public void scoreAssessmentLimitedTime2() throws InterruptedException
	{
		waitforelementandclick(markingmenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(tobeassessed);
		Thread.sleep(2000);
		waitforelementandclick(blueprinttest);
		waitforelement(statuscolumn1);
		Assert.assertEquals(driver.findElement(statuscolumn2).getText(), "Handed in");
//		Assert.assertEquals(driver.findElement(statuscolumn2).getText(), "Assessing in progress");
		Thread.sleep(4000);
		waitforelementandclick(teocandidate2);
		Thread.sleep(4000);
		waitforelementandclick(scoreitembtn);
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(essaytext).getText(), "The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.");
		/*JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down to be removed when bug https://eassessment.atlassian.net/browse/CD-145 is fixed
		jse.executeScript("scroll(0, 1000);");*/
		waitforelementandclick(score);
		driver.findElement(score).clear();
		driver.findElement(score).sendKeys("1");
		driver.findElement(saveandnextcand).click();
		driver.findElement(popupconfsave).click();
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!"); 
	    driver.findElement(cancelbtn).click();
			
		}
	
	public void scoreAssessmentLimitedTime3() throws InterruptedException
	{
		waitforelementandclick(markingmenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(tobeassessed);
		Thread.sleep(2000);
		waitforelementandclick(blueprinttest);
		waitforelement(statuscolumn1);
		Assert.assertEquals(driver.findElement(statuscolumn3).getText(), "Handed in");
//		Assert.assertEquals(driver.findElement(statuscolumn3).getText(), "Assessing in progress");
		Thread.sleep(2000);
		waitforelementandclick(teocandidate3);
		Thread.sleep(2000);
		waitforelementandclick(scoreitembtn);
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(essaytext).getText(), "The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.");
		/*JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down to be removed when bug https://eassessment.atlassian.net/browse/CD-145 is fixed
		jse.executeScript("scroll(0, 1000);");*/
		waitforelementandclick(score);
		driver.findElement(score).clear();
		driver.findElement(score).sendKeys("1");
		driver.findElement(savebtn).click();
		driver.findElement(popupconfsave).click();
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!"); 
	    driver.findElement(cancelbtn).click();
			
		}
	
	public void VerifyExamSummary2() throws InterruptedException
	{
		Thread.sleep(4000);
		Assert.assertEquals(driver.findElement(scorewidget).getText(), "21");
		Assert.assertEquals(driver.findElement(totalscore3).getText(), "1");
		
	}
	
	public void VerifyExamSummary() throws InterruptedException
	{
		Thread.sleep(4000);
		Assert.assertEquals(driver.findElement(scorewidget).getText(), "135");
		Assert.assertEquals(driver.findElement(totalscore3).getText(), "8");
		Assert.assertEquals(driver.findElement(totalscore11).getText(), "7");
		
	}
	
}
