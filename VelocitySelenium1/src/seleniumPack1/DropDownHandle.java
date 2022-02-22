package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle 
{
	
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser open susseccfully");
	driver.get("https://vctcpune.com/selenium/practice.html");
	System.out.println("URL open susseccfully");
	Thread.sleep(3000);
	
	WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	dropDown.click();
	Select s = new Select(dropDown);
//	s.selectByIndex(1);

//	s.selectByValue("option2");
	
	s.selectByVisibleText("Option2");
	
}
	
	

}
