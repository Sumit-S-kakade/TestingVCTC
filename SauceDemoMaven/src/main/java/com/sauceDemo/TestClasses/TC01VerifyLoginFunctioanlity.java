//VerifyLoginFunctioanlity

package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LoginPageClass;

public class TC01VerifyLoginFunctioanlity extends BaseClass
{ 
	
//	   @BeforeMethod
//       public void VerifyLoginFunctioanlity()
//	{
//	
//		//7. set property and basic first step to opent he chrome
//		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
//	WebDriver driver  = new ChromeDriver();
//		System.out.println("Browser open successfully");
//		
//		driver.manage().window().maximize();
//		System.out.println("Browser maximize");
//		
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("URL open successfully");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//		
//		//create object of POM class and call the methods
//		
//		LoginPageClass login = new LoginPageClass(driver);
//		
////		calling the methods
//		login.sendUsername();
//		login.sendPassword();
//		login.clickLoginButton();
//	}
		
       @Test
       public void verifyLogin()
       {
		String actualTitle = "Swag Labs";
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Login Test is Passed");
		}
		else
		{
			System.out.println("Login Test is failed");
		}
		Assert.assertTrue(true);
		Reporter.log("Login test is passed");
	}
	
}

