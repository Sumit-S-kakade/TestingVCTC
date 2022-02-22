//Inspecting WebElements with Xpath Types

package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium5 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		

//		Xpath by attribute
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//input[contains(@id,'user-')]"));
	    userName.sendKeys("standard_user");
//	    Thread.sleep(3000);
	    WebElement password = driver.findElement(By.xpath("//input[contains(@id,'pass)]'"));
	    password.sendKeys("secret_sause");
//	    Thread.sleep(3000);
	    WebElement loginButton = driver.findElement(By.xpath("//input[contains(@id,'login-')]"));
	    loginButton.click();
		
		
	}
	
	
	

}
