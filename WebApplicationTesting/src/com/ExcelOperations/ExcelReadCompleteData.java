package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCompleteData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\TestData1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=RowCount;i++) // Rows
		{
			Row r=sheet.getRow(i);
			
			int CellCount=r.getLastCellNum();
			
			for(int k=0;k<CellCount;k++) // cell
			{
				String data=r.getCell(k).getStringCellValue();
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
	}
	

}
