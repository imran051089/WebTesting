package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursHomePageTesting 
{

	
	FirefoxDriver driver;
	String Url = "http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get(Url);
	}
	
	@Test
	public void HomePage() 
	{
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.SignOn();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Register();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Support();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.Contact();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		WMT.LogIN("tutorial", "tutorial");
		System.out.println(driver.getTitle());
		driver.navigate().back();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
}
