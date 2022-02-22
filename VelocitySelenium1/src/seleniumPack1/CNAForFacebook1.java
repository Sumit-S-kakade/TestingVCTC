package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CNAForFacebook1 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser open successfully");
		driver.get("https://www.facebook.com/");
		System.out.println("URL open successfully");
		WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Thread.sleep(3000);
		createNewAccount.click();
		System.out.println("Account create page open successfully");
		
//		FirstName
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		boolean r1 = fName.isEnabled();
		if(r1 == true)
		{
			fName.sendKeys("Sumit");
			System.out.println("Text Box is Enabled");
		}
		else
		{
			System.out.println("Text box is Enabled");
		}
		Thread.sleep(3000);
		

		//	LastName
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
	    boolean r2 = lName.isEnabled();
	    if (r2 == true)
	    {
	    	lName.sendKeys("Kakade");
	    	System.out.println("Text Box Is Enabled");
	    }
	    else
	    {
	    	System.out.println("Text Box is not Enabled");
	    }
		Thread.sleep(3000);
		
//		Enter email
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		boolean r3 = email.isEnabled();
		if(r3 == true)
		{
			email.sendKeys("sumitkakade084@gmail.com");
			System.out.println("Text Box is Enabled");
		}
		else
		{
			System.out.println("Text Box is not enabled");
		}
		Thread.sleep(3000);
		
		//Reenter Email
		WebElement remail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean r4 = remail.isEnabled();
		if(r4 == true)
		{
			remail.sendKeys("sumitkakade084@gmail.com");
			System.out.println("Text Box is Enabled");
		}
		else
		{
			System.out.println("Text Box is not enabled");
		}
		Thread.sleep(3000);
		
//		Password
		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		boolean r5 = password.isEnabled();
		if(r5 == true)
		{
			password.sendKeys("sumit");
			System.out.println("Text Box is Enabled");
		}
		else
		{
			System.out.println("Text Box is not enabled");
		}
		Thread.sleep(3000);
		
		
//		Drop Down -Date 
		
		WebElement dropDownDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		dropDownDate.click();
		Select d1 = new Select(dropDownDate);
		d1.selectByValue("25");
		Thread.sleep(3000);
		
		
//        Drop Down -Month 
		
		WebElement dropDownMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		dropDownMonth.click();
		Select d2 = new Select(dropDownMonth);
		d2.selectByValue("10");
		Thread.sleep(3000);
		
		
//		 Drop Down -Year 
			
			WebElement dropDownYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			dropDownYear.click();
			Select d3 = new Select(dropDownYear);
			d3.selectByValue("2000");
			Thread.sleep(3000);
		
		
		
//			SelectGender
			WebElement chkBoxGender = driver.findElement(By.xpath("//input[@value='2']"));
			boolean r6 = chkBoxGender.isSelected();
			if(r6 = true)
			{
				chkBoxGender.click();
			}
			
			
			
//			SignUpButton
			
			WebElement signUp = driver.findElement(By.xpath("//input[@id='asked_to_login']"));
			
			signUp.click();
}	

}
