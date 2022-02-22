//ScreenShot time stamp
package seleniumPack1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotTimeStamp 
{



	  static void ScreenShootMethod (String path,WebDriver driver) throws IOException 
	
	{
       TakesScreenshot ts  = (TakesScreenshot)driver;
       File source = ts.getScreenshotAs(OutputType.FILE);
       System.out.println("Source File Generated");
       
//       Open the current date and time
//       String timestamp = new SimpleDateFormat("DD_MM_YYYY_mm_ss").format(new Date());
       String timestamp = new SimpleDateFormat("DD_MM_YYYY_mm_ss").format(new Date());
       File dest  = new File(path + timestamp +".png");
       FileHandler.copy(source, dest);
       System.out.println("ScreenShot is taken");
       }
	
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com/");
	   System.out.println("URL open successfully");
	  ScreenShootMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\loginpage.jpg", driver);
		
	}
}
