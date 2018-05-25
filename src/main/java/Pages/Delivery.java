/**
 * 
 */
package Pages;

import java.lang.reflect.Method;

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
 *	This class will store all the locators and methods for Delivery
 */
public class Delivery {

	WebDriver driver;

	By username=By.xpath("//input[@id='login']");
	By password=By.xpath("//input[@id='view_password']");
	By loginButton=By.xpath("//button[@class='btn btn-green-filled submitButton']");
	By errormessage=By.xpath("//span[@class='has-error']");
	By correctanswerfeedback=By.xpath("//div[@class='question-correct-answer']/label");
	By selectassessment=By.xpath("//select[@id='assessment']");
	By starttestbtn=By.xpath("//button[@id='startTest']");
	By testheader=By.xpath("//div[@id='content-region']/div/div/div[1]/span");
	By acceptNDA=By.xpath("//label[@data-qa='label-nda-accept']"); 
	By startassessmentbtn=By.xpath("//button[@data-qa='go-to-next-step-button']");
	By starttestAt=By.xpath("//div[@data-qa='dashboard-today-exams']/div[3]/div[1]/div[8]/button");
	By starttestErasmus=By.xpath("//div[@data-qa='dashboard-today-exams']/div[3]/div[2]/div[8]/button");
	By starttestBlueprint=By.xpath("//div[@data-qa='dashboard-today-exams']/div[3]/div[3]/div[8]/button");
	By starttestAtwTS=By.xpath("//div[@data-qa='dashboard-today-exams']/div[3]/div[4]/div[8]/button");
	By starttestwithNDA=By.xpath("//div[@data-qa='dashboard-today-exams']/div[3]/div[5]/div[8]/button");
	By starttestPsychometrics=By.xpath("//div[@data-qa='dashboard-today-exams']/div[3]/div[6]/div[8]/button");
	By pincode=By.xpath("//input[@data-qa='pin-value-input']");
	By showpin=By.xpath("//label[@data-qa='show-pin-checkbox']");
	By shortanswertext=By.xpath("//input[@id='answer-container']");
	By correctanswercheck=By.xpath("//i[@class='icon icon-correct-score']");
	By submitbtn=By.xpath("//button[@id='submit']");
	By nextbtn=By.xpath("//button[@id='next']");
	By firstcheckbox=By.xpath("//div[@id='answer-form']/div[1]/div/label");
	By secondcheckbox=By.xpath("//div[@id='answer-form']/div[2]/div/label");
	By essaytext=By.xpath("//div[@id='cke_164_contents']");
	By questionfeedback=By.xpath("//div[@class='question_feedback']");
	By selectfromlist=By.xpath("//div[@id='fill-the-blank-text']/div[1]/select");
	By selectfromlist2=By.xpath("//div[@id='fill-the-blank-text']/div[2]/select");
	By calculator=By.xpath("//button[@class='calculator-trigger']");
	By calculator7=By.xpath("//div[@class='calculator-body']/div[5]/button[1]");
	By calculatorX=By.xpath("//div[@class='calculator-body']/div[3]/button[4]");
	By calculator2=By.xpath("//div[@class='calculator-body']/div[3]/button[2]");
	By calculatorE=By.xpath("//div[@class='calculator-body']/div[6]/button[3]");
	By calculatorclose=By.xpath("//button[@class='close calculator-close undefined']");
	By calculatorresult=By.xpath("//div[@class='calculator-result']/span");
	By numericfield=By.xpath("//input[@id='user-value']");
	By hotspotimage=By.xpath("//div[@id='hotspot-image']/canvas");
	By clearhotspot=By.xpath("//button[@id='clear-hotspots']");
	By youtubevideo=By.xpath("//div[@class='embeddedContent oembed-provider- oembed-provider-youtube']");
	By option5=By.xpath("//li[contains(text(), '5')]");
	By option6=By.xpath("//li[contains(text(), '6')]");
	By option7=By.xpath("//li[contains(text(), '7')]");
	By option8=By.xpath("//li[contains(text(), '8')]");
	By place1=By.xpath("//ol[@class='sortable ui-sortable']/li[1]");
	By place2=By.xpath("//ol[@class='sortable ui-sortable']/li[2]");
	By place3=By.xpath("//ol[@class='sortable ui-sortable']/li[3]");
	By place4=By.xpath("//ol[@class='sortable ui-sortable']/li[4]");
	By uploadfilebtn=By.xpath("//input[@id='file-upload']");
	By uploadfilelink=By.xpath("//a[@class='alert-link']");
	By filltheblank=By.xpath("//div[@id='fill-the-blank-text']/input[1]");
	By filltheblank2=By.xpath("//div[@id='fill-the-blank-text']/input[2]");
	By choiceoption1=By.xpath("//div[contains(text(), '500')]");
	By matchoption1=By.xpath("//div[@id='56713a153c40a30f406abece']");
	By choiceoption2=By.xpath("//div[contains(text(), '600')]");
	By matchoption2=By.xpath("//div[@id='56713a153c40a30f406abed0']");
	By choiceoption3=By.xpath("//div[contains(text(), '700')]");
	By matchoption3=By.xpath("//div[@id='56713a153c40a30f406abed2']");
	By choiceoption4=By.xpath("//div[contains(text(), 'dog')]");
	By matchoption4=By.xpath("//div[contains(text(), 'pet')]/../div[3]");
	By choiceoption5=By.xpath("//div[contains(text(), 'family')]");
	By matchoption5=By.xpath("//div[contains(text(), 'home')]/../div[3]");
	By choiceoption6=By.xpath("//div[contains(text(), 'driver')]");
	By matchoption6=By.xpath("//div[contains(text(), 'car')]/../div[3]");
	By choiceoption7=By.xpath("//div[contains(text(), 'trees')]");
	By matchoption7=By.xpath("//div[contains(text(), 'park')]/../div[3]");
	By completetestbtn=By.xpath("//a[@id='complete']");
	By confirmbtn=By.xpath("//button[@id='save-btn']");
	By submitpin=By.xpath("//button[@data-qa='submit-pin-button']");
	By finishpagenextbtn=By.xpath("//button[@data-qa='go-to-next-step-button']");
	By scorewidget=By.xpath("//div[@data-qa='delivery-results-widgets']/div[1]/div/div[2]");
	By percentagegainedwidget=By.xpath("//div[@data-qa='delivery-results-widgets']/div[3]/div/div[2]");
	By totalscore1=By.xpath("//div[@class='listView_itemsContainer']/a[1]/div[3]/div");
	By totalscore2=By.xpath("//div[@class='listView_itemsContainer']/a[2]/div[3]/div");
	By totalscore3=By.xpath("//div[@class='listView_itemsContainer']/a[3]/div[3]/div");
	By totalscore4=By.xpath("//div[@class='listView_itemsContainer']/a[4]/div[3]/div");
	By totalscore5=By.xpath("//div[@class='listView_itemsContainer']/a[5]/div[3]/div");
	By totalscore6=By.xpath("//div[@class='listView_itemsContainer']/a[6]/div[3]/div");
	By totalscore7=By.xpath("//div[@class='listView_itemsContainer']/a[7]/div[3]/div");
	By totalscore8=By.xpath("//div[@class='listView_itemsContainer']/a[8]/div[3]/div");
	By totalscore9=By.xpath("//div[@class='listView_itemsContainer']/a[9]/div[3]/div");
	By totalscore10=By.xpath("//div[@class='listView_itemsContainer']/a[10]/div[3]/div");
	By totalscore12=By.xpath("//div[@class='listView_itemsContainer']/a[12]/div[3]/div");
	By totalscore13=By.xpath("//div[@class='listView_itemsContainer']/a[13]/div[3]/div");
	By totalscore14=By.xpath("//div[@class='listView_itemsContainer']/a[14]/div[3]/div");
	By totalscore15=By.xpath("//div[@class='listView_itemsContainer']/a[15]/div[3]/div");
	By detailedresults=By.xpath("//a[@data-section='detailed']");
	By ckeditor=By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']");
	By flag=By.xpath("//a[@id='flag']");
	By ckeditorlong=By.xpath("//div[@id='answer-form']/div/div[3]/div/div/iframe");
	By tstimer=By.xpath("//div[@id='sectionTimerRegion']/div");
	By tstitle=By.xpath("//div[@class='question-block-title']/p");
	By overview=By.xpath("//a[@id='overview']");
	By question3=By.xpath("//div[@class='dl-overview-flex_table']/div[3]");
	By questioncounter=By.xpath("//div[@class='question-count-div']/span/span[1]");
	
	
	public Delivery(WebDriver driver)
	{
		this. driver=driver;	
	}

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
	
	
	
	
	
	private void waitforelement(By element)
    {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element)); 
    }
	
	public void logincandidate(String userid, String pass)
	{
		waitforelementandclick(username);
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		
	}
	
	public Integer clearhotspotbtn()
	{
		Number correctanswer;
		correctanswer= driver.findElements(clearhotspot).size();
		return correctanswer.intValue();
	}
	
	public Integer countalertmessage()
	{
		Number countalertmessage;
		countalertmessage= driver.findElements(errormessage).size();
		return countalertmessage.intValue();
	}
	
	public Integer uploadedfile()
	{
		Number countalertmessage;
		countalertmessage= driver.findElements(uploadfilelink).size();
		return countalertmessage.intValue();
	}

	
	
	
	public void selectassessmentUniversal(String assessment) throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(selectassessment).sendKeys(assessment);
		driver.findElement(starttestbtn).click();
		waitforelementtext(testheader, assessment);
		waitforelementandclick(startassessmentbtn);
	}
	
	public void selectassessmentAutomatedtest() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforelementandclick(starttestAt);
		waitforelementtext(testheader, "Automated test");
		waitforelementandclick(startassessmentbtn);
	}
	
	public void selectassessmentErasmus() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforelementandclick(starttestErasmus);
		waitforelementtext(testheader, "Erasmus");
		waitforelementandclick(startassessmentbtn);
	}
	
	public void selectassessmentBlueprint() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforelementandclick(starttestBlueprint);
		waitforelementtext(testheader, "Blueprint");
		waitforelementandclick(startassessmentbtn);
	}
	
	public void selectassessmentAutomatedtestWithTS() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforelementandclick(starttestAtwTS);
		waitforelementtext(testheader, "Automated test w TS");
		waitforelementandclick(startassessmentbtn);
	}
	
	public void selectassessmentPsychometrics() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforelementandclick(starttestPsychometrics);
		waitforelementtext(testheader, "Psychometrics");
		waitforelementandclick(startassessmentbtn);
	}
	
	public void selectassessmentwithNDA() throws InterruptedException
	{
		Thread.sleep(3000);
		waitforelementandclick(starttestwithNDA);
		waitforelementtext(testheader, "Registration form and NDA");
		driver.findElement(acceptNDA).click();
		waitforelementandclick(startassessmentbtn);
		Thread.sleep(3000);
		waitforelementandclick(startassessmentbtn);
	}
	
	public void enterPin() throws InterruptedException 
	{
		waitforelementandclick(showpin);
		waitforelementandclick(pincode);
		Thread.sleep(1000);
		driver.findElement(pincode).sendKeys("9989");
		waitforelementandclick(submitpin);
		
	}
	
	public void ShortAnswer() throws InterruptedException
	{
		//1. answer for shortanswer type of question
		waitforelementandclick(shortanswertext);
		driver.findElement(shortanswertext).sendKeys("Geta");
		Thread.sleep(1000);
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
		
	}
	
	public void ShortAnswerPsycho(String answer) throws InterruptedException
	{
		//1. answer for shortanswer type of question
		driver.findElement(nextbtn).click();
		waitforelementandclick(shortanswertext);
		driver.findElement(shortanswertext).sendKeys(answer);
		Thread.sleep(1000);
		
		
	}
	
	public void ShortAnswerNDA() throws InterruptedException
	{
		//1. answer for shortanswer type of question
		waitforelementandclick(shortanswertext);
		driver.findElement(shortanswertext).sendKeys("Geta");
		Thread.sleep(1000);
		driver.findElement(nextbtn).click();
		
	}
	
	public void ShortAnswerTS() throws InterruptedException
	{
		//1. answer for short answer type of question for Timed Section assessment
		waitforelementandclick(shortanswertext);
		driver.findElement(shortanswertext).sendKeys("Geta");
		waitforelementandclick(tstimer);
		Assert.assertEquals(driver.findElement(tstitle).getText(), "TIMED SECTION");
		driver.findElement(nextbtn).click();
		
	}

	public void EitherOr() throws InterruptedException
	{
		
		//2. answer for either / or type of question
		driver.findElement(nextbtn).click();
		waitforelementandclick(firstcheckbox);
		Thread.sleep(1000);
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
//		add an assertion for incorrect answer
		
	}
	
	public void EitherOrPsycho(By selectedcheckbox) throws InterruptedException
	{
		
		//2. answer for either / or type of question
		waitforelementandclick(selectedcheckbox);
		Thread.sleep(1000);
		
	}
	
	public void EitherOrTS() throws InterruptedException
	{
		
		//2. answer for either / or type of question for Timed Section exam
		waitforelementandclick(firstcheckbox);
		driver.findElement(nextbtn).click();

		
	}
	
	public void EssayType() throws InterruptedException
	{
		//3. answer for essay type of question
		driver.findElement(nextbtn).click();
		Thread.sleep(2000);
		new Actions(driver).sendKeys("Summer vacation (also called summer holiday or summer break) is a school holiday in summer between school years and the longest break in the school year. Students and instructors are off school typically between 6 and 14 weeks, depending on the country and district. In America, Ireland, Italy, Greece, Lithuania and Russia, summer holidays are normally three months, compared to six to eight weeks in Australia, Britain, The Netherlands, Canada, and Germany.").perform();
		Thread.sleep(2000);
		driver.findElement(submitbtn).click();
		waitforelementtext(questionfeedback, "This question is marked manually");
		
	}
	
	public void EssayTypeWithCKEditor() throws InterruptedException
	{
		// answer for essay with CK editor type of question
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.").perform();
//		driver.findElement(ckeditor).sendKeys("The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.");
		driver.findElement(flag).click();
		Thread.sleep(3000);
//		Thread.sleep(5000);
	}
	
	public void EssayTypeTS() throws InterruptedException
	{
		// answer for essay with CK editor type of question
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.").perform();
//		driver.findElement(ckeditor).sendKeys("The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.");
		driver.findElement(flag).click();
		waitforelementandclick(tstimer);
		Assert.assertEquals(driver.findElement(tstitle).getText(), "TIMED SECTION");
		driver.findElement(nextbtn).click();
	}
	
	public void EssayTypeNDA() throws InterruptedException
	{
		// answer for essay with CK editor type of question
		waitforelementandclick(ckeditor);
		new Actions(driver).sendKeys("The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.").perform();
//		driver.findElement(ckeditor).sendKeys("The bananas you would buy in a Dutch shop are curved for two reasons: first, because of the way the banana plants blooms and, second, because of the way the market for bananas is regulated. (the main point of the answer) Not all banana-like fruits are curved, but the bananas at European groceries and supermarkets are. (qualification) There are other fruits that closely resemble bananas, but officially cannot be sold as bananas, such as the red banana. The European Commission has regulated the market for bananas, in the process of which a precise definition of a banana was required. Part of this definition is the minimum curvature of the fruit. This definition reflects what European consumers would consider a proper banana. For example, European customers eat their bananas when they are more ripe and more yellow than customers in tropical countries. Apart from this regulation, most bananas are curved in the first place because of the way the banana plant blooms. In the bunch, bananas sag because of gravity as they grow, but this is not equally strong among all banana-like fruits. (your arguments and examples) In sum, bananas are not just curved because of nature, but also because of market regulations. (your conclusion) It actually is a little bit strange and ridiculous that the European Commission should invest time in regulating the curvature of bananas. One would think that they have something better to do.");
		driver.findElement(flag).click();
		driver.findElement(nextbtn).click();
	}
	
	public void SelectFromList() throws InterruptedException
	{
		//4. answer select from list type of question
		driver.findElement(nextbtn).click();
		waitforelementandclick(selectfromlist);
		driver.findElement(selectfromlist).sendKeys("blank");
		Thread.sleep(1000);
		driver.findElement(submitbtn).click();
		
	}
	
	public void SelectFromListPsycho(String answer1, String answer2) throws InterruptedException
	{
		//4. answer select from list type of question
		driver.findElement(nextbtn).click();
		waitforelementandclick(selectfromlist);
		driver.findElement(selectfromlist).sendKeys(answer1);
		driver.findElement(selectfromlist2).sendKeys(answer2);
		Thread.sleep(1000);
		
	}
	
	public void SelectFromListTS() throws InterruptedException
	{
		//4. answer select from list type of question for Timed Section assessment
		waitforelementandclick(selectfromlist);
		driver.findElement(selectfromlist).sendKeys("blank");
		Thread.sleep(1000);
		driver.findElement(nextbtn).click();
		
	}
	
	public void MCwithMap() throws InterruptedException
	{
		//5. answer for MC type of question with Map
		waitforelementandclick(nextbtn);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 1000);");
		waitforelementandclick(firstcheckbox);
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
		
	}
	
	public void MCwithMapTS() throws InterruptedException
	{
		//5. answer for MC type of question with Map
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 1000);");
		waitforelementandclick(firstcheckbox);
		waitforelementandclick(nextbtn);
	}
	
	public void Numeric() throws InterruptedException
	{
		//6. answer Numeric type of question
		driver.findElement(nextbtn).click();
		driver.findElement(calculator).click();
		driver.findElement(calculator2).click();
		driver.findElement(calculatorX).click();
		driver.findElement(calculator7).click();
		driver.findElement(calculatorE).click();
		String kk = driver.findElement(calculatorresult).getText();
		waitforelementandclick(calculatorclose);
		driver.findElement(numericfield).sendKeys(kk);
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
	}
	
	public void NumericPsycho(String answer) throws InterruptedException
	{
		//6. answer Numeric type of question
		driver.findElement(nextbtn).click();
		driver.findElement(numericfield).sendKeys(answer);
		
	}
	
	public void NumericTS()
	{
		//6. answer Numeric type of question for assessment with Timed Section
		
		driver.findElement(calculator).click();
		driver.findElement(calculator2).click();
		driver.findElement(calculatorX).click();
		driver.findElement(calculator7).click();
		driver.findElement(calculatorE).click();
		String kk = driver.findElement(calculatorresult).getText();
		waitforelementandclick(calculatorclose);
		driver.findElement(numericfield).sendKeys(kk);
		driver.findElement(nextbtn).click();
	}
	
	public void NumericNDA()
	{
		//6. answer Numeric type of question for assessor preview as candidate
		driver.findElement(numericfield).sendKeys("14");
		driver.findElement(nextbtn).click();
	}
	
	public void NumericWithRange() throws InterruptedException
	{
		// answer Numeric with range type of question
		waitforelement(numericfield);
		driver.findElement(numericfield).sendKeys("90");
//		Thread.sleep(5000);
		waitforelementandclick(nextbtn);
	}
	
	public void Hotspot() throws InterruptedException
	{
		//7. answer Hotspot type of question
		driver.findElement(nextbtn).click();
		waitforelement(hotspotimage);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(hotspotimage);
		Actions build = new Actions(driver);
		build.moveToElement(ele, 110, 70).click().build().perform();
		driver.findElement(submitbtn).click();
	}
	
	public void HotspotTS() throws InterruptedException
	{
		//7. answer Hotspot type of question for assessment with Timed Section
		waitforelement(hotspotimage);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(hotspotimage);
		Actions build = new Actions(driver);
		build.moveToElement(ele, 110, 70).click().build().perform();
		driver.findElement(nextbtn).click();
	}
	
	public void Hotspotmultiple() throws InterruptedException
	{
		//7. answer Hotspot with multiple spots type of question
		waitforelement(hotspotimage);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(hotspotimage);
		Actions build = new Actions(driver);
		build.moveToElement(ele, 110, 70).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(hotspotimage);
		Actions build1 = new Actions(driver);
		build1.moveToElement(ele1, 130, 100).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(hotspotimage);
		Actions build2 = new Actions(driver);
		build2.moveToElement(ele2, 170, 100).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele3 = driver.findElement(hotspotimage);
		Actions build3 = new Actions(driver);
		build3.moveToElement(ele3, 200, 100).click().build().perform();
//		Thread.sleep(5000);
		waitforelementandclick(nextbtn);
		
	}
	
	public void HotspotmultiplePsycho() throws InterruptedException
	{
		//7. answer Hotspot with multiple spots type of question
		waitforelementandclick(nextbtn);
		Thread.sleep(3000);
		waitforelement(hotspotimage);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(hotspotimage);
		Actions build = new Actions(driver);
		build.moveToElement(ele, 200, 200).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(hotspotimage);
		Actions build1 = new Actions(driver);
		build1.moveToElement(ele1, 200, 500).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(hotspotimage);
		Actions build2 = new Actions(driver);
		build2.moveToElement(ele2, 900, 200).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele3 = driver.findElement(hotspotimage);
		Actions build3 = new Actions(driver);
		build3.moveToElement(ele3, 900, 500).click().build().perform();
//		Thread.sleep(5000);
		
		
	}
	
	public void HotspotmultiplePsychoIncorrect() throws InterruptedException
	{
		//7. answer Hotspot with multiple spots type of question
		waitforelementandclick(nextbtn);
		Thread.sleep(3000);
		waitforelement(hotspotimage);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(hotspotimage);
		Actions build = new Actions(driver);
		build.moveToElement(ele, 250, 250).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(hotspotimage);
		Actions build1 = new Actions(driver);
		build1.moveToElement(ele1, 250, 450).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(hotspotimage);
		Actions build2 = new Actions(driver);
		build2.moveToElement(ele2, 700, 250).click().build().perform();
//		Thread.sleep(5000);
		WebElement ele3 = driver.findElement(hotspotimage);
		Actions build3 = new Actions(driver);
		build3.moveToElement(ele3, 700, 450).click().build().perform();
//		Thread.sleep(5000);
		
		
	}
	
	public void ExtendedMatch() throws InterruptedException
	{
		//8. answer ExtendedMatch type of question
//		CHANGES ARE GOING TO BE MADE TO THIS TYPE OF QUESTION
		driver.findElement(nextbtn).click();
		driver.findElement(submitbtn).click();
	}
	
	public void ExtendedMatchTS() throws InterruptedException
	{
		//8. answer ExtendedMatch type of question for assessment with Timed Section
//		CHANGES ARE GOING TO BE MADE TO THIS TYPE OF QUESTION
		waitforelementandclick(nextbtn);
	}
	
	public void MCwithYouTube() throws InterruptedException
	{
		//9. answer for MC type of question with embedded YouTube video
		waitforelementandclick(nextbtn);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(youtubevideo);
		Actions build = new Actions(driver);
		build.moveToElement(ele, 150, 150).click().build().perform();
		Thread.sleep(5000);
		waitforelementandclick(firstcheckbox);
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
		
	}
	
	public void MCwithYouTubeTS() throws InterruptedException
	{
		//9. answer for MC type of question with embedded YouTube video for assessment with Timed Section
		waitforelementandclick(firstcheckbox);
		waitforelementandclick(nextbtn);
		
	}
	
	public void Order() throws InterruptedException
	{
		//10. answer Order type of question
		driver.findElement(nextbtn).click();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option7), driver.findElement(place3)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option6), driver.findElement(place2)).perform();		
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
	}
	
	public void OrderPsycho() throws InterruptedException
	{
		//10. answer Order type of question
		driver.findElement(nextbtn).click();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option8), driver.findElement(place4)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option7), driver.findElement(place3)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option6), driver.findElement(place2)).perform();		
		
	}
	
	public void OrderPsychoincorrect() throws InterruptedException
	{
		//10. answer Order type of question
		driver.findElement(nextbtn).click();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option6), driver.findElement(place4)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option8), driver.findElement(place3)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option7), driver.findElement(place2)).perform();		
		
	}
	
	public void OrderTS() throws InterruptedException
	{
		//10. answer Order type of question
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option7), driver.findElement(place3)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(option6), driver.findElement(place2)).perform();		
		driver.findElement(nextbtn).click();
	}
	
	public void UploadFile() throws InterruptedException
	{
		//11. answer UploadFile type of question
		driver.findElement(nextbtn).click();
		Thread.sleep(2000);
		driver.findElement(uploadfilebtn).sendKeys("C:\\Users\\Teodor\\Desktop\\download.jpg");
		Thread.sleep(2000);
		driver.findElement(submitbtn).click();
	}
	
	public void UploadFileTS() throws InterruptedException
	{
		//11. answer UploadFile type of question for assessment with Timed Section
		Thread.sleep(2000);
		driver.findElement(uploadfilebtn).sendKeys("C:\\Users\\Teodor\\Desktop\\download.jpg");
		Thread.sleep(2000);
		driver.findElement(nextbtn).click();
	}
	
	public void FillTheBlank() throws InterruptedException
	{
		//12. answer FillTheBlank type of question
		driver.findElement(nextbtn).click();
		driver.findElement(filltheblank).sendKeys("blank");
		Thread.sleep(2000);
		driver.findElement(submitbtn).click();
	}
	
	public void FillTheBlankPsycho(String answer1, String answer2) throws InterruptedException
	{
		//12. answer FillTheBlank type of question
		driver.findElement(nextbtn).click();
		driver.findElement(filltheblank).sendKeys(answer1);
		driver.findElement(filltheblank2).sendKeys(answer2);
		
	}
	
	public void FillTheBlankTS() throws InterruptedException
	{
		//12. answer FillTheBlank type of question for assessment with Timed Section
		driver.findElement(filltheblank).sendKeys("blank");
		Thread.sleep(2000);
		driver.findElement(nextbtn).click();
	}
	
	public void MultipleChoice() throws InterruptedException
	{
		//13. answer for MC type of question with embedded YouTube video
		waitforelementandclick(nextbtn);
		waitforelementandclick(firstcheckbox);
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
	}
	
	public void MultipleChoiceTS() throws InterruptedException
	{
		//13. answer for MC type of question with embedded YouTube video for assessment with Timed Section
		waitforelementandclick(firstcheckbox);
		waitforelementandclick(nextbtn);
	}
	
	public void MultipleChoicePsycho(By selectedcheckbox) throws InterruptedException
	{
		
		waitforelementandclick(nextbtn);
		waitforelementandclick(selectedcheckbox);
		
	}
	
	public void MultipleResponse() throws InterruptedException
	{
		//14. answer for Multiple Response type of question with embedded YouTube video
		waitforelementandclick(nextbtn);
		waitforelementandclick(firstcheckbox);
		waitforelementandclick(secondcheckbox);
		driver.findElement(submitbtn).click();
		waitforelementandclick(correctanswercheck);
	}
	
	public void MultipleResponseTS() throws InterruptedException
	{
		//14. answer for Multiple Response type of question with embedded YouTube video for assessment with Timed Section
		waitforelementandclick(firstcheckbox);
		waitforelementandclick(secondcheckbox);
		waitforelementandclick(nextbtn);
	}
	
	public void MultipleResponsePsycho(By firstselected, By secondselected) throws InterruptedException
	{
		
		waitforelementandclick(nextbtn);
		waitforelementandclick(firstselected);
		waitforelementandclick(secondselected);
		
	}
	
	public void Match() throws InterruptedException
	{
		//15. answer for Match type of question
		waitforelementandclick(nextbtn);
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choiceoption1), driver.findElement(matchoption1)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choiceoption2), driver.findElement(matchoption2)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choiceoption3), driver.findElement(matchoption3)).perform();
		
		driver.findElement(submitbtn).click();
	}
	
	public void MatchPsycho(By choice4, By match4, By choice5, By match5, By choice6, By match6, By choice7, By match7) throws InterruptedException
	{
		//15. answer for Match type of question
		waitforelementandclick(nextbtn);
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choice4), driver.findElement(match4)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choice5), driver.findElement(match5)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choice6), driver.findElement(match6)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choice7), driver.findElement(match7)).perform();
		
	}
	
	public void MatchTS() throws InterruptedException
	{
		//15. answer for Match type of question for assessment with Timed Section
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choiceoption1), driver.findElement(matchoption1)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choiceoption2), driver.findElement(matchoption2)).perform();
		Thread.sleep(1000);
		(new Actions(driver)).dragAndDrop(driver.findElement(choiceoption3), driver.findElement(matchoption3)).perform();
	}
	
	
	
	public void EssayTypeLong() throws InterruptedException
	{
		//3. answer for essay type of question that takes more than 5 minutes
		driver.findElement(nextbtn).click();
		Thread.sleep(2000);
		waitforelementandclick(ckeditorlong);
		new Actions(driver).sendKeys("Summer vacation (also called summer holiday or summer break) is a school holiday in summer between school ").perform();
//		driver.findElement(ckeditorlong).sendKeys("Summer vacation (also called summer holiday or summer break) is a school holiday in summer between school ");
//		Thread.sleep(10000);
		Thread.sleep(310000);
		waitforelementandclick(ckeditorlong);
		new Actions(driver).sendKeys("years and the longest break in the school year. Students and instructors are off school typically between 6 and 14 ").perform();
//		driver.findElement(ckeditorlong).sendKeys("years and the longest break in the school year. Students and instructors are off school typically between 6 and 14 ");
//		Thread.sleep(3000);
		Thread.sleep(180000);
		waitforelementandclick(ckeditorlong);
		new Actions(driver).sendKeys("weeks, depending on the country and district. In America, Ireland, Italy, Greece, Lithuania and Russia, summer holidays are normally three months, compared to six to eight weeks in Australia, Britain, The Netherlands, Canada, and Germany.").perform();
//		driver.findElement(ckeditorlong).sendKeys("weeks, depending on the country and district. In America, Ireland, Italy, Greece, Lithuania and Russia, summer holidays are normally three months, compared to six to eight weeks in Australia, Britain, The Netherlands, Canada, and Germany.");
		Thread.sleep(2000);
		driver.findElement(submitbtn).click();
		Thread.sleep(5000);
		waitforelementtext(questionfeedback, "This question is marked manually");
	}
	
	
	
	public void CompleteAssessment() throws InterruptedException
	{
		waitforelementandclick(completetestbtn);
		waitforelementandclick(confirmbtn);
		waitforelementandclick(confirmbtn);
		Thread.sleep(5000);
		
	}

	public void MC1() throws InterruptedException
	{
		//5. answer for MC type of question with Map
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 1000);");
		waitforelementandclick(firstcheckbox);
		waitforelementandclick(nextbtn);
		
	}
	
	public void MC2() throws InterruptedException
	{
		//5. answer for MC type of question with Map
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver; //scrolls down
		jse.executeScript("scroll(0, 1000);");
		waitforelementandclick(firstcheckbox);
		
	}
	
	public void VerifyExamSummary()
	{
		waitforelementandclick(finishpagenextbtn);
		waitforelementtext(scorewidget, "120");
//		Assert.assertEquals(driver.findElement(scorewidget).getText(), "120");
		waitforelementtext(totalscore1, "10");
//		Assert.assertEquals(driver.findElement(totalscore1).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore2).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore4).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore5).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore6).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore7).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore8).getText(), "0");
		Assert.assertEquals(driver.findElement(totalscore9).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore10).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore12).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore13).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore14).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore15).getText(), "10");	
	}
	
	public void VerifyTSExamSummary() throws InterruptedException
	{
		waitforelementandclick(finishpagenextbtn);
		waitforelementtext(scorewidget, "120");
		Assert.assertEquals(driver.findElement(percentagegainedwidget).getText(), "80%");
		waitforelementtext(totalscore1, "10");
		Assert.assertEquals(driver.findElement(totalscore2).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore3).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore5).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore6).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore7).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore8).getText(), "0");
		Assert.assertEquals(driver.findElement(totalscore9).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore10).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore12).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore13).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore14).getText(), "10");
		Assert.assertEquals(driver.findElement(totalscore15).getText(), "10");	
	}
	
	public void VerifyExamSummary2() throws InterruptedException
	{
		waitforelementandclick(finishpagenextbtn);
		waitforelementtext(scorewidget, "20");
		waitforelementtext(totalscore1, "10");
		Assert.assertEquals(driver.findElement(totalscore2).getText(), "10");
		
	}
	
	public void VerifyTimedSection() throws InterruptedException
	{
		waitforelementandclick(overview);
		Thread.sleep(34000);
		waitforelementandclick(question3);
		waitforelementandclick(tstimer);
		Assert.assertEquals(driver.findElement(tstimer).getText(), "The time of the section has expired", "Time of the section didn't expire");
		Assert.assertEquals(driver.findElement(tstitle).getText(), "TIMED SECTION", "Incorrect section title");
		Assert.assertEquals(driver.findElement(questioncounter).getText(), "3", "Incorrect question number");
		driver.findElement(nextbtn).click();
		Assert.assertEquals(driver.findElement(questioncounter).getText(), "4", "Incorrect question number");
		
		
	}
	
	public void completeassessment(Method m) throws InterruptedException {
        if (!m.getName().matches("C7001LoginCandidate|C7002SelectAssessmentandStart|C7019VerifyExamSummary|C6001LoginCandidate|C6002SelectAssessmentandStart|C6018VerifyExamSummary|C5001LoginCandidate|C5002SelectAssessmentandStart|C5003EnterPin|C5007VerifyExamSummary|C4001LoginCandidate|C4002SelectAssessmentandStart|C4003EnterPin|C4007VerifyExamSummaryC3001LoginCandidate|C3002SelectAssessmentandStart|C3003EnterPin|C3007VerifyExamSummary|C2001LoginCandidate|C2002SelectAssessmentandStart|C2013Complete|C001LoginCandidate|C002SelectAssessmentandStart|C018VerifyExamSummary"))
        {
			CompleteAssessment();
        }
    }
}
