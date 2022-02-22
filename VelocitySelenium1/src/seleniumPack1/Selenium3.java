//Automation TestScript to login to OrangeHRM Website

package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		UserName WebElement
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		
		
//		Password WebElement
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		
//		login button WebElement
		WebElement loginButton = driver.findElement(By.className("button"));
		loginButton.click();
		
		
		
	}
	
	
	
}
