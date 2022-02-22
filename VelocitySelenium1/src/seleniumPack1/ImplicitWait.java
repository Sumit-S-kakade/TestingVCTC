package seleniumPack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	//Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
	
//	Username
	WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	username.sendKeys("standard_user");
	System.out.println("Username enter successfully entered");
	
//	Password
	WebElement password  = driver.findElement(By.xpath("//input[@id=\"password\"]"));
	password.sendKeys("secret_sauce");
	System.out.println("Password enter successfully entered");
	
//	Login Button
	WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
	loginButton.click();	
	System.out.println("login successfully ");
				
}
}
