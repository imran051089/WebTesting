package com.DropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountryNames_ExcelWrite {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement>Countrynames=Country.findElements(By.tagName("option"));
		System.out.println(Countrynames.size());
		
		FileInputStream file = new FileInputStream("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\CountryNames.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
				
		for(int i=0;i<Countrynames.size();i++)
		{
				String 	CountryName=Countrynames.get(i).getText();
				System.out.println(CountryName);
				
				Row r=sheet.createRow(i);
				Cell c=r.createCell(0);
				
				c.setCellValue(Countrynames.get(i).getText());
		
				FileOutputStream file1 = new FileOutputStream("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\CountryNames.xlsx");
				workBook.write(file1);
		}
		driver.close();


	}

}
