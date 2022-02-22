//Test Script with proper scenarios and logs

package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium6 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser open successfully");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL opened Successfully");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		System.out.println("userName entered successfully");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		System.out.println("Password entered successfully");
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		System.out.println("click on login button successfully");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("We are successfully entered on Homepage");
			System.out.println("Test Script is Passed");
		}
		else
		{
			System.out.println("Test Script is faild");
			
		}
		Thread.sleep(3000);
		driver.close();
		System.out.println("browser is closed now");
		
		
	}
	
	
	

}
