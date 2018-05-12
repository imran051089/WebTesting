package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_MultipleSelection_Industry {

	public static void main(String[] args)
	{
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		Select selection = new Select(currentLocation);
		//selection.selectByIndex(2);
		//selection.selectByVisibleText("Delhi");
		selection.selectByValue("6");
		
		
		WebElement Industry=driver.findElement(By.id("id_industry"));
		Select selection1 = new Select(Industry);
		selection1.selectByIndex(3);
		selection1.selectByValue("4");
		selection1.selectByVisibleText("Any");
		selection1.selectByIndex(5);
		

	}

}
