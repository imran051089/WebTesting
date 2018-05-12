package com.instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramLogin
{

	public static void main(String[] args) throws InterruptedException
	{
	     FirefoxDriver driver = new FirefoxDriver();
	     driver.get("http://instagram.com");
	     
	     Thread.sleep(10000); // wait
	     
	     driver.findElement(By.linkText("Log in")).click();
	     
	     
	     
	     
	     

	}

}
