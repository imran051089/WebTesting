package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_BestBuy {

	public static void main(String[] args)
	{
		FirefoxDriver imran = new FirefoxDriver();
		 imran.get("http://bestbuy.com");
		
		//imran.get("http://www.facebook.com");
		
		imran.navigate().to("http://google.com");
		
		imran.close();

	}

}
