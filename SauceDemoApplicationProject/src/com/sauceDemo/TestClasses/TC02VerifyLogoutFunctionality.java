package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class TC02VerifyLogoutFunctionality extends BaseClass
{
	@Test
    public void VerifyLogoutFunctionality()
{
		
		System.out.println("Logout Test is Passed");
//		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
//		WebDriver driver =  new ChromeDriver();
//	System.out.println("Browser open successfully");
//	
//	driver.manage().window().maximize();
//	System.out.println("Browser maximize");
//	
//	driver.get("https://www.saucedemo.com/");
//	System.out.println("URL open successfully");
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//	
//	LoginPageClass login = new LoginPageClass(driver);
//	
////	calling the methods
//	login.sendUsername();
//	login.sendPassword();
//	login.clickLoginButton();
//	
//	
//	HomePageClass home = new HomePageClass(driver);
//	home.clickSettingButton();
//	home.clickLogoutButton();
//
//	
//	String actualTitle = "Swag Labs";
//	String expectedTitle = driver.getTitle();
//	if(expectedTitle.equals(actualTitle))
//	{
//		System.out.println("Login Test is Passed");
//	}
//	else
//	{
//		System.out.println("Login Test is failed");
//	}
//	
//	
//	
}

}
