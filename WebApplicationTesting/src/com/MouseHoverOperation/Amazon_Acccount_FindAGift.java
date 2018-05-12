package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Acccount_FindAGift {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.com");
		
		WebElement Account=driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions(driver);
		act.moveToElement(Account).build().perform();
		
		driver.findElement(By.xpath(".//*[@id='nav-al-wishlist']/a[3]/span")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
