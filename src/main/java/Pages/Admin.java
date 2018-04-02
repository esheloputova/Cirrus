package Pages;

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


public class Admin {

WebDriver driver;

	By adminmenu=By.xpath("//a[@title='Admin']");
	By overviewmenu=By.xpath("//a[@href='#admin/overview']");
	By usersmenu=By.xpath("//a[@href='#admin/users']");
	By adduser=By.xpath("//button[@id='add-user']");
	By firstname=By.xpath("//input[@id='FirstName']");
	By lastname=By.xpath("//input[@id='LastName']");
	By username=By.xpath("//input[@id='UserName']");
	By email=By.xpath("//input[@id='Email']");
	By firstnametitle=By.xpath("//label[@for='FirstName']");
	By role=By.xpath("//select[@id='Profile']");
	By candidateid=By.xpath("//input[@id='ExternalId']");
	By hierarchy=By.xpath("//select[@id='Group']");
	By password=By.xpath("//input[@id='Password']");
	By repassword=By.xpath("//input[@id='RePassword']");
	By savebtn=By.xpath("//button[@id='save-btn']");
	By deleteuser=By.xpath("//button[@id='delete-user']");
	By deletepermanently=By.xpath("//a[@id='remove-item']");
	By deleteuserconfirm=By.xpath("//button[@id='delete-btn']");
	By importusers=By.xpath("//div[@id='importButton']/input");
	By ifirstname=By.xpath("//select[@id='first-name']");
	By ilastname=By.xpath("//select[@id='last-name']");
	By iusername=By.xpath("//select[@id='user-name']");
	By ipassword=By.xpath("//select[@id='password']");
	By inumber=By.xpath("//select[@id='number']");
	By iemail=By.xpath("//select[@id='email']");
	By irole=By.xpath("//select[@id='profile']");
	By ihierarchy=By.xpath("//select[@id='main-group']");
	By itryimportbtn=By.xpath("//a[@id='import']");
	By iconfirmmessage=By.xpath("//div[@class='modal-body']/div/div/div[1]/div[2]");
	By iimportbtn=By.xpath("//a[@id='ok']");
	By searchuser=By.xpath("//input[@data-qa='usersListSearchInput']");
	By usertitle=By.xpath("//div[@class='global-page-title']/span[2]");
	By checkallcheckbox=By.xpath("//label[@class='checkbox-inline all']");
	By footertext=By.xpath("//div[@class='eas-pagination-pagerSize']/span[1]");
	By namecolumn=By.xpath("//div[@class='listViewItem__column adm-users--name']");
	By usernamecolumn=By.xpath("//div[@class='listViewItem__column lvic adm-users--username']");
	By hierarchiesmenu=By.xpath("//a[@href='#admin/groups']");
	By createhierarchy=By.xpath("//a[@id='create-group']");
	By htitle=By.xpath("//input[@data-qa='add-hierarchy-title']");
	By horganisationaddress=By.xpath("//input[@id='address']");
	By hsynchronizationkey=By.xpath("//input[@id='synchronizationKey']");
	By hallowcollections=By.xpath("//form[@novalidate='novalidate']/div/div[4]/div/label");
	By hallowassessments=By.xpath("//form[@novalidate='novalidate']/div/div[5]/div/label");
	By hsavebtn=By.xpath("//button[@data-qa='add-hierarchy-save']");
	By addedhierarchy=By.xpath("//li[@class='aciTreeLi aciTreeLeaf aciTreeLevel1 aciTreeLast aciTreeVisible aciTreeOdd']");
	By hdeletebutton=By.xpath("//li[@class='aciTreeLi aciTreeLeaf aciTreeLevel1 aciTreeLast aciTreeVisible aciTreeOdd']/div/div/div/span[2]/span/div[2]/i[3]");
	By hconfirmmessage=By.xpath("//div[@class='modal-body']/div/p[1]");
	By hconfirmdelete=By.xpath("//button[@id='delete-btn']");
	By popupconfdelete=By.xpath("//div[@class='notification-text eas-text-container']");
	By qualificationsmenu=By.xpath("//a[@href='#admin/qualifications']");
	By addqualification=By.xpath("//a[@id='add-qualification']");
	By qualtitle=By.xpath("//input[@id='title']");
	By qualdescription=By.xpath("//textarea[@id='description']");
	By qualselecthier=By.xpath("//select[@id='organisation']");
	By testqualification=By.xpath("//select[@id='organisation']/option[2]");
	By addhierarchytoqual=By.xpath("//button[@id='add-organisation']");
	By qsavebtn=By.xpath("//button[@id='save-btn']");
	By templatesavebtn=By.xpath("//button[@data-qa='template-save']");
	By firstqualification=By.xpath("//div[@class='listView']/div[2]/div[1]/div[1]/label");
	By deletequalification=By.xpath("//a[@id='delete-qualification']");
	By qconfirmdelete=By.xpath("//button[@id='delete-btn']");
	By qconfirmmessage=By.xpath("//div[@class='modal-body']/div/p[1]");
	By qpopupmessage=By.xpath("//div[@class='notification-delete-results_title']");
	By collectionsandassessmentsmenu=By.xpath("//a[@href='#admin/collectionsAndAssessments']");
	By termsmenu=By.xpath("//a[@href='#admin/terms']");
	By templatesmenu=By.xpath("//a[@href='#admin/templates']");
	By addterm=By.xpath("//a[@id='add-term']");
	By addarrow=By.xpath("//button[@data-qa='templates-add-arrow']");
	By addquestionarrow=By.xpath("//button[@data-qa='templates-form-add-question-arrow']");
	By addNDA=By.xpath("//a[@data-qa='tempates-add-nda']");
	By addform=By.xpath("//a[@data-qa='tempates-add-form']");
	By addshortentry=By.xpath("//a[@data-qa='tempates-form-add-short-entry']");
	By addeitheror=By.xpath("//a[@data-qa='tempates-form-add-either-or']");
	By termtitle=By.xpath("//input[@id='title']");
	By templatetitle=By.xpath("//input[@data-qa='template-title']");
	By columnheader=By.xpath("//input[@data-qa='template-column-header']");
	By choice2=By.xpath("//input[@data-qa='form-template-question-choice2']");
	By choice1=By.xpath("//input[@data-qa='form-template-question-choice1']");
	By termdescription=By.xpath("//textarea[@id='description']");
	By templatedescription=By.xpath("//textarea[@data-qa='template-description']");
	By termselecthier=By.xpath("//select[@id='organisation']");
	By termstart=By.xpath("//input[@name='startdate']");
	By termend=By.xpath("//input[@name='enddate']");
	By tsavebtn=By.xpath("//button[@id='save-btn']");
	By firstterm=By.xpath("//div[@class='listView']/div[2]/div[1]/div[1]/label");
	By firsttemplate=By.xpath("//div[@data-qa='templates-table']/div[2]/div[1]/div[1]/div/label");
	By deleteterm=By.xpath("//a[@id='delete-term']");
	By deletetemplate=By.xpath("//button[@data-qa='tempates-delete']");
	By tconfirmdelete=By.xpath("//button[@id='delete-btn']");
	By templateconfirmdelete=By.xpath("//button[@data-qa='template-confirm-delete']");
	By tconfirmmessage=By.xpath("//div[@class='modal-body']/div/p[1]");
	By templateconfirmmessage=By.xpath("//p[@data-qa='template-delete-confirmation-text']");
	By tpopupmessage=By.xpath("//div[@class='notification-delete-results_title']");
	By trashcanmenu=By.xpath("//a[@href='#admin/trashcan']");
	By assessmentscalesmenu=By.xpath("//a[@href='#admin/assessmentScales']");
	By learningobjectivesmenu=By.xpath("//a[@href='#admin/objectives/repositories']");
	By originalrepository=By.xpath("//a[contains(text(), 'Original Repository')]");
	By importLO=By.xpath("//a[@id='objectives-files-import']");
	By chooseLOfile=By.xpath("//input[@id='chose-file']");
	By importselected=By.xpath("//a[@id='import-selected']");
	By numberofLO=By.xpath("//div[@class='listView_itemsContainer']/a");
//	By addedLO=By.xpath("//div[contains(text(), 'Toetstermen Digitale vaardigheden')]/../div[1]");
	By addedLO1=By.xpath("//div[contains(text(), 'Folder1 Description')]/../div[1]");
	By addedLO2=By.xpath("//div[contains(text(), 'Subject1 Description')]/../div[1]");
	By deleteLO=By.xpath("//a[@id='delete-learning-objectives']");
	By taxonomiesmenu=By.xpath("//a[@href='#admin/taxonomies']");
	By labelsmenu=By.xpath("//a[@href='#admin/labels']");
	By regionalsettingsmenu=By.xpath("//a[@href='#admin/regionalsettings']");
	By rolesmenu=By.xpath("//a[@href='#admin/roles']");
	By integrationsmenu=By.xpath("//a[@href='#admin/webServices']");
	By imslismenu=By.xpath("//a[@href='#admin/imsMappings']");
	By safeexambrowsermenu=By.xpath("//a[@href='#admin/safe-exam-browser']");
	

	public Admin(WebDriver driver)
	{
		this. driver=driver;
	}
	
	Date testDateString = new Date();
    DateFormat df = new SimpleDateFormat("dd/MM/yy");
    String todaysDate = df.format(testDateString);
    
    Date testDifDateString = new Date();
    DateFormat sf = new SimpleDateFormat("MM/dd/yy");
    String todaysDifDate = sf.format(testDifDateString);
    
    Date testDateStrings = new Date();
    DateFormat dfs = new SimpleDateFormat("yyMMddHHmmss");
    String todaysDatesec = dfs.format(testDateStrings);
	
    private void waitforelementandclick(By element)
    {
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
		    myDynamicElement.click(); 
    }
    
    private void waitforelementtext(By element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));        
	  }
	
	public Integer countsavebutton()
	{
		Number countsavebutton;
		countsavebutton= driver.findElements(savebtn).size();
		return countsavebutton.intValue();
	}
	
	public void clickadduser() throws InterruptedException
	{
		
		waitforelementandclick(adminmenu);
		waitforelementandclick(usersmenu);
//		driver.findElement(usersmenu).click();
		waitforelementandclick(adduser);
//		Thread.sleep(3000);
//		driver.findElement(adduser).click();
	}
	
	public void fillInNewUserCandidate() throws InterruptedException
	{

//		Assert.assertEquals(driver.findElement(firstnametitle).getText(), "FirstName");
		Thread.sleep(2000);
		waitforelementtext(firstnametitle, "First name");
		driver.findElement(role).sendKeys("Candidate");
	    driver.findElement(firstname).sendKeys("Automated");
	    driver.findElement(lastname).sendKeys("TestUser");
	    driver.findElement(username).sendKeys(todaysDatesec); //username is unique now
	    driver.findElement(email).sendKeys("teodor.vasile@cirrusassessment.com");
	    driver.findElement(candidateid).sendKeys(todaysDatesec); //candidate id is unique now
	    driver.findElement(hierarchy).sendKeys("Automated tests \\ Automated Teo");
	    driver.findElement(password).sendKeys("abc123");
	    driver.findElement(repassword).sendKeys("abc123");
	    driver.findElement(savebtn).click();
	    Thread.sleep(3000);
	    Assert.assertTrue(countsavebutton() == 0); 
	}
	
	public void searchuser () throws InterruptedException
	{
//		driver.get("https://atests.cirrusbeta.com/author/app#admin");
		driver.navigate().refresh();
		waitforelementandclick(usersmenu);
//		driver.findElement(usersmenu).click();
		waitforelementandclick(searchuser);
		Thread.sleep(3000);
		driver.findElement(searchuser).sendKeys("Automated");
		driver.findElement(searchuser).sendKeys(Keys.RETURN);
		waitforelementtext(footertext, "Total 1 item(s) found | Show");
//		driver.findElement(usertitle).click();
		
	}
	
	public void assertsearcheduser () throws InterruptedException
	{
		Thread.sleep(4000);
		Assert.assertEquals(driver.findElement(namecolumn).getText(), "Automated TestUser");
	}
	
	public void deleteallusers () throws InterruptedException
	{
		Assert.assertEquals(driver.findElement(footertext).getText(), "Total 1 item(s) found | Show");
		/*driver.findElement(checkallcheckbox).click();
		Thread.sleep(1000);*/
		driver.findElement(checkallcheckbox).click(); //to be removed after the bug with select all is fixed
		driver.findElement(deleteuser).click();
		driver.findElement(deleteuserconfirm).click();
		waitforelementtext(footertext, "Total 0 item(s) found | Show");
		/*Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(footertext).getText(), "Total 0 item(s) found | Show");*/ 
	}
	
	public void importusers () throws InterruptedException
	{
		waitforelementandclick(adminmenu);
		driver.findElement(usersmenu).click();
		Thread.sleep(2000);
	    driver.findElement(importusers).sendKeys("C:\\Users\\Teodor\\Desktop\\Teos import list.xlsx");
	    Thread.sleep(2000);
	    driver.findElement(ifirstname).sendKeys("1st name");
	    driver.findElement(ilastname).sendKeys("2nd name");
	    driver.findElement(iusername).sendKeys("User"); //should be unique
	    driver.findElement(ipassword).sendKeys("Parola"); 
	    driver.findElement(inumber).sendKeys("ID"); //should be unique
	    driver.findElement(iemail).sendKeys("Mail"); //should be unique
	    driver.findElement(irole).sendKeys("Candidate");
	    driver.findElement(ihierarchy).sendKeys("Automated tests \\ Automated Teo");
	    driver.findElement(itryimportbtn).click();
	    waitforelementtext(iconfirmmessage, "1");
	    /*Thread.sleep(4000);
	    Assert.assertEquals(driver.findElement(iconfirmmessage).getText(), "How many rows in the file that have been imported: 1", "Probably the import file was not updated");*/
	    driver.findElement(iimportbtn).click();
	    Thread.sleep(2000);
	}
	
	public void emptyTrashCan () throws InterruptedException
	{
		driver.navigate().refresh();
		waitforelementandclick(adminmenu);
		waitforelementandclick(trashcanmenu);
		Thread.sleep(2000);
		waitforelementandclick(checkallcheckbox); 
		waitforelementandclick(deletepermanently); 
		driver.findElement(deleteuserconfirm).click();
		waitforelementtext(footertext, "Total 0 item(s) found | Show");
		
	}
	
	public void addhierarchy () throws InterruptedException
	{
//		driver.get("https://atests.cirrusbeta.com/author/app#admin"); 
		driver.navigate().refresh();
		waitforelementandclick(hierarchiesmenu);
		waitforelementandclick(createhierarchy);
		driver.findElement(htitle).sendKeys("Automated Hierarchy");
		/*driver.findElement(hallowcollections).click();
		driver.findElement(hallowassessments).click();*/
		Thread.sleep(2000);
		driver.findElement(hsavebtn).click();
		Thread.sleep(3000);
	    Assert.assertTrue(countsavebutton() == 0);
	}
	
	public void deletehierarchy () throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(addedhierarchy).click();
	    driver.findElement(hdeletebutton).click();
	    Thread.sleep(2000);
	    Assert.assertEquals(driver.findElement(hconfirmmessage).getText(), "Are you sure you want to delete this hierarchy \"Automated Hierarchy\"?");
	    driver.findElement(hconfirmdelete).click();
	    Thread.sleep(1000);
	    driver.findElement(popupconfdelete).click();
	    Assert.assertEquals(driver.findElement(popupconfdelete).getText(), "Hierarchy was successfully deleted"); 
	}
	
	public void addqualification () throws InterruptedException
	{
		driver.navigate().refresh();
		waitforelementandclick(qualificationsmenu);
		waitforelementandclick(addqualification);
		waitforelementtext(testqualification, "Automated Tests");
		driver.findElement(qualtitle).sendKeys("Automated Qualification");
		driver.findElement(qualdescription).sendKeys("Test Automated Description");
		driver.findElement(qualselecthier).sendKeys("Automated tests \\ Automated Teo");
		driver.findElement(addhierarchytoqual).click();
		driver.findElement(qsavebtn).click();
		Thread.sleep(3000);
	    Assert.assertTrue(countsavebutton() == 0); 
	}
	
	public void deletequalification () throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(firstqualification).click();
	    driver.findElement(deletequalification).click();
	    Thread.sleep(2000);
	    Assert.assertEquals(driver.findElement(qconfirmmessage).getText(), "Are you sure you want to delete this qualification \"Automated Qualification\"?");
	    driver.findElement(qconfirmdelete).click();
	    Thread.sleep(1000);
	    Assert.assertEquals(driver.findElement(qpopupmessage).getText(), "Automated Qualification");
	}
	
	public void addterm () throws InterruptedException
	{
		driver.navigate().refresh();
		waitforelementandclick(termsmenu);
		waitforelementandclick(addterm);
		driver.findElement(termtitle).sendKeys("Automated Term");
		driver.findElement(termdescription).sendKeys("Test Automated Description");
		Thread.sleep(1000);
		driver.findElement(termselecthier).sendKeys("Automated tests \\ Automated Teo");
		Thread.sleep(1000);
		driver.findElement(termstart).sendKeys(todaysDate);
		Thread.sleep(1000);
		driver.findElement(termend).clear();
		driver.findElement(termend).sendKeys(todaysDate);
		Thread.sleep(1000);
		/*waitforelementandclick(termstart);
		waitforelementandclick(termdescription);
		Thread.sleep(1000);*/
		driver.findElement(qsavebtn).click();
		Thread.sleep(3000);
	    Assert.assertTrue(countsavebutton() == 0);
	}
	
	public void deleteterm () throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(firstterm).click();
	    driver.findElement(deleteterm).click();
	    Thread.sleep(2000);
	    Assert.assertEquals(driver.findElement(tconfirmmessage).getText(), "Are you sure you want to delete this term \"Automated Term\"?");
	    driver.findElement(tconfirmdelete).click();
	    Thread.sleep(1000);
	    Assert.assertEquals(driver.findElement(tpopupmessage).getText(), "Automated Term");
	}
	
	public void addNDA () throws InterruptedException
	{
		driver.navigate().refresh();
		waitforelementandclick(templatesmenu);
		waitforelementandclick(addarrow);
		waitforelementandclick(addNDA);
		driver.findElement(templatetitle).sendKeys("Automated Template Title");
		driver.findElement(templatedescription).sendKeys("Test Automated Description");
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Main Text test").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Decline Text test").perform();
		driver.findElement(templatesavebtn).click();
		Thread.sleep(3000);
	}
	
	public void deleteNDA () throws InterruptedException
	{
		driver.findElement(firsttemplate).click();
	    driver.findElement(deletetemplate).click();
	    Thread.sleep(2000);
	    Assert.assertEquals(driver.findElement(templateconfirmmessage).getText(), "Are you sure you want to delete this template \"Automated Template Title\"?", "Wrong template selected to delete");
	    driver.findElement(templateconfirmdelete).click();
	    Thread.sleep(1000);
	    Assert.assertEquals(driver.findElement(tpopupmessage).getText(), "Automated Template Title");
	}
	
	public void addRegistrationForm () throws InterruptedException
	{
		driver.navigate().refresh();
		waitforelementandclick(templatesmenu);
		waitforelementandclick(addarrow);
		waitforelementandclick(addform);
		driver.findElement(templatetitle).sendKeys("Automated Registration Form Title");
		driver.findElement(templatedescription).sendKeys("Test Automated Description");
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Welcome text").perform();
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Finish text").perform();
		waitforelementandclick(addquestionarrow);
		waitforelementandclick(addshortentry);
		driver.findElement(columnheader).sendKeys("Automated Column Header");
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Main Text test short entry").perform();
		driver.findElement(templatesavebtn).click();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 1000);");
		waitforelementandclick(addquestionarrow);
		waitforelementandclick(addeitheror);
		driver.findElement(choice2).sendKeys("Automated Choice 2");
		driver.findElement(choice1).sendKeys("Automated Choice 1");
		driver.findElement(columnheader).sendKeys("Automated Column Header");
		new Actions(driver).sendKeys(Keys.TAB).perform();
		new Actions(driver).sendKeys("Main Text test either or").perform();
		driver.findElement(templatesavebtn).click();
		Thread.sleep(3000);
		driver.findElement(templatesavebtn).click();
		Thread.sleep(3000);
		
	}
	
	public void deleteRegistrationForm () throws InterruptedException
	{
		driver.findElement(firsttemplate).click();
	    driver.findElement(deletetemplate).click();
	    Thread.sleep(2000);
	    Assert.assertEquals(driver.findElement(templateconfirmmessage).getText(), "Are you sure you want to delete this template \"Automated Registration Form Title\"?", "Wrong template selected to delete");
	    driver.findElement(templateconfirmdelete).click();
	    Thread.sleep(1000);
	    Assert.assertEquals(driver.findElement(tpopupmessage).getText(), "Automated Registration Form Title");
	}
	
	public void importLO () throws InterruptedException 
	{
		driver.navigate().refresh();
//		waitforelementandclick(adminmenu);
		waitforelementandclick(learningobjectivesmenu);
		waitforelementandclick(originalrepository);
		waitforelementandclick(importLO);
		Thread.sleep(3000);
		driver.findElement(chooseLOfile).sendKeys("C:\\Users\\Teodor\\Desktop\\import-lo-example_subject.xlsx");
		Thread.sleep(2000);
		waitforelementandclick(importselected);
		Thread.sleep(2000);
		Assert.assertEquals((driver.findElements(numberofLO)).size(), 3, "Incorrect number of LO in the list:");		
	}
	
	public void deleteLO () throws InterruptedException 
	{
		waitforelementandclick(addedLO1);
		waitforelementandclick(addedLO2);
		waitforelementandclick(deleteLO);
		waitforelementandclick(tconfirmdelete);
		Thread.sleep(1000);
		Assert.assertEquals((driver.findElements(numberofLO)).size(), 1, "Incorrect number of LO in the list:");
			
	}
	
}
