package com.NewToursUsername;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckUsername {

	public static void main(String[] args)
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.findElementByLinkText("REGISTER").click();
	    driver.findElement(By.name("firstName")).sendKeys("imran");
		driver.findElement(By.name("lastName")).sendKeys("i");
		driver.findElement(By.name("phone")).sendKeys("123");
		driver.findElement(By.id("userName")).sendKeys("imran@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("123");
		driver.findElement(By.name("city")).sendKeys("Newyorkcity");
		driver.findElement(By.name("state")).sendKeys("Newyork");
		driver.findElement(By.name("postalCode")).sendKeys("789");
		
		WebElement country=driver.findElement(By.name("country"));
		Select Selection = new Select(country);
		Selection.selectByValue("215");
		
		driver.findElement(By.name("email")).sendKeys("selenium");
		driver.findElement(By.name("password")).sendKeys("something");
		driver.findElement(By.name("confirmPassword")).sendKeys("something");
		driver.findElement(By.name("register")).click();
		
		String ExpectedText="Your user name is selenium.";
		System.out.println(ExpectedText);
		
		String ActualText=driver.getPageSource().contains("selenium");
		
		if(ActualText.equals(ExpectedText))
		{
			System.out.println("URL matched -- PASS");
		}
		else
		{
			System.out.println("URL Not Matched -- FAIL");
		}
      
		

	}

}
