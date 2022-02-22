// Switch case use to fetch mixed value
package seleniumPack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SwitchCase 
{
  public static void main(String[] args) throws IOException 
{
	
  String path = "C:\\Testing VCTC\\ExcelFile\\Mock_8_Group A_13th Nov 2021_Batch.xlsx";
  FileInputStream file  = new FileInputStream(path);
  XSSFWorkbook workbook = new XSSFWorkbook(file);
  XSSFSheet sheet = workbook.getSheet("Sheet4");
	int rows  = sheet.getLastRowNum();
	System.out.println("Total rows="+rows);
	
	int columns  = sheet.getRow(0).getLastCellNum();
	System.out.println("Total columns"+columns);
	for(int r=0;r<=rows;r++);  //row
	{
		XSSFRow row = sheet.getRow(1);
		for(int c=0 ;c< columns;c++)
		{
			XSSFCell cell = row.getCell(c);
			switch(cell.getCellType())
			{
			case 1:
				System.out.println(cell.getStringCellValue());
				break;
			    case 0:
			    	System.out.println(cell.getNumericCellValue());
			    	break;
			    case 2:
			    	System.out.println(cell.getBooleanCellValue());
			    	break;
			}
		}
	}
  
}
	
}
