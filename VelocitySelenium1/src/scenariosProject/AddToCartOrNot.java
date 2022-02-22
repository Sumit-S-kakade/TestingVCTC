//. Verify whether we are able to add to product to cart or not
package scenariosProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartOrNot 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser open successfully");
		
		driver.manage().window().maximize();
		System.out.println("Browser maximize");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open successfully");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		System.out.println(" apply implicitlyWait successfully");
		
//		WebElement For Username
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		System.out.println(" Username Web Element Find successfully");

//       Username Enter
		username.sendKeys("standard_user");
	    System.out.println(" Username Enter Successfully");
	    Thread.sleep(2000);
	    
//		WebElement For Password
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		System.out.println("Password Web Element Find successfully");

//       Password Enter
		password.sendKeys("secret_sauce");
	    System.out.println("  Password Enter Successfully");
	    Thread.sleep(2000);
	    
//		WebElement For LoginButton
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		System.out.println("LoginButton Web Element Find successfully");
		
//		LoginButton click
		loginButton.click();
		 System.out.println(" LoginButton click  Successfully");
		 
		 WebElement Prod1sauceLabsBackpack = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]  "));
		 Prod1sauceLabsBackpack.click();
		 System.out.println(" Select Product 1 (sauceLabsBackpack) successfully"); 

		 
//      Add To Cart
		 WebElement addToCart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		 addToCart.click();
		 System.out.println(" Product add  to cart  successfully"); 

		 
		 
		 
    }

}
