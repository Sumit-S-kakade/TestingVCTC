package seleniumPack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act  = new Actions(driver);
//		act.sendKeys("S").perform();
//		Thread.sleep(3000);
//		
//		act.sendKeys(Keys.ENTER).perform();
//		
//		Thread.sleep(3000);
		
//		act.sendKeys(Keys.ESCAPE).perform();
//		
//		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
//		
//		String value = result.getText();
//		System.out.println(value);
		
		
		
		
		
		
		
		
	}

}
