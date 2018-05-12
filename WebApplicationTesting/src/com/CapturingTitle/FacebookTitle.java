package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTitle {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		System.out.println("Printing Title of FaceBook Application");
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
