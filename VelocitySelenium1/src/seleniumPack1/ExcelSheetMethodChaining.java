//Excel Sheet Chaining
package seleniumPack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetMethodChaining
{
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException 
	{
		//file path
		String path  = "C:\\Testing VCTC\\ExcelFile\\DataFatchingSheet.xlsx";
		//file read
		FileInputStream file = new FileInputStream(path);
		
		//workbook read
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//sheet read
		
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		
	
		//row read
		XSSFRow row = sheet.getRow(0);
				
		//cell read
				
		XSSFCell cell = row.getCell(0);
		
		//value read
		
		String userName = cell.getStringCellValue();
		System.out.println(userName);
		
		double value = cell.getNumericCellValue();
		System.out.println(value);
		//method chaining
		
		String value1 = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		
      //method of sheet and rows
		int rows = sheet.getLastRowNum();
		System.out.println("total rows "+rows);
//		
//		
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println("total columns "+columns);
		

}
}