package seleniumPack1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
  public static void main(String[] args) 

  {   
	System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.saucedemo.com/");
    
    WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
    userName.sendKeys("standard_user");
    
   WebElement password =  driver.findElement(By.xpath("//input[@id='password']"));
   password.sendKeys("secret_sauce");
   
   WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
   loginButton.click();
 
//   driver.findElements(By.xpath("(//div[@class = 'inventory_item_name'])[1]"));
//   
   List<WebElement>items = new ArrayList<WebElement>(driver.findElements(By.xpath("(//div[@class = 'inventory_item_name'])[1]")));
  System.out.println(items);
   WebElement item1 = items.get(0);
   item1.click();
//   (//div[@class = 'inventory_item_name'])[1]
  }
  
	

}
