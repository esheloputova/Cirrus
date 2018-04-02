/**
 * 
 */
package Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Teodor
 * 		This class will store all the locators and methods of Schedule page
 */
public class Schedule {

	WebDriver driver;
	
	By schedulemenu=By.xpath("//i[@class='icon icon-calendar-empty']");
	By addschedule=By.xpath("//button[@data-qa='schedule-add']");
	By psychometricsassessment=By.xpath("//div[contains(text(), 'Psychometrics')]/../div[7]/button");
	By footertext=By.xpath("//span[@data-qa='table-sizer-total']");
	By termvalue=By.xpath("//select[@id='term']/option");
	By assessment=By.xpath("//input[@id='title']");
	By hierarchy=By.xpath("//select[@class='form-control sch-editor-hierarchy']");
	By starttime=By.xpath("//input[@class='form-control time start ui-timepicker-input']");
	By endtime=By.xpath("//input[@class='form-control time end ui-timepicker-input']");
	By savebtn=By.xpath("//button[@id='save-btn']");
	By title=By.xpath("//input[@id='title']");
	By informinvigilators=By.xpath("//div[@id='si-alert-reg']/div[1]/div[3]/label");
	By optionstab=By.xpath("//div[contains(text(), 'options')]");
	By timeallowed=By.xpath("//select[@id='maxTimePerAttempt']");
	By passmark=By.xpath("//input[@id='passMarkValue']");
	By qinrandomorder=By.xpath("//div[@id='a-o-nav']/div/div[2]/label");
	By usepin=By.xpath("//div[@id='a-o-security']/div/div[2]/label");
	By candidatestab=By.xpath("//ul[@class='nav nav-tabs']/li[2]/a/div");
	By addcandidates=By.xpath("//a[@id='add-candidates']");
	By candidate1=By.xpath("//div[@class='listView']/div[2]/div[1]/div[1]");
	By candidate2=By.xpath("//div[@class='listView']/div[2]/div[2]/div[1]");
	By candidate3=By.xpath("//div[@class='listView']/div[2]/div[3]/div[1]");
	By candidate4=By.xpath("//div[@class='listView']/div[2]/div[4]/div[1]");
	By donemeter=By.xpath("//div[@class='done']");
	By generatepin=By.xpath("//a[@id='generate-pin']");
	By assessorstab=By.xpath("//div[contains(text(), 'Assessors')]");
	By formativeassessment=By.xpath("//div[@data-qa='assessments-create-formative']");
	By summativeassessment=By.xpath("//div[@data-qa='assessments-create-summative']");
	By assessmentdescription=By.xpath("//div[@data-qa='assessments-create-description']");
	By saveandclose=By.xpath("//button[@data-qa='assessments-create-save']");
	By code=By.xpath("//input[@id='a-code']");
	By qualification=By.xpath("//select[@id='item']");
	By addbtn=By.xpath("//button[@id='add-item']");
	By finishtitle=By.xpath("//div[@class='right-panel']/div[2]/div/h5");
	By pagetitle=By.xpath("//div[@class='global-page-title']");
	By ckeditorintro=By.xpath("//div[@id='a-i-intro']/div/div[2]/div/div/iframe");
	By ckeditorfinish=By.xpath("//div[@id='cke_a-finish']/div/div/iframe");
	By questiontab=By.xpath("//div[contains(text(), 'question selection')]");
	By generatetab=By.xpath("//div[contains(text(), 'generate assessment')]");
	By firstquestionfromlist=By.xpath("//div[@class='listView listView__questionSelection']/div[2]/div[1]/div[1]");
	By itemsfootertext=By.xpath("//span[contains(text(), 'Total 28 item(s) found | Show')]");
	By selectedquestions=By.xpath("//label[@for='selected-q']/span[2]");
	By generatebtn=By.xpath("//a[@id='a-generate-btn']");
	By fixedassessment=By.xpath("//span[contains(text(), 'Fixed assessment')]");
	By randomassessment=By.xpath("//span[contains(text(), 'Randomly generated assessment')]");
	By generatenumber=By.xpath("//input[@id='generate-number']");
	By status=By.xpath("//select[@class='form-control ae-wf-status-select']");
	By difficulty=By.xpath("//div[@class='row infoboxes on-content']/div[1]/div/div/div[2]");
	By publish=By.xpath("//div[@class='a-controls pull-right']/div[2]/button");
	By popupacollectionadded=By.xpath("//strong[@class='mr5']");
	By backbtn=By.xpath("//i[@class='icon icon-circle-left3']");
	By checkboxaddedassessment=By.xpath("//div[contains(text(), 'Teos automated test assessment')]/../div[1]");
	By qselectionassessment=By.xpath("//div[contains(text(), 'Teos automated test assessment')]/../div[5]");
	By checkboxaddedassessment2=By.xpath("//div[contains(text(), 'Teos automated Blueprint assessment')]/../div[1]");
	By qselectionassessment2=By.xpath("//div[contains(text(), 'Teos automated Blueprint assessment')]/../div[5]");
	By removeassessment=By.xpath("//button[@id='remove-assessment']");
	By confirmdelete=By.xpath("//button[@id='delete-btn']");
	By blueprint=By.xpath("//div[@id='a-i-type']/div/div[2]/label");
	By checked=By.xpath("//label[@class='checked']");
	By selLO=By.xpath("//a[@data-dialog='objectives']");
	By originalFolder=By.xpath("//div[@title='Original Folder'][1]");
	By originalSubject=By.xpath("//div[@title='Original Subject'][1]");
	By checkboxLO=By.xpath("//label[@class='checkbox-inline']");
	By ok=By.xpath("//div[@class='m-f-main-reg']/div/button");
	By selTax=By.xpath("//a[@data-dialog='taxonomies']");
	By understTax=By.xpath("//ul[@class='without-dots ui-sortable']/li[2]");
	By totalnr=By.xpath("//table[@class='matrix-table']/tbody/tr/td[2]/span[3]");
	By maxnr=By.xpath("//table[@class='matrix-table']/tbody/tr/td[2]/span[2]/input");
	By generateditems=By.xpath("//div[@id='generated-items']");
	By librarymenu=By.xpath("//i[@class='icon icon-notebook']");
	By itemstab=By.xpath("//a[@data-section='items']");
	By schedulebtn=By.xpath("//button[@data-qa='control-link']");
	By todolist=By.xpath("//div[@data-qa='schedule-list-todo']/div");
	By scheduleactivate=By.xpath("//button[@data-qa='schedule-activate']");
	
	public Schedule(WebDriver driver)
	{
	      this. driver=driver;
	}
	
	Date testDateStrings = new Date();
    DateFormat dfs = new SimpleDateFormat("HH:mm");
    String todaysDatesec = dfs.format(testDateStrings);
   
    long curTimeInMs = testDateStrings.getTime();
    Date testDateStrings1 = new Date(curTimeInMs + (30 * 60000));
    DateFormat dfs1 = new SimpleDateFormat("HH:mm");
    String todaysDatesec1 = dfs1.format(testDateStrings1);
	
	private void waitforelementtext(By element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text)); }
		    
	private void waitforelementandclick(By element) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	        .until(ExpectedConditions.elementToBeClickable(element));		    																	 
			    myDynamicElement.click(); }
				    
		    
	
	
	
	public void addSchedule() throws InterruptedException
	
	{
		waitforelementandclick(schedulemenu);
		waitforelementtext(footertext, "Total 5 item(s) found | Show");
		waitforelementandclick(addschedule);
		waitforelementandclick(psychometricsassessment);
		Thread.sleep(2000);
		waitforelementandclick(assessment);
		Thread.sleep(2000);
		driver.findElement(hierarchy).sendKeys("Automated Tests");
		driver.findElement(starttime).clear();
		driver.findElement(starttime).sendKeys(todaysDatesec);
		driver.findElement(endtime).clear();
		driver.findElement(endtime).sendKeys(todaysDatesec1);
		
		
	}
	
	public void setInformation() 
	
	{
		waitforelementandclick(informinvigilators);
		
	}
	
	public void setOptions() 
	
	{
		driver.findElement(optionstab).click();
		driver.findElement(timeallowed).sendKeys("60");
		driver.findElement(qinrandomorder).click();
		driver.findElement(usepin).click();
		driver.findElement(passmark).clear();
		driver.findElement(passmark).sendKeys("20");
	}
	
	public void setCandidates() 
	
	{
		driver.findElement(candidatestab).click();
		waitforelementandclick(addcandidates);
		waitforelementandclick(candidate1);
		waitforelementandclick(candidate2);
		waitforelementandclick(candidate3);
		waitforelementandclick(candidate4);
		driver.findElement(savebtn).click();


		
	}
	
	public void scheduleAssessment() 
	
	{
		waitforelementandclick(schedulebtn);
		waitforelementtext(todolist, "You are all set and can schedule the assessment");
		driver.findElement(scheduleactivate).click();

		
	}
	
	public void setAssessors() 
	
	{
		driver.findElement(assessorstab).click();
		waitforelementandclick(addcandidates);
		waitforelementandclick(candidate1);
		driver.findElement(savebtn).click();
		waitforelementtext(donemeter, "7 of 10 actions done (75%)");
		driver.findElement(generatepin).click();
		waitforelementtext(donemeter, "8 of 10 actions done (80%)");
		
	}
	
	
}