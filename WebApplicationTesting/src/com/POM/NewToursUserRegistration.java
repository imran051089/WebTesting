package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursUserRegistration

{
	FirefoxDriver driver;
	String Url="http://newtours.demoaut.com";
	
	@BeforeTest
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.get(Url);
	}
	
	@Test
	public void UserRegistrationPage()
	{
	RegisterMercuryTours RMT= PageFactory.initElements(driver, RegisterMercuryTours.class);	
	
	RMT.SignOn();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.Register();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.Support();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.Contact();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.HOME();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.FLIGHTS();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.HOTELS();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.CarRentals();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.Cruises();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.Destination();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	
	RMT.Vacation();
	System.out.println(driver.getTitle());
	driver.navigate().back();
}
}