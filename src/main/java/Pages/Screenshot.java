/**
 * 
 */
package Pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Teodor
 * This class takes screenshot
 */
public class Screenshot {

	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
			
			System.out.println("Screenshot taken "+screenshotName);
		} 
		catch (Exception e)
		{
			System.out.println("Exception while taking the screenshot "+e.getMessage());
		} 
	}

}
