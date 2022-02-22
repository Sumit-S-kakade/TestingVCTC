package seleniumPack1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2
{



	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
//		Maximize
//		driver.manage().window().maximize();
		
//		Get Method
		driver.get("https://www.google.com");
//		Thread.sleep(3000);
		
//		Navigate Method
		
//		driver.navigate().to("https://www.google.com");
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		driver.navigate().refresh();
//	Thread.sleep(5000);		
		
		
//		URL
//		driver.getCurrentUrl();
//		String currentURL = driver.getCurrentUrl();		
//		System.out.println(currentURL);
         
//		Title
//		driver.getTitle();
//		String title = driver.getTitle();
//		System.out.println(title);
//		
		
		
//		Close - Quit
		
//		driver.close();
//		driver.quit();
//		
		
		
////		To set the size of the browser
//		Dimension d = new Dimension(100,100);
//		
//		
		
//		Automation Script for Opening Browser

		// 1.how to open browser on chrome
		
//		
//		String browser = "chrome";
//		WebDriver driver1;
//		 if (browser =="chrome")
//		 System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 }
//	 
		
		
//		Automation Script for Getting the URL
//		How to get the URL from browser
		
//		 System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.navigate().to("https://www.facebook.com");
//		 String expectedURL = "https://www.facebook.com/"; 
//		 Thread.sleep(5000);
//		 String actualURL = driver.getCurrentUrl();
//		 System.out.println(actualURL);
//		 if (expectedURL == actualURL )
//		 {
//			System.out.println("Test is passed");
//		 }
//		 else 
//		 {
//			System.out.println("Failed"); 
//		 }
		
		
		
		
		
}
}
