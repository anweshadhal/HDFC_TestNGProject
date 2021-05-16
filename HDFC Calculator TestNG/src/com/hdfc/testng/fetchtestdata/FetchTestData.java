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
			FileInputStream excelfile=new FileInputStream("C:\\Users\\ANWESHA\\git\\HDFC_TestNGProject\\HDFC Calculator TestNG\\src\\com\\hdfc\\testng\\excelfiles\\TestData.xlsx");
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
