//Mouse Action
package seleniumPack1;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
//		loginButton.click();
		
//		WebElement intreface
//		Mouse Action
		Actions act = new Actions(driver);
//		act.click(loginButton).perform();
		
//	    act.contextClick().perform();  //right click use
		
		//action create and not executing
		
//		act.click(loginButton).perform();
//		act.doubleClick(loginButton);
	    act.contextClick().perform();
	}

}
