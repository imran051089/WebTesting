package com.ValidatingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingURL_facebook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedUrl="facebook.com";
		System.out.println(ExpectedUrl);
		
		String ActualUrl=driver.getCurrentUrl();
		System.out.println(ActualUrl);
		
		
		if(ActualUrl.contains(ExpectedUrl))
		{
			System.out.println("URL matched -- PASS");
		}
		else
		{
			System.out.println("URL Not Matched -- FAIL");
		}
		
		driver.close();

	}

}
