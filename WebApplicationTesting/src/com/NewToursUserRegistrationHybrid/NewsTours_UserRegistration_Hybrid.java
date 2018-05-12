package com.NewToursUserRegistrationHybrid;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewsTours_UserRegistration_Hybrid

{
	FirefoxDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

		
	@Test(priority=1)
	public void Register() throws IOException
	{
        FileInputStream file1 = new FileInputStream("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\NewToursUserRegistration.properties");
		
		Properties prop = new Properties();
		prop.load(file1);
		driver.findElementByLinkText(prop.getProperty("register")).click();
	}
	
	@Test(priority=2)
	public void UserRegistration() throws IOException
	{
        FileInputStream file1 = new FileInputStream("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\NewToursUserRegistration.properties");
		
		Properties prop = new Properties();
		prop.load(file1);
		
		FileInputStream file = new FileInputStream("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\src\\com\\ExcelTestDataFiles\\NewUserRegisterationTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=RowCount;i++)
		{
			Row r=sheet.getRow(i);
		
		driver.findElement(By.name(prop.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name(prop.getProperty("lastName"))).sendKeys(r.getCell(1).getStringCellValue());
		
		// type casting
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String PhoneNumber=Long.toString(x);
		
		driver.findElement(By.name(prop.getProperty("phone"))).sendKeys(PhoneNumber);
		
		driver.findElement(By.id(prop.getProperty("userName"))).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name(prop.getProperty("address1"))).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name(prop.getProperty("city"))).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name(prop.getProperty("state"))).sendKeys(r.getCell(6).getStringCellValue());
		
		double p=r.getCell(7).getNumericCellValue();
		long y=(long)p;
		String postalCode=Long.toString(y);
		
		driver.findElement(By.name(prop.getProperty("postalCode"))).sendKeys(postalCode);
		
		/*WebElement country=driver.findElement(By.name("country"));
		Select Selection = new Select(country);
		Selection.selectByValue("215");*/
		
		driver.findElement(By.name(prop.getProperty("country"))).sendKeys(r.getCell(8).getStringCellValue());
		
		driver.findElement(By.name(prop.getProperty("email"))).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name(prop.getProperty("password"))).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name(prop.getProperty("confirmPassword"))).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name(prop.getProperty("register"))).click();
		
		String expected_UserName=r.getCell(9).getStringCellValue();
		System.out.println(expected_UserName);
		
		String actual_ResultUserText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a")).getText();
		System.out.println(actual_ResultUserText);
		
		Assert.assertTrue(actual_ResultUserText.contains(expected_UserName),"Text not Matched..failed");
			
		FileOutputStream file2 = new FileOutputStream("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\src\\com\\ExcelTestResultFiles\\NewUserRegistrationTestResult.xlsx");
		workBook.write(file2);
		
		driver.navigate().back();
	}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
}
