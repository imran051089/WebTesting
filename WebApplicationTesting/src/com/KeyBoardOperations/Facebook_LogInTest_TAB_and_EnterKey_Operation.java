package com.KeyBoardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest_TAB_and_EnterKey_Operation {

	public static void main(String[] args) 
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("Heloooo");
	
	// Using Tab key on KeyBoard
	Actions act = new Actions(driver);
	act.sendKeys(Keys.TAB).build().perform();
	
	
	act.sendKeys("Hiii").build().perform();
	
	// Using Enter Key on KeyBoad
	act.sendKeys(Keys.RETURN).build().perform();
	

	}

}
