//AlertpopUp

package seleniumPack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertpopUp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    WebElement clickMe = driver.findElement(By.xpath("//button[@id='alertBox']"));
	    clickMe.click();
	    driver.switchTo().alert().accept();
	    WebElement clickMe2 = driver.findElement(By.xpath("//button[@id='confirmBox']"));
	    clickMe2.click();
	    driver.switchTo().alert().accept();
	}

}
