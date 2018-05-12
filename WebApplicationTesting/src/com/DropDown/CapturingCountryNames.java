package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCountryNames {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country=driver.findElement(By.name("country"));
		
		List<WebElement>Countrynames=Country.findElements(By.tagName("option"));
		System.out.println(Countrynames.size());
		
		for(int i=0;i<Countrynames.size();i++)
		{
				String 	CountryName=Countrynames.get(i).getText();
				System.out.println(CountryName);
		}
		driver.close();

	}

}
