/**
 * 
 */
package Pages;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author Teodor
 * 		This class will store all the locators and methods of library page
 */
public class Library {

	WebDriver driver;
	
	By librarymenu=By.xpath("//i[@class='icon icon-notebook']");
	By collectionstab=By.xpath("//a[@data-section='collections']");
	By itemstab=By.xpath("//a[@data-section='items']");
	By archivedcounteritems=By.xpath("//div[@id='collectionstatus']/ul/li[2]/div/span");
	By mediatab=By.xpath("//a[@data-section='media']");
	By addcollection=By.xpath("//a[@id='add-collection']");
	By title=By.xpath("//input[@id='title']");
	By prefix=By.xpath("//input[@id='cirrusId']");
	By hierarchy=By.xpath("//select[@id='organisation']");
	By lo=By.xpath("//select[@id='objective']");
	By taxonomy=By.xpath("//select[@id='taxonomy']");
	By savebtn=By.xpath("//button[@id='save-btn']");
	By popupacollectionadded=By.xpath("//strong[@class='mr5']");
	By removecollection=By.xpath("//a[@id='remove-collection']");
	By archivecollection=By.xpath("//a[@id='archive-collection']");
	By archiveitem=By.xpath("//a[@id='archive-item']");
	By unarchiveitem=By.xpath("//a[@id='unarchive-item']");
	By unarchivecollection=By.xpath("//a[@id='unarchive-collection']");
	By archivedcounter=By.xpath("//div[@id='collectionstatus']/ul/li[2]/div/span");
	By sharedcounter=By.xpath("//div[@id='availableTo']/ul/li[2]/div/span");
	By sharecollection=By.xpath("//button[@data-qa='assessment-share']");
	By collectionaccess=By.xpath("//li[@data-qa='sharing-collection']/a");
	By selectall=By.xpath("//label[@data-qa='table-check-all']");
	By sharecollectionadd=By.xpath("//button[@data-qa='sharing-collection-add']");
	By searchforauthor=By.xpath("//div[@data-qa='sharing-collection-add-dialog-profiles']/div/label");
	By searchforauthorinput=By.xpath("//div[@data-qa='sharing-collection-add-dialog-profiles']/div/label/input");
	By shareperson=By.xpath("//input[@data-qa='sharing-collection-add-dialog-search']");
	By firstresultinlist=By.xpath("//div[@data-qa='sharing-collection-add-dialog-table']/div[2]/div/div[1]");
	By permission=By.xpath("//select[@data-qa='sharing-collection-add-dialog-permission']");
	By addshareuser=By.xpath("//button[@data-qa='sharing-collection-add-dialog-save']");
	By savesharebtn=By.xpath("//button[@id='save-btn']");
	By removesharebtn=By.xpath("//button[@data-qa='sharing-collection-remove']");
	By addedcollection=By.xpath("//a[contains(text(), 'Teos automated test collection')]");
	By collectionPsychometrics=By.xpath("//a[contains(text(), 'Psychometrics')]");
	By collectionPsychometrics2=By.xpath("//a[contains(text(), 'Psychometrics2')]");
	By checkboxaddedcollection=By.xpath("//a[contains(text(), 'Teos automated test collection')]/../../div[1]");
	By checkboxsharedcollection=By.xpath("//div[@class='listView_itemsContainer']/div[1]/div[1]");
	By pagetitle=By.xpath("//div[@class='global-page-title']");
	By statisticsTab=By.xpath("//a[@data-section='stat']");
	By additem=By.xpath("//a[@id='add-item']");
	By multiplechoice=By.xpath("//span[contains(text(), 'Multiple choice')]");
	By multipleresponse=By.xpath("//span[contains(text(), 'Multiple response')]");
	By eitheror=By.xpath("//span[contains(text(), 'Either/Or')]");
	By numeric=By.xpath("//span[contains(text(), 'Numeric')]");
	By selectfromlist=By.xpath("//span[contains(text(), 'Select from list')]");
	By fillintheblank=By.xpath("//span[contains(text(), 'Fill in the blank')]");
	By order=By.xpath("//span[contains(text(), 'Order')]");
	By match=By.xpath("//span[contains(text(), 'Match')]");
	By extendedmatch=By.xpath("//span[contains(text(), 'Extended match')]");
	By hotspot=By.xpath("//span[contains(text(), 'Hotspot')]");
	By shortanswer=By.xpath("//span[contains(text(), 'Short answer')]");
	By essay=By.xpath("//span[contains(text(), 'Essay')]");
	By fileresponse=By.xpath("//span[contains(text(), 'File response')]");
	By section=By.xpath("//span[contains(text(), 'Section')]");
	By sectiontitle=By.xpath("//div[@class='locker-text']/input");
	By numberofwords=By.xpath("//input[@class='form-control w75 inline-block mr5']");
	By addfile=By.xpath("//button[@class='btn btn-blue eas-upload-media_line mt15']");
	By selectfile=By.xpath("//div[@class='listView_itemsContainer']/div[1]/div[1]");
	By eclipse=By.xpath("//label[@data-action='ellipse']");
	By addedpicture=By.xpath("//*[name()='svg']");
	By polytomous=By.xpath("//div[@class='qe-scoring_type locker-scoring-type scoring-type-controls']/div[2]");
	By dichotomous=By.xpath("//div[@class='qe-scoring_type locker-scoring-type scoring-type-controls']/div[1]");
	By ckeditor=By.xpath("//div[@class='border']/div/div[3]/div/div/iframe");
	By addalternative=By.xpath("//a[@id='add-choice']");
	By addalternativeorder=By.xpath("//a[@class='btn btn-default btn-green']");
	By addchoice=By.xpath("(//a[@class='btn btn-default btn-green qe-ext_match_add'])[1]");
	By addmatch=By.xpath("(//a[@class='btn btn-default btn-green qe-ext_match_add'])[2]");
	By firstradiobtn=By.xpath("//ol[@class='letter-enumeration alpha']/li[1]/div[2]");
	By secondradiobtn=By.xpath("//ol[@class='letter-enumeration alpha']/li[2]/div[2]");
	By statusdropdown=By.xpath("//select[@class='form-control qe-status-select']");
	//By setLO=By.xpath("//a[@class='action']");
	By setLO=By.xpath("//button[@data-action='objectivesEdit']");
	By originalFolder=By.xpath("//div[@title='Original Folder'][1]");
	By originalSubject=By.xpath("//div[@title='Original Subject'][1]");
	By checkboxLO=By.xpath("//label[@class='checkbox-inline']");
	By ok=By.xpath("//button[@class='btn btn-green-filled']");
	By addItemPurpose=By.xpath("//div[@class='radio qe-purpose ']/label[1]");
	By addTaxonomy=By.xpath("//select[@class='form-control']");
	//By addTaxonomy=By.xpath("//div[@class='radio qe-purpose']/label[1]");
	By scoreBox=By.xpath("//input[@class='form-control w75 ml5 inline-block']");
	By saveqbtn=By.xpath("//button[@data-qa='question-editor-actions-save-close']");
	By popupconfsave=By.xpath("//strong[@class='mr5']");
	By pastebtn=By.xpath("//*[@id='cke_1_toolbox']/span[1]/span[3]/a[4]");
	By selectfromlistfield=By.xpath("//div[@id='workspace-region']/div/div[1]/div[3]/div/div");
	By createblank=By.xpath("//a[@id='add-blank']");
	By textalternatives=By.xpath("//input[@id='text-alts']");
	By textalternatives1=By.xpath("//tbody[@id='blanks-table']/tr[1]/td[3]/input");
	By textalternatives2=By.xpath("//tbody[@id='blanks-table']/tr[2]/td[3]/input");
	By userarrow=By.xpath("//b[@class='caret']");
	By logout=By.xpath("//a[@id='logout-link']");
	By footertext=By.xpath("//div[@class='eas-pagination-pagerSize']/span[1]");
	By footertextitems=By.xpath("//div[@id='tab-items']/div[1]/div[5]/div[1]/div/span[1]");
	By importbtn=By.xpath("//a[@id='import-item']");
	By copybtn=By.xpath("//a[@id='copy-item']");
	By deletebtn=By.xpath("//a[@id='delete-item']");
	By labelsbtn=By.xpath("//div[@data-region='label-editor']/button");
	By firstlabel=By.xpath("//div[@class='labels-container empty-light nano-content']/div[1]/label");
	By secondlabel=By.xpath("//div[@class='labels-container empty-light nano-content']/div[2]/label");
	By applylabel=By.xpath("//div[@class='cmn-label-apply active']");
	By applyedlabel=By.xpath("//div[@class='listView_itemsContainer']/div[1]/div[2]/div[2]/div");
	By confirmdelete=By.xpath("//button[@id='delete-btn']");
	By firstquestion1=By.xpath("//div[@class='listView_itemsContainer']/a[1]/div[1]/label");
	By firstquestion=By.xpath("//div[@class='listView_itemsContainer']/div[1]/div[1]/label");
	By loadingmessage=By.xpath("//div[@class='wait-message']");
	By firstitem=By.xpath("//div[@id='tab-items']/div/div[6]/div[2]/div[2]/div[1]/div[1]");
	By allitems=By.xpath("//div[@id='tab-items']/div/div[4]/div[2]/div[1]/div[1]");
	By removeitems=By.xpath("//a[@id='remove-item']");
	By importselected=By.xpath("//button[@id='import-selected']");
	By confirmbtn=By.xpath("//button[@data-qa='file-import-ext-id-override-accept']");
	By popupconfmsg=By.xpath("//div[@class='notification-text eas-text-container']");
	By imsqtifile=By.xpath("//div[@class='col-md-12']/div[2]");
	By excelfile=By.xpath("//div[@class='col-md-12']/div[3]");
	By moodlefile=By.xpath("//div[@class='col-md-12']/div[4]");
	By uploadfile=By.xpath("//input[@id='questions-files-import']");
	
	By fitbchancescore=By.xpath("//div[contains(text(), 'This is a Fill in the blank type of question.')]/../div[4]");
	By fitbpcvalue=By.xpath("//div[contains(text(), 'This is a Fill in the blank type of question.')]/../div[5]");
	By fitbpvalue=By.xpath("//div[contains(text(), 'This is a Fill in the blank type of question.')]/../div[6]");
	By fitbanswered=By.xpath("//div[contains(text(), 'This is a Fill in the blank type of question.')]/../div[7]");
	By fitbstatus=By.xpath("//div[contains(text(), 'This is a Fill in the blank type of question.')]/../div[9]/span");
	
	By hotspotchancescore=By.xpath("//div[contains(text(), 'This is a Hotspot question')]/../div[4]");
	By hotspotpcvalue=By.xpath("//div[contains(text(), 'This is a Hotspot question')]/../div[5]");
	By hotspotpvalue=By.xpath("//div[contains(text(), 'This is a Hotspot question')]/../div[6]");
	By hotspotanswered=By.xpath("//div[contains(text(), 'This is a Hotspot question')]/../div[7]");
	By hotspotstatus=By.xpath("//div[contains(text(), 'This is a Hotspot question')]/../div[9]/span");
	
	By matchdichtchancescore=By.xpath("//div[contains(text(), 'This is a Match question Dichotomous')]/../div[4]");
	By matchdichtpcvalue=By.xpath("//div[contains(text(), 'This is a Match question Dichotomous')]/../div[5]");
	By matchdichtpvalue=By.xpath("//div[contains(text(), 'This is a Match question Dichotomous')]/../div[6]");
	By matchdichtanswered=By.xpath("//div[contains(text(), 'This is a Match question Dichotomous')]/../div[7]");
	By matchdichtstatus=By.xpath("//div[contains(text(), 'This is a Match question Dichotomous')]/../div[9]/span");
	
	By matchpolychancescore=By.xpath("//div[contains(text(), 'This is a Match question Polytomous')]/../div[4]");
	By matchpolypcvalue=By.xpath("//div[contains(text(), 'This is a Match question Polytomous')]/../div[5]");
	By matchpolypvalue=By.xpath("//div[contains(text(), 'This is a Match question Polytomous')]/../div[6]");
	By matchpolyanswered=By.xpath("//div[contains(text(), 'This is a Match question Polytomous')]/../div[7]");
	By matchpolystatus=By.xpath("//div[contains(text(), 'This is a Match question Polytomous')]/../div[9]/span");
	
	By numericchancescore=By.xpath("//div[contains(text(), 'This is a Numeric type of question. 5x12=?')]/../div[4]");
	By numericpcvalue=By.xpath("//div[contains(text(), 'This is a Numeric type of question. 5x12=?')]/../div[5]");
	By numericpvalue=By.xpath("//div[contains(text(), 'This is a Numeric type of question. 5x12=?')]/../div[6]");
	By numericanswered=By.xpath("//div[contains(text(), 'This is a Numeric type of question. 5x12=?')]/../div[7]");
	By numericstatus=By.xpath("//div[contains(text(), 'This is a Numeric type of question. 5x12=?')]/../div[9]/span");
	
	By orderchancescore=By.xpath("//div[contains(text(), 'This is a Order question')]/../div[4]");
	By orderpcvalue=By.xpath("//div[contains(text(), 'This is a Order question')]/../div[5]");
	By orderpvalue=By.xpath("//div[contains(text(), 'This is a Order question')]/../div[6]");
	By orderanswered=By.xpath("//div[contains(text(), 'This is a Order question')]/../div[7]");
	By orderstatus=By.xpath("//div[contains(text(), 'This is a Order question')]/../div[9]/span");
	
	By sflchancescore=By.xpath("//div[contains(text(), 'This is a Select from list type of question. Select distractor 5.')]/../div[4]");
	By sflpcvalue=By.xpath("//div[contains(text(), 'This is a Select from list type of question. Select distractor 5.')]/../div[5]");
	By sflpvalue=By.xpath("//div[contains(text(), 'This is a Select from list type of question. Select distractor 5.')]/../div[6]");
	By sflanswered=By.xpath("//div[contains(text(), 'This is a Select from list type of question. Select distractor 5.')]/../div[7]");
	By sflstatus=By.xpath("//div[contains(text(), 'This is a Select from list type of question. Select distractor 5.')]/../div[9]/span");
	
	By eitherorchancescore=By.xpath("//div[contains(text(), 'This is a either or type of question')]/../div[4]");
	By eitherorpcvalue=By.xpath("//div[contains(text(), 'This is a either or type of question')]/../div[5]");
	By eitherorpvalue=By.xpath("//div[contains(text(), 'This is a either or type of question')]/../div[6]");
	By eitheroranswered=By.xpath("//div[contains(text(), 'This is a either or type of question')]/../div[7]");
	By eitherorstatus=By.xpath("//div[contains(text(), 'This is a either or type of question')]/../div[9]/span");
	
	By mcchancescore=By.xpath("//div[contains(text(), 'This is a multiple choice question')]/../div[4]");
	By mcpcvalue=By.xpath("//div[contains(text(), 'This is a multiple choice question')]/../div[5]");
	By mcpvalue=By.xpath("//div[contains(text(), 'This is a multiple choice question')]/../div[6]");
	By mcanswered=By.xpath("//div[contains(text(), 'This is a multiple choice question')]/../div[7]");
	By mcstatus=By.xpath("//div[contains(text(), 'This is a multiple choice question')]/../div[9]/span");
	
	By mrchancescore=By.xpath("//div[contains(text(), 'This is a multiple response question')]/../div[4]");
	By mrpcvalue=By.xpath("//div[contains(text(), 'This is a multiple response question')]/../div[5]");
	By mrpvalue=By.xpath("//div[contains(text(), 'This is a multiple response question')]/../div[6]");
	By mranswered=By.xpath("//div[contains(text(), 'This is a multiple response question')]/../div[7]");
	By mrstatus=By.xpath("//div[contains(text(), 'This is a multiple response question')]/../div[9]/span");
	
	By shortanswerchancescore=By.xpath("//div[contains(text(), 'This is a short answer type of question. What is your grandmother name?')]/../div[4]");
	By shortanswerpcvalue=By.xpath("//div[contains(text(), 'This is a short answer type of question. What is your grandmother name?')]/../div[5]");
	By shortanswerpvalue=By.xpath("//div[contains(text(), 'This is a short answer type of question. What is your grandmother name?')]/../div[6]");
	By shortansweranswered=By.xpath("//div[contains(text(), 'This is a short answer type of question. What is your grandmother name?')]/../div[7]");
	By shortanswerstatus=By.xpath("//div[contains(text(), 'This is a short answer type of question. What is your grandmother name?')]/../div[9]/span");
	
	
	
	public Library(WebDriver driver)
	{
	      this. driver=driver;
	}
	
	
	
	private void waitforelementtext(By element, String text) {
	WebDriverWait wait = new WebDriverWait(driver, 12);
      wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));        
				}
		    
		    private void waitforelementandclick(By element) {
				WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
				    myDynamicElement.click(); }
		    
		    private void waitforelementtodisappear(By element) {
				new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(element));}
		    
		    Date testDateStrings = new Date();
		    DateFormat dfs = new SimpleDateFormat("yyMMddHHmm");
		    String todaysDatesec = dfs.format(testDateStrings);
				 
	
	public void goToLibraryPage()
	
	{
		driver.findElement(librarymenu).click();
		
	}
	
	public void addCollection(String collectionname) throws InterruptedException 
	
	{
		waitforelementandclick(librarymenu);
		waitforelementandclick(addcollection);
		Thread.sleep(2000);
		waitforelementandclick(title);
		driver.findElement(title).clear();
	    driver.findElement(title).sendKeys(collectionname);
	    driver.findElement(lo).sendKeys("All");
	    driver.findElement(taxonomy).sendKeys("All");
	    driver.findElement(savebtn).click();
	    waitforelementandclick(popupacollectionadded);
	    Assert.assertEquals(driver.findElement(popupacollectionadded).getText(), "success!");
	    
	}
	
	public void addMCquestionDetails()
	
	{
		waitforelementandclick(librarymenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(addedcollection);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");
		waitforelementandclick(additem);
		waitforelementandclick(multiplechoice);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a multiple choice question").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer A").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer B").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer C").perform();
		  
	}
	
	public void addMCforPsychometrics()
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(multiplechoice);
		waitforelementandclick(pagetitle);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 500);");
		waitforelementandclick(addalternative);
		jse.executeScript("scroll(0, -500);");
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a multiple choice question").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer A").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer B").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer C").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer D").perform();
		jse.executeScript("scroll(0, -500);");
		  
	}
	
	public void selectCorrectAnswer()
	
	{
		driver.findElement(firstradiobtn).click();
		  
	}
	
	public void selectCorrectAnswers()
	
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls up
		jse.executeScript("scroll(0, -500);");
		driver.findElement(firstradiobtn).click();
		driver.findElement(secondradiobtn).click();
		  
	}
	
	public void selectQuestionStatus(String status)
	
	{
		driver.findElement(statusdropdown).sendKeys(status);
		  
	}
	
	public void selectLearningObjective()
	
	{
		waitforelementandclick(setLO);
		waitforelementandclick(originalFolder);
		waitforelementandclick(originalSubject);
		waitforelementandclick(checkboxLO);
		waitforelementandclick(ok);
		  
	}
	
	public void selectItemPurpose()
	
	{
		driver.findElement(addItemPurpose).click();
		//new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
		//new Actions(driver).sendKeys(Keys.RETURN).perform();
		  
	}
	
	public void selectTaxonomy()
	
	{
		driver.findElement(addTaxonomy).click();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).perform();
		new Actions(driver).sendKeys(Keys.RETURN).perform();
		  
	}

	public void addScoreAndSave(String score)
	
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 1000);");
		driver.findElement(scoreBox).sendKeys(Keys.BACK_SPACE);
		driver.findElement(scoreBox).sendKeys(score);
//		jse.executeScript("scroll(0, 500);");
		waitforelementandclick(saveqbtn);
//		driver.findElement(saveqbtn).click();
		waitforelementandclick(popupconfsave);
	    Assert.assertEquals(driver.findElement(popupconfsave).getText(), "success!"); 
		  
	}
	
	public void save() 
	
	{
		
		driver.findElement(saveqbtn).click();
		  
	}
	
	public void goToCollectionAT() 
	
	{
		waitforelementandclick(librarymenu);
		waitforelementandclick(addedcollection);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");
	}
	
	public void goToCollectionPsychometrics() 
	{
		waitforelementandclick(librarymenu);
		waitforelementandclick(collectionPsychometrics);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Psychometrics");
	}
	
	public void goToCollectionPsychometrics2() 
	{
		waitforelementandclick(librarymenu);
		waitforelementandclick(collectionPsychometrics2);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Psychometrics2");
	}
	
	public void goToStatisticsTab() 
	{
		waitforelementandclick(librarymenu);
		waitforelementandclick(collectionPsychometrics);
		waitforelementandclick(statisticsTab);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Psychometrics");
	}
	
	public void checkCollectionStatistics() 
	{
		waitforelementandclick(fitbchancescore);
		Assert.assertEquals(driver.findElement(fitbchancescore).getText(), "N/A", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(fitbpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(fitbpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(fitbanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(fitbstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(hotspotchancescore).getText(), "N/A", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(hotspotpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(hotspotpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(hotspotanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(hotspotstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(matchdichtchancescore).getText(), "25%", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(matchdichtpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(matchdichtpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(matchdichtanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(matchdichtstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(matchpolychancescore).getText(), "25%", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(matchpolypcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(matchpolypvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(matchpolyanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(matchpolystatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(numericchancescore).getText(), "N/A", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(numericpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(numericpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(numericanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(numericstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(orderchancescore).getText(), "4%", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(orderpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(orderpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(orderanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(orderstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(sflchancescore).getText(), "33%", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(sflpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(sflpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(sflanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(sflstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(eitherorchancescore).getText(), "50%", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(eitherorpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(eitherorpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(eitheroranswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(eitherorstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(mcchancescore).getText(), "25%", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(mcpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(mcpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(mcanswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(mcstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(mrchancescore).getText(), "6%", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(mrpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(mrpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(mranswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(mrstatus).getText(), "N/A", "Incorrect status");
		Assert.assertEquals(driver.findElement(shortanswerchancescore).getText(), "N/A", "Incorrect chance score");
		Assert.assertEquals(driver.findElement(shortanswerpcvalue).getText(), "N/A", "Incorrect pc value");
		Assert.assertEquals(driver.findElement(shortanswerpvalue).getText(), "N/A", "Incorrect p value");
		Assert.assertEquals(driver.findElement(shortansweranswered).getText(), "0", "Incorrect answered number");
		Assert.assertEquals(driver.findElement(shortanswerstatus).getText(), "N/A", "Incorrect status");
	}
	
	public void addMultipleResponseQuestionDetails() 
	
	{
		waitforelementandclick(librarymenu);
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(addedcollection);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");
		waitforelementandclick(additem);
		waitforelementandclick(multipleresponse);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a multiple response question").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer A").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer B").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer C").perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 500);");
			
	}
	
	public void addMRforPsychometrics (String questiontext) 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(multipleresponse);
		waitforelementandclick(pagetitle);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 500);");
		waitforelementandclick(addalternative);
		jse.executeScript("scroll(0, -500);");
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys(questiontext).perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer A").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer B").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer C").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer D").perform();
//		waitforelementandclick(dichotomous);
//		jse.executeScript("scroll(0, -500);");
			
	}
	
	public void addEitherOrQuestionDetails() 
	
	{
		
		waitforelementandclick(additem);
		waitforelementandclick(eitheror);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a either or type of question").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer A").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Answer B").perform();
			
	}

	
	public void addNumericQuestionDetails() 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(numeric);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a Numeric type of question. 5x12=?").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("60").perform();
			
	}
	
	/*public void addSelectFromListQuestionDetails(String questiontext) throws InterruptedException
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(selectfromlist);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys(questiontext).perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("distractor 5").perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, "a")).perform();
		driver.findElement(createblank).click();
		waitforelementandclick(textalternatives);
		driver.findElement(textalternatives).sendKeys("distractor 1, distractor 2");
		Thread.sleep(1000);
			
	}*/
	
	public void addSelectFromListQuestionDetails(String questiontext) throws InterruptedException
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(selectfromlist);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys(questiontext).perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("distractor 5, distractor 6").perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.LEFT,Keys.LEFT)).perform();
		driver.findElement(createblank).click();
		Thread.sleep(1000);
		new Actions(driver).sendKeys(Keys.LEFT).perform();
		new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.LEFT,Keys.LEFT)).perform();
		driver.findElement(createblank).click();
		waitforelementandclick(textalternatives1);
		driver.findElement(textalternatives1).sendKeys("distractor 1, distractor 2");
		driver.findElement(textalternatives2).sendKeys("distractor 3, distractor 4");
		
		Thread.sleep(1000);
			
	}

	public void addFillInTheBlankQuestionDetails(String questiontext) throws InterruptedException

	{
		waitforelementandclick(additem);
		waitforelementandclick(fillintheblank);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys(questiontext).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("blank 6 blank 1").perform();
		Thread.sleep(1000);
		//new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL, "a")).perform();
		new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.LEFT,Keys.LEFT)).perform();
		driver.findElement(createblank).click();
		Thread.sleep(1000);
		new Actions(driver).sendKeys(Keys.LEFT).perform();
		new Actions(driver).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.LEFT,Keys.LEFT)).perform();
		driver.findElement(createblank).click();
		waitforelementandclick(textalternatives);
		driver.findElement(textalternatives1).sendKeys("blank 2, blank 3, blank 4, blank 5");
		driver.findElement(textalternatives2).sendKeys("blank 2, blank 3, blank 4, blank 5");
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 500);");
	
	}
	
	public void addOrderQuestionDetails() throws InterruptedException
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(order);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a Order question").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("5").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("6").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("7").perform();
			
	}
	
	public void addOrderForPsychometrics() 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(order);
		waitforelementandclick(pagetitle);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 500);");
		waitforelementandclick(addalternativeorder);
		jse.executeScript("scroll(0, -500);");
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a Order question").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("5").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("6").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("7").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("8").perform();
		jse.executeScript("scroll(0, -500);");
	}

	
	public void addMatchQuestionDetails(String questiontext) throws InterruptedException 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(match);
		waitforelementandclick(pagetitle);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 500);");
		waitforelementandclick(addalternativeorder);
		jse.executeScript("scroll(0, -500);");
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys(questiontext).perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("car").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("driver").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("home").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("family").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("pet").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("dog").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("park").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		new Actions(driver).sendKeys("trees").perform();		
	}
	
		public void addExtendedMatchQuestionDetails() 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(extendedmatch);
		waitforelementandclick(pagetitle);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 500);");
		waitforelementandclick(addchoice);
		waitforelementandclick(addmatch);
		jse.executeScript("scroll(0, 500);");
		waitforelementandclick(addchoice);
		waitforelementandclick(addmatch);
		jse.executeScript("scroll(0, -500);");
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("Extended").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("car").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("driver").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("home").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("family").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("pet").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("dog").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("park").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("trees").perform();		
	}
	
	public void scoringPolytomous()
	{
		waitforelementandclick(polytomous);
	}
	
	public void scoringDichotomous()
	{
		waitforelementandclick(dichotomous);
	}
	
	public void addHotspotQuestionDetails() throws InterruptedException 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(hotspot);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a Hotspot question").perform();
		driver.findElement(addfile).click();
		waitforelementandclick(selectfile);
		Thread.sleep(2000);
		driver.findElement(eclipse).click();
		Thread.sleep(2000);
		waitforelementandclick(addedpicture);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 100);");
		WebElement ele1 = driver.findElement(addedpicture);
		  Actions build = new Actions(driver);
		build.moveToElement(ele1,250,250).clickAndHold().moveByOffset(40, 40).release().perform();
		build.moveToElement(ele1,250,550).clickAndHold().moveByOffset(40, 40).release().perform();
		build.moveToElement(ele1,1000,250).clickAndHold().moveByOffset(40, 40).release().perform();
		build.moveToElement(ele1,1000,550).clickAndHold().moveByOffset(40, 40).release().perform();
	}
	
	public void addShortAnserQuestionDetails() 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(shortanswer);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a short answer type of question. What is your grandmother name?").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Geta").perform();
		
	}
	
	public void addEssayQuestionDetails()
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(essay);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is an essay type of question.").perform();
		driver.findElement(numberofwords).sendKeys("200");
		
		
	}
	
	public void addFileResponseQuestionDetails() 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(fileresponse);
		waitforelementandclick(pagetitle);
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("This is a file response type of question.").perform();

		
		
	}
	
	public void addSectionDetails() 
	
	{
		waitforelementandclick(additem);
		waitforelementandclick(section);
		waitforelementandclick(pagetitle);
		waitforelementandclick(sectiontitle);
		driver.findElement(sectiontitle).sendKeys("This is a section page.");
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("This is the section text").perform();
		
		
	}
	
	public void importFromACollection() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(addedcollection);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");
		waitforelementtext(footertext, "Total 13 item(s) found | Show");
		driver.findElement(importbtn).click();
		waitforelementandclick(ok);
//		Thread.sleep(5000);
		waitforelementtext(footertext, "Total 29 item(s) found | Show");
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(firstquestion1);
		driver.findElement(importselected).click();
		waitforelementandclick(popupconfmsg);
		Assert.assertEquals(driver.findElement(popupconfmsg).getText(), "Import has finished successfully.");
		
	}
	
	public void importFromIMSQTI() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(addedcollection);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");
		waitforelementtext(footertext, "Total 14 item(s) found | Show");
		waitforelementtodisappear(loadingmessage);
		driver.findElement(importbtn).click();
		waitforelementandclick(imsqtifile);
		driver.findElement(ok).click();
		Thread.sleep(1000);
		driver.findElement(uploadfile).sendKeys("C:\\Users\\Teodor\\Desktop\\QTIv21-example-Export Year_2.zip");
//		Thread.sleep(10000);
		waitforelementtext(footertext, "Total 120 item(s) found | Show");
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(firstquestion1);
		driver.findElement(importselected).click();
//		waitforelementandclick(confirmbtn);
		waitforelementtext(footertext, "Total 15 item(s) found | Show");
	}
	
	public void importFromExcel() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(addedcollection);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");
		waitforelementtext(footertext, "Total 15 item(s) found | Show");
		driver.findElement(importbtn).click();
		waitforelementandclick(excelfile);
		driver.findElement(ok).click();
		waitforelementtext(footertext, "Total 0 item(s) found | Show");
		driver.findElement(uploadfile).sendKeys("C:\\Users\\Teodor\\Desktop\\File1.xlsx");
//		waitforelementtext(footertext, "Total 16 item(s) found | Show");
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(firstquestion1);
		driver.findElement(importselected).click();
//		waitforelementandclick(confirmbtn);
		waitforelementandclick(popupconfmsg);
		Assert.assertEquals(driver.findElement(popupconfmsg).getText(), "Import has finished successfully.");
		waitforelementtext(footertext, "Total 16 item(s) found | Show");
		
	}
	
public void importMoodle() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(addedcollection);
		waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");
		waitforelementtext(footertext, "Total 16 item(s) found | Show");
		driver.findElement(importbtn).click();
		waitforelementandclick(moodlefile);
		driver.findElement(ok).click();
		waitforelementtext(footertext, "Total 0 item(s) found | Show");
		driver.findElement(uploadfile).sendKeys("C:\\Users\\Teodor\\Desktop\\Files for import\\Moodle.xml");
		waitforelementtodisappear(loadingmessage);
		Thread.sleep(42000);
		waitforelementandclick(firstquestion1);
		driver.findElement(importselected).click();
//		waitforelementandclick(confirmbtn);
//		Assert.assertEquals(driver.findElement(popupconfmsg).getText(), "Import has finished successfully.");
		waitforelementtext(footertext, "Total 17 item(s) found | Show");
		
//		waitforelementandclick(popupconfmsg);
		
		
	}
	
	public void createCopy() 
	
	{
		waitforelementandclick(librarymenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(addedcollection);
		waitforelementtext(pagetitle, "Collection - Teos automated test collection");
		/*waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");*/
		waitforelementtext(footertext, "Total 17 item(s) found | Show");
		waitforelementandclick(firstquestion);
		driver.findElement(copybtn).click();
		
	}
	
	public void deleteItem() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		waitforelementandclick(addedcollection);
		waitforelementtext(pagetitle, "Collection - Teos automated test collection");
		/*waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");*/
		waitforelementtext(footertext, "Total 18 item(s) found | Show");
		waitforelementandclick(firstquestion);
		driver.findElement(deletebtn).click();
		driver.findElement(confirmdelete).click();
		waitforelementtext(footertext, "Total 17 item(s) found | Show");

		
	}
	
	public void applyLabel() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		waitforelementandclick(addedcollection);
		waitforelementtext(pagetitle, "Collection - Teos automated test collection");
		/*waitforelementandclick(pagetitle);
		Assert.assertEquals(driver.findElement(pagetitle).getText(), "Collection - Teos automated test collection");*/
//		Thread.sleep(1000);
		waitforelementtext(footertext, "Total 17 item(s) found | Show");
		waitforelementtodisappear(loadingmessage);
		waitforelementandclick(firstquestion);
		driver.findElement(labelsbtn).click();
		Thread.sleep(1000);
		driver.findElement(secondlabel).click();
		Thread.sleep(1000);
		driver.findElement(applylabel).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(applyedlabel).getText(), "Label B");
		
		
	}
	
	public void archiveCollection() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		waitforelementtext(archivedcounter, "0");
		waitforelementandclick(checkboxaddedcollection);
		Thread.sleep(1000);
		driver.findElement(archivecollection).click();
		waitforelementtext(archivedcounter, "1");
		
	}
	
	public void unarchiveCollection() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(archivedcounter).getText(), "1");
		waitforelementandclick(checkboxaddedcollection);
		Thread.sleep(1000);
		driver.findElement(unarchivecollection).click();
		/*Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(archivedcounter).getText(), "0");*/
		waitforelementtext(archivedcounter, "0");
		
	}
	
	public void shareCollection() throws InterruptedException
	
	{
		driver.navigate().refresh();
		waitforelementandclick(librarymenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		waitforelementandclick(addedcollection);
//		waitforelementandclick(checkboxaddedcollection);
		waitforelementandclick(sharecollection);
		Thread.sleep(2000);
		waitforelementandclick(collectionaccess);
		Thread.sleep(2000);
		waitforelementandclick(sharecollectionadd);
		Thread.sleep(2000);
		/*if(driver.findElement(searchforauthorinput).getAttribute("value") != "on") // if unChecked
		{
			driver.findElement(searchforauthor).click();                         //to Check it 
		}
		else
		Thread.sleep(2000);*/
		driver.findElement(firstresultinlist).click();
		
		driver.findElement(permission).sendKeys("Author");
		driver.findElement(addshareuser).click();
		driver.findElement(userarrow).click();
		driver.findElement(logout).click();
		
	}
	
	public void removeSharedCollection() throws InterruptedException
	
	{
		Thread.sleep(2000);
		waitforelementandclick(librarymenu);
		waitforelementtext(sharedcounter, "1");
		/*Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(sharedcounter).getText(), "1");*/
//		waitforelementandclick(checkboxsharedcollection);
		waitforelementandclick(addedcollection);
		waitforelementandclick(sharecollection);
		waitforelementandclick(collectionaccess);
		waitforelementandclick(selectall);
		waitforelementandclick(removesharebtn);
		waitforelementandclick(librarymenu);
		driver.navigate().refresh();//to be removed when they fix the bug with automatic refresh
		waitforelementtext(sharedcounter, "0");
		driver.findElement(userarrow).click();
		driver.findElement(logout).click();
		
	}
	
	public void archiveItem() throws InterruptedException
	
	{
		Thread.sleep(3000);
		waitforelementandclick(librarymenu);
		Thread.sleep(3000);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		driver.findElement(itemstab).click();
		Thread.sleep(6000);
		waitforelementtext(archivedcounteritems, "0");
		waitforelementandclick(firstitem);
		Thread.sleep(2000);
		driver.findElement(archiveitem).click();
//		waitforelementtext(archivedcounteritems, "1");
		
	}
	
	public void unarchiveItem() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		Thread.sleep(3000);
		driver.findElement(itemstab).click();
		Thread.sleep(5000);
//		Assert.assertEquals(driver.findElement(archivedcounteritems).getText(), "1");
//		Thread.sleep(4000);
		waitforelementandclick(firstitem);
		Thread.sleep(2000);
		driver.findElement(unarchiveitem).click();
		Thread.sleep(3000);
//		Assert.assertEquals(driver.findElement(archivedcounteritems).getText(), "0");
		
	}
	
	public void applyLabelItems() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		driver.findElement(itemstab).click();
		Thread.sleep(5000);
		waitforelementandclick(firstitem);
		driver.findElement(labelsbtn).click();
		Thread.sleep(2000);
		driver.findElement(firstlabel).click();
		driver.findElement(applylabel).click();
		waitforelementtext(applyedlabel, "Label A");

		
	}
	
	public void deleteAllFromItems() throws InterruptedException //This TC will not be performed anymore since the counter in the bottom part of  the page is inconsistent
	
	{
		waitforelementandclick(librarymenu);
		new Actions(driver).sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		driver.findElement(itemstab).click();
		waitforelementandclick(allitems);
		waitforelementandclick(removeitems);
		waitforelementandclick(confirmdelete);
		/*Thread.sleep(4000);
		waitforelementandclick(librarymenu);
//		driver.findElement(librarymenu).click();
		waitforelementandclick(itemstab);*/
		waitforelementtext(footertextitems, "Total 85 item(s) found | Show");
		
	}
	
	public void deleteCollection() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		driver.findElement(collectionstab).click();
		waitforelementtext(footertext, "Total 3 item(s) found | Show");
		Thread.sleep(1000);
		waitforelementandclick(checkboxaddedcollection);
		Thread.sleep(1000);
		driver.findElement(removecollection).click();
		Thread.sleep(1000);
		driver.findElement(confirmdelete).click();
		waitforelementtext(footertext, "Total 2 item(s) found | Show");

		
	}
	
	public void deleteCollectionIfFail() throws InterruptedException
	
	{
		waitforelementandclick(librarymenu);
		driver.findElement(collectionstab).click();
		waitforelementandclick(checkboxaddedcollection);
		Thread.sleep(1000);
		driver.findElement(removecollection).click();
		Thread.sleep(1000);
		driver.findElement(confirmdelete).click();
		waitforelementtext(footertext, "Total 2 item(s) found | Show");

	}

	public void deleteCollectionIfFail(Method m) throws InterruptedException {
        if (m.getName().matches("E017ImportFromAnotherCollection|E018ImportFromIMSQTI|E019ImportFromExcel|E020CreateCopy|E021DeleteItem|E022ApplyLabel|E023ArchiveCollection|E024UnarchiveCollection|E025ShareCollection|E026UnshareCollection|E027ArchiveItem|E028UnarchiveItem|E029ApplyLabelItems|E030DeleteAllFromItems|E031DeleteCollection"))
        {
        	deleteCollectionIfFail();
        }
    }
	
}
