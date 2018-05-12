package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin
{

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver Driver = new FirefoxDriver();
		Driver.get("http://gmail.com");
		
		//Driver.findElementByClassName("gmail-nav__nav-link gmail-nav__nav-link__sign-in").click();
		Driver.findElementById("identifierId").sendKeys("imraan425");
		Driver.findElementByClassName("CwaK9").click();
		
		Thread.sleep(5000);
		
		//Driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("Hello");
		Driver.findElement(By.xpath("//*[@aria-label='Enter your password']")).sendKeys("Hello");
		
	//	Driver.findElementById("identifierId").sendKeys("imraan425");
		//Driver.findElementByName("password").sendKeys("imran");
		Driver.findElementByClassName("RveJvd snByac").click();
		
		Driver.close();
				
	}

}
