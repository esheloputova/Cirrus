/**
 * 
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author Teodor
 * 		This class will store all the locators and methods of Assessments page
 */
public class Assessments {

	WebDriver driver;
	
	By assessmentsmenu=By.xpath("//i[@class='icon icon-graph2']");
	By addassessment=By.xpath("//button[@data-qa='assessments-add']");
	By formativeassessment=By.xpath("//div[@data-qa='assessments-create-formative']");
	By summativeassessment=By.xpath("//div[@data-qa='assessments-create-summative']");
	By mixedassessment=By.xpath("//div[@data-qa='assessments-create-mixed']");
	By assessmentdescription=By.xpath("//div[@data-qa='assessments-create-description']");
	By saveandclose=By.xpath("//button[@data-qa='assessments-create-save']");
	By title=By.xpath("//input[@id='a-title']");
	By code=By.xpath("//input[@id='a-code']");
	By qualification=By.xpath("//select[@data-qa='assessment-i-qualification']");
	By addbtn=By.xpath("//button[@id='add-item']");
	By savebtn=By.xpath("//button[@id='save-btn']");
	By finishtitle=By.xpath("//div[@class='right-panel']/div[2]/div/h5");
	By pagetitle=By.xpath("//div[@class='global-page-title']");
	By ckeditorintro=By.xpath("//div[@id='a-i-intro']/div/div/div/div/div/div/iframe");
	By addwelcomepage=By.xpath("//button[@data-qa='assessment-pages-before-add']");
	By addfinishpage=By.xpath("//button[@data-qa='assessment-pages-after-add']");
	By pagetype=By.xpath("//select[@data-qa='add-assessment-page-dropdown']");
	By tableheader=By.xpath("//div[@data-qa='add-assessment-page-table']");
	By firstwelcomepage=By.xpath("//div[@data-qa='add-assessment-page-table']/div[2]/div[1]/div[3]/a");
	By addedwelcomepage=By.xpath("//div[contains(text(), 'automated test w ts welcome screen')]");
	By addedfinishpage=By.xpath("//div[contains(text(), 'automated test finish screen')]");
	By ckeditorfinish=By.xpath("//div[@id='cke_a-finish']/div/div/iframe");
	By optionstab=By.xpath("//div[contains(text(), 'options')]");
	By timeallowed=By.xpath("//select[@data-qa='assessment-o-maxTime']");
	By passmark=By.xpath("//input[@id='passMarkValue']");
	By nrofattempts=By.xpath("//label[@for='attempts']/../div/div/div/select");
	By assessmentscale=By.xpath("//select[@data-qa='assessment-o-scale']");
	By scale2=By.xpath("//select[@data-qa='assessment-o-scale']/option[3]");
	By qinrandomorder=By.xpath("//div[@id='a-o-nav']/div/div/div/div[2]/div/div/label");
	By usepin=By.xpath("//div[@id='a-o-security']/div/div/div/div[2]/div/div/label");
	By questiontab=By.xpath("//div[contains(text(), 'question selection')]");
	By generatetab=By.xpath("//div[contains(text(), 'generate assessment')]");
	By firstquestionfromlist=By.xpath("//div[@class='listView listView__questionSelection']/div[2]/div[1]/div[1]");
	By footertext=By.xpath("//div[@class='eas-pagination-pagerSize']/span[1]");
	By assessmentwithregistration=By.xpath("//a[contains(text(), 'Registration')]");
	By burgericon=By.xpath("//i[@class='fa fa-bars']");
	By filterpsychometrics=By.xpath("//span[contains(text(), 'Psychometrics')]");
	By filterpsychometrics2=By.xpath("//span[contains(text(), 'Psychometrics2')]");
	By totalitems=By.xpath("//span[@data-qa='table-sizer-total']");
	By qaavailable=By.xpath("//div[@data-qa='assessment-qs-available']/span[2]");
	By qaselected=By.xpath("//div[@data-qa='assessment-qs-available']/span[1]");
	By tablecheckall=By.xpath("//label[@data-qa='table-check-all']");
	By addselected=By.xpath("//button[@data-qa='manual-selection-add-questions']");
//	By itemsfootertext=By.xpath("//span[contains(text(), 'Total 28 item(s) found | Show')]");
	By selectedquestions=By.xpath("//label[@for='selected-q']/span[2]");
	By createform=By.xpath("//button[@data-qa='assessment-ga-create']");
	By addsection=By.xpath("//a[@data-qa='assessment-f-section']");
	By sectionradiobtn=By.xpath("//div[@data-qa='select-section-table']/div[2]/div/div[1]/div");
	By fixedassessment=By.xpath("//label[@data-qa='label-gen-form-fixed']");
	By randomassessment=By.xpath("//label[@data-qa='label-gen-form-random']");
	By selectquestions=By.xpath("//a[@href='selectQuestions']");
	By firstavailablequestion=By.xpath("//div[@data-qa='available-questions']/div[2]/div[1]/div[1]");
	By dropsection=By.xpath("//div[@data-qa='selected-questions']");
	By sectionoptions=By.xpath("//a[@href='options']");
	By maxtimeallowed=By.xpath("//input[@data-qa='section-duration']");
	By sectionsavebtn=By.xpath("//button[@data-qa='saveAndClose']");
	By addedsection=By.xpath("//div[contains(text(), 'Timed Section')]");
	By sectiontimer=By.xpath("//div[contains(text(), 'Timed Section')]/../div[3]/span[2]");
	By generatenumber=By.xpath("//input[@data-qa='add-hierarchy-title']");
	By wizardbtn=By.xpath("//button[@data-qa='assessment-menu']");
	By preview=By.xpath("//li[@data-qa='assessment-menu-preview']");
	By candidate=By.xpath("//a[@href='candidate']");
	By iframe=By.xpath("//iframe[@class='frame-lLjpZ']");
	By acceptNDA=By.xpath("//label[@data-qa='label-nda-accept']");
	By startassessmentbtn=By.xpath("//button[@data-qa='go-to-next-step-button']");
	By gotonextpage=By.xpath("//button[@data-qa='go-to-next-page-button']");
	By shortanswerfield=By.xpath("//div[@class='page-content-3-VUa']/div/div[1]/div/div[2]/section/textarea");
	By eitherorlabel=By.xpath("//div[@class='page-content-3-VUa']/div/div[2]/div/div[2]/section/div[2]/label");
	By multiplechoicelabel=By.xpath("//div[@class='page-content-3-VUa']/div/div[3]/div/div[2]/section/div[2]/label");
	By multipleresponselabel1=By.xpath("//div[@class='page-content-3-VUa']/div/div[4]/div/div[2]/section/div[2]/label");
	By multipleresponselabel2=By.xpath("//div[@class='page-content-3-VUa']/div/div[4]/div/div[2]/section/div[3]/label");
	By confirmregform=By.xpath("//button[@data-qa='submit-reg-form-confirmation-ok']");
	By status=By.xpath("//select[@data-qa='publish-assessment-status']");
	By difficulty=By.xpath("//div[@class='row infoboxes on-content']/div[1]/div/div/div[2]");
	By backfromsection=By.xpath("//span[@title='Teos automated test assessment with timed section'][1]");
	By publish=By.xpath("//button[@data-qa='control-link']");
	By publishassessment=By.xpath("//button[@data-qa='assessment-publish']");
	By goback=By.xpath("//a[@href='#assessments']");
	By usesimplewf=By.xpath("//label[@data-qa='label-publish-markingWf-simple']");
	By popupacollectionadded=By.xpath("//strong[@class='mr5']");
	By backbtn=By.xpath("//a[@href='#assessments']");
	By checkboxaddedassessment=By.xpath("//a[contains(text(), 'Teos automated test assessment')]/../../div[1]");
	By qselectionassessment=By.xpath("//a[contains(text(), 'Teos automated test assessment')]/../../div[6]");
	By checkboxaddedassessment2=By.xpath("//a[contains(text(), 'Teos automated Blueprint assessment')]/../../div[1]");
	By qselectionassessment2=By.xpath("//a[contains(text(), 'Teos automated Blueprint assessment')]/../../div[6]");
	By removeassessment=By.xpath("//button[@id='remove-assessment']");
	By confirmdelete=By.xpath("//button[@id='delete-btn']");
	By blueprint=By.xpath("//div[@id='a-i-type']/div/div/div[2]/div/div/label");
	By checked=By.xpath("//label[@class='checked']");
	By selLO=By.xpath("//button[@data-qa='assessment-qs-addLO']");
	By originalFolder=By.xpath("//div[@title='Original Folder'][1]");
	By originalSubject=By.xpath("//div[@title='Original Subject'][1]");
	By checkboxLO=By.xpath("//label[@class='checkbox-inline']");
	By ok=By.xpath("//div[@class='m-f-main-reg']/div/button");
	By selTax=By.xpath("//select[@data-qa='assessment-bp-taxonomy']");
	By understTax=By.xpath("//select[@data-qa='assessment-bp-taxonomy']/option[2]");
	By totalnr=By.xpath("//tbody/tr[1]/td[7]");
	By maxnr=By.xpath("//tbody/tr[1]/td[6]/input");
	By maxnr2=By.xpath("//tbody/tr[2]/td[6]/input");
	By generateditems=By.xpath("//div[@id='generated-items']");
	By librarymenu=By.xpath("//i[@class='icon icon-notebook']");
	By itemstab=By.xpath("//a[@data-section='items']");
	By donemeter=By.xpath("//div[@data-qa='publish-list-todo']");
	By saveassessment=By.xpath("//button[contains(text(), 'Save')]");
	By createbtn=By.xpath("//button[@data-qa='assessment-gf-save']");
	By saveconftxt=By.xpath("//div[contains(text(), 'All changes have been saved')]");
	By addedform=By.xpath("//a[contains(text(), 'Teos automated test assessment with timed section')]");
	By createdform=By.xpath("//a[contains(text(), 'Psychometrics')]");
	By question1=By.xpath("//td[contains(text(), 'Either/Or')]/../td[1]/div");
	By place1=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[1]");
	By question2=By.xpath("//td[contains(text(), 'Order')]/../td[1]/div");
	By place2=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[2]");
	By question3=By.xpath("//td[contains(text(), 'Multiple response')]/../td[1]/div");
	By place3=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[3]");
	By question4=By.xpath("//td[contains(text(), 'Multiple choice')]/../td[1]/div");
	By place4=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[4]");
	By question5=By.xpath("//td[contains(text(), 'Fill in the blank')]/../td[1]/div");
	By place5=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[5]");
	By question6=By.xpath("//td[contains(text(), 'Short answer')]/../td[1]/div");
	By place6=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[6]");
	By question7=By.xpath("//td[contains(text(), 'Select from list')]/../td[1]/div");
	By place7=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[7]");
	By question8=By.xpath("//td[contains(text(), 'Hotspot')]/../td[1]/div");
	By place8=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[8]");
	By question9=By.xpath("//td[contains(text(), 'Numeric')]/../td[1]/div");
	By place9=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[9]");
	By question10=By.xpath("//span[contains(text(), 'This is a multiple response question Polytomous')]/../../td[1]/div");
	By place10=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[10]");
	By question11=By.xpath("//span[contains(text(), 'This is a Select from list type of question. Select distractor 5 and distractor 6. Polytomous')]/../../td[1]/div");
	By place11=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[11]");
	By question12=By.xpath("//span[contains(text(), 'This is a Fill in the blank type of question. Polytomous')]/../../td[1]/div");
	By place12=By.xpath("//table[@data-sortable-container-id='assessmentQuestionsTable']/tbody/tr[12]");
	By q9checkbox=By.xpath("//table[@data-qa='assessment-questions-table']/tbody/tr[9]/td[2]/div/label");
	By q10checkbox=By.xpath("//table[@data-qa='assessment-questions-table']/tbody/tr[10]/td[2]/div/label");
	By q11checkbox=By.xpath("//table[@data-qa='assessment-questions-table']/tbody/tr[11]/td[2]/div/label");
	By q12checkbox=By.xpath("//table[@data-qa='assessment-questions-table']/tbody/tr[12]/td[2]/div/label");
	By q13checkbox=By.xpath("//table[@data-qa='assessment-questions-table']/tbody/tr[13]/td[2]/div/label");
	By q14checkbox=By.xpath("//table[@data-qa='assessment-questions-table']/tbody/tr[14]/td[2]/div/label");
	By includeitems=By.xpath("//button[@data-qa='assessment-f-include']");
	
	
	By gobackpsycho=By.xpath("//span[@title='Psychometrics'][1]");
	
	public Assessments(WebDriver driver)
	{
	      this. driver=driver;
	}
	
	
	
	private void waitforelementtext(By element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text)); }
		    
	private void waitforelementandclick(By element) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
			    myDynamicElement.click(); }
				    
		    
	
	
	
	public void addAssessmentManual(String name) throws InterruptedException
	
	{
		waitforelementandclick(assessmentsmenu);
		waitforelementtext(footertext, "Total 5 item(s) found | Show");
		waitforelementandclick(addassessment);
		waitforelementandclick(mixedassessment);
		waitforelementtext(assessmentdescription, "Allows you to create a mixed assessment. This assessment type is a mix of formative and summative assessment. Choosing this assessment types enables you to select both formative and summative item types.");
		waitforelementandclick(saveandclose);
		waitforelementandclick(title);
		Thread.sleep(1000);
		driver.findElement(title).sendKeys(name);
		driver.findElement(code).sendKeys("69");
		waitforelementandclick(qualification);
		driver.findElement(qualification).sendKeys("Original Qualification");
		driver.findElement(addbtn).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down 
		jse.executeScript("scroll(0, 1000);");
//		the following two assertion are not available anymore since the title doesn't update automatically anymore (https://eassessment.atlassian.net/browse/CR-4576)
		/*Assert.assertEquals(driver.findElement(pagetitle).getText(), "Teos automated test assessment - Information", "Incorrect assessment name:");
		Assert.assertEquals(driver.findElement(checked).getText(), "Manual question selection", "Incorrect assessment type:");*/
		
		
	}
	
	public void addAssessmentBlueprint() throws InterruptedException 
	
	{
		waitforelementandclick(assessmentsmenu);
		waitforelementtext(footertext, "Total 5 item(s) found | Show");
		waitforelementandclick(addassessment);
		waitforelementandclick(mixedassessment);
		waitforelementandclick(saveandclose);
		waitforelementandclick(title);
		Thread.sleep(1000);
		driver.findElement(title).sendKeys("Teos automated Blueprint assessment");
		driver.findElement(code).sendKeys("70");
		driver.findElement(qualification).sendKeys("Original Qualification");
		driver.findElement(addbtn).click();
		waitforelementandclick(blueprint);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down 
		jse.executeScript("scroll(0, 1000);");

		
		
	}
	
	public void addAssessmentManualWithTimedSection() throws InterruptedException
	
	{
		waitforelementandclick(assessmentsmenu);
		waitforelementtext(footertext, "Total 5 item(s) found | Show");
		waitforelementandclick(addassessment);
		waitforelementandclick(mixedassessment);
		waitforelementtext(assessmentdescription, "Allows you to create a mixed assessment. This assessment type is a mix of formative and summative assessment. Choosing this assessment types enables you to select both formative and summative item types.");
		waitforelementandclick(saveandclose);
		waitforelementandclick(title);
		Thread.sleep(1000);
		driver.findElement(title).sendKeys("Teos automated test assessment with timed section");
		driver.findElement(code).sendKeys("71");
		driver.findElement(qualification).sendKeys("Original Qualification");
		driver.findElement(addbtn).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down 
		jse.executeScript("scroll(0, 1000);");
		
		
	}
		
	public void setInformation() throws InterruptedException 
	
	{
		
		waitforelementandclick(addwelcomepage);
		waitforelementandclick(tableheader);
		driver.findElement(pagetype).sendKeys("Welcome screen");
		waitforelementandclick(firstwelcomepage);
		waitforelementandclick(addedwelcomepage);
		waitforelementandclick(addfinishpage);
		waitforelementandclick(tableheader);
		driver.findElement(pagetype).sendKeys("Finish screen");
		waitforelementandclick(firstwelcomepage);
		waitforelementandclick(addedfinishpage);
		waitforelementandclick(saveassessment);
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls up 
		jse.executeScript("scroll(0, -1000);");
		
	}
	
	public void setOptions() throws InterruptedException 
	
	{
		driver.findElement(optionstab).click();
		Thread.sleep(1000);
		driver.findElement(timeallowed).sendKeys("60");
		driver.findElement(passmark).clear();
		driver.findElement(passmark).sendKeys("20");
		driver.findElement(nrofattempts).sendKeys("30");
		driver.findElement(assessmentscale).click();
		waitforelementandclick(scale2);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down 
		jse.executeScript("scroll(0, 1200);");
//		waitforelementandclick(qinrandomorder);
//		driver.findElement(qinrandomorder).click();
//		driver.findElement(usepin).click();
		waitforelementandclick(saveassessment);
		Thread.sleep(1000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver; //scrolls up 
		jse1.executeScript("scroll(0, -1200);");
		
	}
	    
	public void questionSelectionManual() throws InterruptedException 
	
	{
		driver.findElement(questiontab).click();
		waitforelementtext(qaselected, "0");
		waitforelementtext(qaavailable, "29");
		driver.findElement(tablecheckall).click();
		driver.findElement(addselected).click();
		Thread.sleep(5000);
		waitforelementtext(qaselected, "29");
				
	}
	
	public void questionSelectionPsychometrics() throws InterruptedException 
	
	{
		driver.findElement(questiontab).click();
		waitforelementtext(qaselected, "0");
		waitforelementtext(qaavailable, "43");
		waitforelementandclick(burgericon);
		waitforelementandclick(filterpsychometrics);
		waitforelementtext(totalitems, "Total 8 item(s) found | Show");
		driver.findElement(tablecheckall).click();
		driver.findElement(addselected).click();
		Thread.sleep(5000);
		waitforelementtext(qaselected, "8");
				
	}

	
	
	public void questionSelectionBlueprint() throws InterruptedException 
	
	{
		driver.findElement(questiontab).click();
		driver.findElement(selLO).click();
		waitforelementandclick(originalFolder);
		waitforelementandclick(originalSubject);
		waitforelementandclick(checkboxLO);
		waitforelementandclick(ok);
		waitforelementandclick(selTax);
		waitforelementandclick(understTax);
//		driver.findElement(ok).click();
		waitforelementtext(totalnr, "3");
		driver.findElement(maxnr).clear();
		driver.findElement(maxnr).sendKeys("3");
		driver.findElement(maxnr2).clear();
		driver.findElement(maxnr2).sendKeys("3");
		Thread.sleep(2000);
		
	}

	public void addTimedSection() throws InterruptedException
	
	{
		driver.findElement(generatetab).click();
		waitforelementandclick(createform);
		waitforelementandclick(fixedassessment);
		driver.findElement(generatenumber).clear();
		driver.findElement(generatenumber).sendKeys("14");
		waitforelementandclick(createbtn);
		Thread.sleep(1000);
		waitforelementandclick(addedform);
		Thread.sleep(2000);
		waitforelementandclick(addsection);
		waitforelementandclick(sectionradiobtn);
		waitforelementandclick(selectquestions);
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(firstavailablequestion), driver.findElement(dropsection)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(firstavailablequestion), driver.findElement(dropsection)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(firstavailablequestion), driver.findElement(dropsection)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(firstavailablequestion), driver.findElement(dropsection)).perform();
		waitforelementandclick(sectionoptions);
		driver.findElement(maxtimeallowed).sendKeys("47");
		driver.findElement(sectionsavebtn).click();
		waitforelementandclick(addedsection);
//		Assert.assertEquals(driver.findElement(addedsection).getText(), "Timed Section", "Section is not present or has incorrect name");
		Assert.assertEquals(driver.findElement(sectiontimer).getText(), "max time (minutes): 47", "Time of the sectin is incorrect");
		waitforelementandclick(backfromsection);
		
	}
	
	public void generateAssessmentWithSection() throws InterruptedException
	
	{
		
		waitforelementandclick(publish);
		waitforelementandclick(usesimplewf);
		driver.findElement(status).sendKeys("Live");
		waitforelementtext(donemeter, "You are all set and can publish the assessment");
		Thread.sleep(2000);
		driver.findElement(publishassessment).click();
		Thread.sleep(1000);
//		waitforelementandclick(popupacollectionadded);
//	    Assert.assertEquals(driver.findElement(popupacollectionadded).getText(), "success!");
		driver.findElement(backbtn).click();
		waitforelementtext(footertext, "Total 6 item(s) found | Show");
	}
	
	public void generateAssessment() throws InterruptedException
	
	{
		driver.findElement(generatetab).click();
		waitforelementandclick(createform);
		waitforelementandclick(fixedassessment);
		driver.findElement(generatenumber).clear();
		driver.findElement(generatenumber).sendKeys("11");
		Thread.sleep(2000);
		waitforelementandclick(createbtn);
		waitforelementandclick(publish);
		waitforelementandclick(usesimplewf);
		driver.findElement(status).sendKeys("Live");
		waitforelementtext(donemeter, "You are all set and can publish the assessment");
		Thread.sleep(4000);
		driver.findElement(publishassessment).click();
		Thread.sleep(2000);
		waitforelementandclick(goback);
	}
	
public void generateAssessmentPsycho() throws InterruptedException
	
	{
		driver.findElement(generatetab).click();
		waitforelementandclick(createform);
		waitforelementandclick(fixedassessment);
		driver.findElement(generatenumber).clear();
		driver.findElement(generatenumber).sendKeys("8");
		Thread.sleep(2000);
		waitforelementandclick(createbtn);
		waitforelementandclick(createdform);
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 300);");
		Thread.sleep(4000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question1), driver.findElement(place1)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question1), driver.findElement(place1)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question2), driver.findElement(place2)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question2), driver.findElement(place2)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question3), driver.findElement(place3)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question3), driver.findElement(place3)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question4), driver.findElement(place4)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question4), driver.findElement(place4)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question5), driver.findElement(place5)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question5), driver.findElement(place5)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question6), driver.findElement(place6)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question6), driver.findElement(place6)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question7), driver.findElement(place7)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question7), driver.findElement(place7)).perform();
		
		jse.executeScript("scroll(0, -1000);");
		waitforelementandclick(gobackpsycho);
		
		//add questions from Psychometrics2
		driver.findElement(questiontab).click();
		waitforelementtext(qaselected, "8");
		waitforelementtext(qaavailable, "43");
		waitforelementandclick(burgericon);
		waitforelementandclick(filterpsychometrics);
		Thread.sleep(1000);
		waitforelementandclick(filterpsychometrics2);
		waitforelementtext(totalitems, "Total 6 item(s) found | Show");
		driver.findElement(tablecheckall).click();
		driver.findElement(addselected).click();
		Thread.sleep(5000);
		waitforelementtext(qaselected, "14");
		driver.findElement(generatetab).click();
		waitforelementandclick(createdform);
		Thread.sleep(3000);
		jse.executeScript("scroll(0, 1000);");
		Thread.sleep(2000);
		driver.findElement(q9checkbox).click();
		driver.findElement(q10checkbox).click();
		driver.findElement(q11checkbox).click();
		driver.findElement(q12checkbox).click();
		driver.findElement(q13checkbox).click();
		driver.findElement(q14checkbox).click();
		jse.executeScript("scroll(0, -1000);");
		waitforelementandclick(includeitems);
		jse.executeScript("scroll(0, 1000);");
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question9), driver.findElement(place9)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question9), driver.findElement(place9)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question10), driver.findElement(place10)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question10), driver.findElement(place10)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question11), driver.findElement(place11)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question11), driver.findElement(place11)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question12), driver.findElement(place12)).perform();
		Thread.sleep(2000);
		(new Actions(driver)).dragAndDrop(driver.findElement(question12), driver.findElement(place12)).perform();
		
		jse.executeScript("scroll(0, -1000);");
		
		
		Thread.sleep(2000);
		waitforelementandclick(gobackpsycho);
		
		waitforelementandclick(publish);
		Thread.sleep(2000);
		waitforelementandclick(usesimplewf);
		driver.findElement(status).sendKeys("Live");
		waitforelementtext(donemeter, "You are all set and can publish the assessment");
		Thread.sleep(4000);
		driver.findElement(publishassessment).click();
		Thread.sleep(2000);
		waitforelementandclick(goback);
	}
	
	public void generateRandomAssessment() throws InterruptedException
	
	{
		driver.findElement(generatetab).click();
		waitforelementandclick(createform);
		waitforelementandclick(randomassessment);
		Thread.sleep(1000);
		waitforelementandclick(createbtn);
		waitforelementandclick(saveconftxt);
		waitforelementandclick(publish);
		waitforelementandclick(usesimplewf);
		driver.findElement(status).sendKeys("Live");
		waitforelementtext(donemeter, "You are all set and can publish the assessment");
		Thread.sleep(4000);
		driver.findElement(publishassessment).click();
		Thread.sleep(2000);
		driver.findElement(backbtn).click();
		waitforelementtext(footertext, "Total 6 item(s) found | Show");
		

	}
	
	public void deleteAssessment()
	
	{
		waitforelementandclick(checkboxaddedassessment);
		Assert.assertEquals(driver.findElement(qselectionassessment).getText(), "Manual", "Incorrect question selection type");
		waitforelementandclick(removeassessment);
		waitforelementandclick(confirmdelete);
		waitforelementtext(footertext, "Total 5 item(s) found | Show");
	}
	
	public void deleteRandomAssessment()
	
	{
		waitforelementandclick(checkboxaddedassessment2);
		Assert.assertEquals(driver.findElement(qselectionassessment2).getText(), "Blueprint", "Incorrect question selection type");
		waitforelementandclick(removeassessment);
		waitforelementandclick(confirmdelete);
		waitforelementtext(footertext, "Total 5 item(s) found | Show");
	}
	
	public void previewAssessmentAsCandidate()
	
	{
		waitforelementandclick(assessmentsmenu);
		waitforelementtext(footertext, "Total 5 item(s) found | Show");
		waitforelementandclick(assessmentwithregistration);
		waitforelementandclick(wizardbtn);
		waitforelementandclick(preview);
		waitforelementandclick(candidate);
	}
	
	public void acceptNDA()
	
	{
		waitforelementandclick(iframe);
		driver.switchTo().frame(driver.findElement(iframe));
//		driver.switchTo().defaultContent();
		waitforelementandclick(acceptNDA);
		waitforelementandclick(startassessmentbtn);	
	}

	public void fillRegistrationForm() throws InterruptedException
	
	{
		waitforelementandclick(gotonextpage);
		waitforelementandclick(shortanswerfield);
		driver.findElement(shortanswerfield).sendKeys("Mihai Viteazul");
		driver.findElement(eitherorlabel).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 1000);");
		driver.findElement(multiplechoicelabel).click();
		driver.findElement(multipleresponselabel1).click();
		driver.findElement(multipleresponselabel2).click();
		driver.findElement(startassessmentbtn).click();
		Thread.sleep(2000);
		waitforelementandclick(confirmregform);
		Thread.sleep(2000);
		waitforelementandclick(startassessmentbtn);
		Thread.sleep(2000);
		waitforelementandclick(startassessmentbtn);
		
	}
	
}