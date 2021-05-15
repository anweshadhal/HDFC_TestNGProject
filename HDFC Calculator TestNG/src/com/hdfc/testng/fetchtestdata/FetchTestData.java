package com.hdfc.testng.fetchtestdata;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchTestData {
	
	public static String fetchTestData(String sheetName,int rowNum, int colNum)
	{
		String cellValue=null;
		try
		{
			FileInputStream excelfile=new FileInputStream("C:\\Users\\ANWESHA\\Eclipse_Updated_WorkSpace\\CodePractice\\Revision\\Go Ibibo Test NG\\src\\com\\flightbooking\\qa\\excelfiles\\TestDataFile.xlsx");
			XSSFWorkbook workbook= new XSSFWorkbook(excelfile);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			XSSFRow rownum=sheet.getRow(rowNum);
			XSSFCell colnum=rownum.getCell(colNum);
			cellValue=colnum.getStringCellValue();
		}
		catch(Exception e)
		{
			
		}
		return cellValue;
	}

}
