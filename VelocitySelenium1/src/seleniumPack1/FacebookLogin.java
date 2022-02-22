//Facebook  Login Sumit S Kakade

package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome open successfully ");
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook open successfully");
		Thread.sleep(3000);
		
		WebElement username  = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("sumitkakade084@gmail.com");
		System.out.println("UserName entered successfully");
		Thread.sleep(3000);
		WebElement password  = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("sumitdada"); 
		System.out.println("Password entered successfully");
		Thread.sleep(3000);
		WebElement loginButton  = driver.findElement(By.xpath("	//button[@name='login']"));
		 loginButton.click();
		 System.out.println("Login successfully");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement profile = driver.findElement(By.xpath("//div[@style='height:40px;width:40px']"));
		Thread.sleep(3000);
		profile.click();
		System.out.println("Profile is open");
		Thread.sleep(3000);
		driver.close();
		System.out.println("URL closed");
		
		
		//input[@id='email']
		//div[@id='passContainer']
		//button[@data-testid='royal_login_button']
				//div[@style='height:40px;width:40px']
		
	}

		
	
	
	

}
