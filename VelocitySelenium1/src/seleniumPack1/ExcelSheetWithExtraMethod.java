//Method of Sheet and row
package seleniumPack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetWithExtraMethod 
{
	
	public static void main(String[] args) throws IOException 
	{
		//File Path
		String path  = "C:\\Testing VCTC\\ExcelFile\\DataFatchingSheet.xlsx";
		
//		File Read
		FileInputStream file  = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet4");
		int rows = sheet.getLastRowNum();
		System.out.println("Total rows="+rows);
		
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println("Total columns="+columns);
		
		for(int r=0;r<=rows;r++)       //rows
		{
		  XSSFRow row = sheet.getRow(r)	;
		  for(int c=0;c<columns;c++)
		  {
			  XSSFCell cell = row.getCell(c);
			  String cellValue = cell.getStringCellValue();
			  System.out.println(cellValue);
			  
			  
		  }
		}
		
		
		
		
	}
	
	

}
