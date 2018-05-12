package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElementByLinkText("REGISTER").click();
	}
	
	@Test(priority=2)
	public void UserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("imran");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("123");
		driver.findElement(By.id("userName")).sendKeys("imran@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123");
		driver.findElement(By.name("city")).sendKeys("Newyorkcity");
		driver.findElement(By.name("state")).sendKeys("Newyork");
		driver.findElement(By.name("postalCode")).sendKeys("789");
		
		/*WebElement country=driver.findElement(By.name("country"));
		Select Selection = new Select(country);
		Selection.selectByValue("215");*/
		
		driver.findElement(By.name("country")).sendKeys("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("Imrrran");
		driver.findElement(By.name("password")).sendKeys("something");
		driver.findElement(By.name("confirmPassword")).sendKeys("something");
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="Imrrran";
		System.out.println(expected_UserName);
		
		String actual_ResultUserText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a")).getText();
		System.out.println(actual_ResultUserText);
		
		
		if(actual_ResultUserText.contains(expected_UserName))
		{
			System.out.println("User Registered Successfully -- PASS");
		}
		else
		{
			System.out.println("User Registration Failed -- FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}
