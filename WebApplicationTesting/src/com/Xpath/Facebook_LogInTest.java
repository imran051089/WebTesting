package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		// data-testid="royal_email"
		// Syntax  of XPath Creation  ---   //tagname[@Attribute='value']
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("Hellooo");
		
		//  class="inputtext" data-testid="royal_pass"
		
		driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']")).sendKeys("hiiiii");
		
		

	}

}
