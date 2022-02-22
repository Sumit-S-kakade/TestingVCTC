package com.sauceDemo.TestClasses;





import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.sauceDemo.POMClasses.HomePageClass;
import com.sauceDemo.POMClasses.LoginPageClass;

public class BaseClass 
{
	 
	
	WebDriver driver;
	Logger log;
	
	@BeforeClass
	public void setUpMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing VCTC\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		driver.get("https://www.saucedemo.com/");
		log = Logger.getLogger("SauceDemoMaven");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@BeforeMethod
	public void loginMethod()
	{
		LoginPageClass login = new LoginPageClass(driver);
		login.sendUsername();
		log.info("username entered");
		login.sendPassword();
		log.info("password enter");
		login.clickLoginButton();
		log.info("click login button");
	}
	
	@AfterMethod
	public void logOutMethod()
	{
		HomePageClass home = new HomePageClass(driver);
		home.clickSettingButton();
		home.clickLogoutButton();
	}
	
	 @AfterTest
	 public void tearDown()
	 {
		 driver.quit();
	 }

}
