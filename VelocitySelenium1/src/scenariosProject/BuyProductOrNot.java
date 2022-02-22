package scenariosProject;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BuyProductOrNot 
{
	 static void ScreenShotMethod (String path,WebDriver driver) throws IOException 
		
		{
	       TakesScreenshot ts  = (TakesScreenshot)driver;
	       File source = ts.getScreenshotAs(OutputType.FILE);
	       System.out.println("Source File Generated");
//	       Open the current date and time
	       String timestamp = new SimpleDateFormat("DD_MM_YYYY_mm_ss").format(new Date(0));
	       File dest  = new File(path + timestamp +".png");
	       FileHandler.copy(source, dest);
	       System.out.println("ScreenShot is taken");
}

	public static void main(String[] args) throws InterruptedException, IOException 
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
	    
//		 screen shot for loging button
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\homepage.jpg", driver);
	    
//		WebElement For LoginButton
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		System.out.println("LoginButton Web Element Find successfully");
		
//		LoginButton click
		loginButton.click();
		 System.out.println(" LoginButton click  Successfully");
		 
//		 screen shot for login
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\login.jpg", driver);
		 
		 WebElement Prod1sauceLabsBackpack = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]  "));
		 Prod1sauceLabsBackpack.click();
		 System.out.println(" Select Product 1 (sauceLabsBackpack) successfully"); 
		 Thread.sleep(2000);
		 
//		 screen shot for product Select
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\productSelect.jpg", driver);
		 
//      Add To Cart
		 WebElement addToCart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		 addToCart.click();
		 System.out.println(" Product add  to cart  successfully"); 
		 Thread.sleep(2000);
		 
//		 screen shot for aadd to cart
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\add cart.jpg", driver);
		 
//      Cart Open
		 WebElement cartOpen= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		 cartOpen.click();
		 System.out.println("   Cart Open successfully"); 
		 Thread.sleep(2000);
		 
//		 screen shot for cart open
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\cartopen.jpg", driver);
		 
//		 Checkout Open
		 WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		 checkout.click();
		 System.out.println("   Checkout Open successfully");
		 Thread.sleep(2000);
		 
//		 screen shot for checkout  open
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\checkout.jpg", driver);
		 
//   	 First Name Enter
		 WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		 firstName.sendKeys("Sumit");
		 System.out.println("First Name Enter successfully");
		 Thread.sleep(2000);
		 
//		 Last Name Enter
		 WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
		 lastName.sendKeys("Kakade");
		 System.out.println("Last Name Enter successfully");
		 Thread.sleep(2000);
		 
//		 Postal Code Enter
		 WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		 postalCode.sendKeys("414103");
		 System.out.println("Zip Code Enter successfully");
		 Thread.sleep(2000);
		 
//		 screen shot for information
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\information.jpg", driver);
		 
//		 Enter to continue button
		 WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		 continueButton.click();
		 System.out.println("CHECKOUT: OVERVIEW successfully");
		 
//		 Mouse Scrolling down
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		    js.executeScript("window.scrollBy(0,1000)");    //positive value
//		    System.out.println("scrolling down");
		 Thread.sleep(5000);
		 
//		 Enter to FinishButton
		 WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
		 finishButton.click();
		 System.out.println("FinishButton successfully"); 
		 System.out.println("THANK YOU FOR YOUR ORDER");
		 System.out.println("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		
		 ScreenShotMethod("E:\\Testing VCTC\\Automation\\ScreenShot\\Order.jpg", driver);
		
		 
		 
	}

}
