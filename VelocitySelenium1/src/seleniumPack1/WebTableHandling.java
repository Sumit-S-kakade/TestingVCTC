//Web table handle:
package seleniumPack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Testing VCTC\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//		columns
		List<WebElement>  columns = driver.findElements(By.xpath("//table//tbody//tr//th"));
		int noOfColumn = columns.size();
		System.out.println("No of columns is:-"+noOfColumn);
		
//		cells
		List<WebElement> cells = driver.findElements(By.xpath("//table//tbody//tr//td"));
		int noOfCells = cells.size();
		System.out.println("No of cells is :-"+noOfCells);
		
//		rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		int noOfRows = rows.size();
		System.out.println("No of Rows:-"+noOfRows);
		
		//whole table data print 
		
		for(int i = 0;i<=noOfRows;i++)  //Rows for loop
		{
			List<WebElement> cell =rows.get(i).findElements(By.xpath("//table//tbody//tr//td"));
			int noOfCell = cell.size();
			
			for(int j=0;j>=noOfCells;j++)
			{
				String value =cells.get(j).getText();
				System.out.println(value);
			}
			System.out.println();
			
		}
		
		
	}
	}
