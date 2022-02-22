package seleniumPack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceelSheetProgram 
{
	
	public static void main(String[] args) throws IOException 
	{
//		File Path
		String path  = "C:\\Testing VCTC\\ExcelFile\\DataFatchingSheet.xlsx";
		
//		File Read
		FileInputStream file = new FileInputStream(path);
		
//		work Book Read
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
//		sheet Read
	    XSSFSheet sheet = workbook.getSheet("Sheet2");
		
//		row read
	    XSSFRow row = sheet.getRow(0);
	    
//	    cell read
	    XSSFCell cell = row.getCell(0);
	    
//	    Value read
	    String value = cell.getStringCellValue();
	    System.out.println(value);
	    
		
		
		
		
	}
	
	

}
