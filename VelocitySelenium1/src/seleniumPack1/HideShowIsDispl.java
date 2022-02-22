package seleniumPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideShowIsDispl 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Chrome open successfully ");
	driver.get("https://vctcpune.com/selenium/practice.html");
	System.out.println("URL open successfully");
	Thread.sleep(3000);
	
	//Show button
	WebElement showElementButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
	showElementButton.click();
	WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	boolean result = textBox.isDisplayed();
	System.out.println("testBox status:"+result);
	textBox.sendKeys("Sumit");

	
	//hide button
	WebElement hideElementButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	showElementButton.click();
	boolean result1 = textBox.isDisplayed();
	System.out.println("textBox status:"+ result1);

	
	//is Enabled
	
	WebElement countryTextBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	boolean result2 =countryTextBox.isEnabled();
	System.out.println(result2);
	if(result==true)
	{
		countryTextBox.sendKeys("Sumit");
	}
	else
	{
		System.out.println("Failed");
	}
	
	WebElement radioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));
	boolean result3 = radioButton.isSelected();
	System.out.println(result3);
	if(result3==false)
	{
		radioButton.click();
	}
	boolean result4= radioButton.isSelected();
	System.out.println(result4);
	
	
	
	
	
	
	
	
	
}
	
}
