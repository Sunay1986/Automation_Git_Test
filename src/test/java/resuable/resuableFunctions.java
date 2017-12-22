package resuable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;

public class resuableFunctions{
	
	static Scenario s1;
	static WebDriver driver;
	static int i;
	
	public resuableFunctions(WebDriver d, Scenario s) {
		// TODO Auto-generated constructor stub
		resuableFunctions.driver=d;
		resuableFunctions.s1=s;
		i=0;
	}
		
	public void takescreenshot() {
		try {
			byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			TakesScreenshot ss=(TakesScreenshot) driver;
			File Src=ss.getScreenshotAs(OutputType.FILE);
			File Dest= new File(System.getProperty("user.dir")+"\\images\\"+s1.getName()+"_"+Integer.toString(i)+"\\"+"Image_"+Integer.toString(i)+".png");
			try {
				FileUtils.copyFile(Src,Dest);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			s1.embed(screenshot,"image/png");
	    } catch (WebDriverException somePlatformsDontSupportScreenshots) {
	        System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	    }
		i++;
	}
	

}
