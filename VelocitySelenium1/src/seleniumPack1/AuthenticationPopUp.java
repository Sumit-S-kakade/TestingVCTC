//Authentication PopUp
package seleniumPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Auth pop Up
		String username = "admin";
		String password = "admin";
		String url = "the-internet.herokuapp.com/basic_auth";
		
		String mainURL = "https://"+username + ":"+password + "@" +url;
		System.out.println(mainURL);
		driver.get(mainURL);
		
		
	}

}
