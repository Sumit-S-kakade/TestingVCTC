package seleniumPack1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScrollingAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://practice.automationtesting.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    
//	    Casting
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");    //positive value
	    System.out.println("scrolling down");
	    
	    Thread.sleep(30000);

	    js.executeScript("window.scrollBy(0,1000)");
	    System.out.println("scrolling up");		
	}

}