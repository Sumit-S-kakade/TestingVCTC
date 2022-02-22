package seleniumPack1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.w3schools.com/jsref/obj_console.asp");
	    

	  //to get the address of page
		String addressMainPage = driver.getWindowHandle();  //to get the address of page
		System.out.println("Address of main Page"+addressMainPage);
		
	    WebElement tryItUserIfButton = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
	    tryItUserIfButton.click();
	    
	    WebElement tryItUserIfButton2 = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	    tryItUserIfButton2.click();

//	    Address of two pages
//	   Set<String> allPagesAddress = new HashSet<String>(driver.getWindowHandles());
	    ArrayList<String>allPagesAddress = new ArrayList<String>(driver.getWindowHandles());
	    System.out.println("AllPagesAddress"+allPagesAddress);
	    
	    
	    System.out.println(allPagesAddress.get(0));  // main index
	    System.out.println(allPagesAddress.get(1));  // child index
	    System.out.println(allPagesAddress.get(2)); 
	    
	    driver.switchTo().window(allPagesAddress.get(1));   // switch to use child page
	    
	    WebElement newWebsiteButton = driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
	    newWebsiteButton.click();
	  
	}

}

//driver.switchTo().window("address of new webpage");
