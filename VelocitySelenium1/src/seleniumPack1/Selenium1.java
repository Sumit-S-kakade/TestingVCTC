package seleniumPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Selenium1
{
	public static void main(String[] args) 
	{

//		ChromeDriver
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.google.com");
		
//		Firefox Browser
//		
//		System.setProperty("webdriver.gecko.driver","C:\\Testing VCTC\\Selenium\\geckodriver-v0.30.0-win32\\geckodriver.exe");
//		
//		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
		
		
//		Opera Driver
		
//		System.setProperty("webdriver.opera.driver","C:\\Testing VCTC\\Selenium\\operadriver_win32\\operadriver_win32\\operadriver.exe");
//		WebDriver driver = new OperaDriver();
//		driver.get("https://www.google.com");
//		
		
		
		
	}

}
