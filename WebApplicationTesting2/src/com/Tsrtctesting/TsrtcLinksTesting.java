package com.Tsrtctesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TsrtcLinksTesting {

	public static void main(String[] args) throws IOException
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
			
	 WebElement HeaderBlock=driver.findElementByClassName("menu-wrap");
	 
	 List<WebElement>HeaderBlockLInks=HeaderBlock.findElements(By.tagName("a"));
	 System.out.println(HeaderBlockLInks.size());
	 
	 for(int k=0;k<HeaderBlockLInks.size();k++)
	 {
		 String linkName=HeaderBlockLInks.get(k).getText();
		 System.out.println(linkName);
		 
		 HeaderBlockLInks.get(k).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Immu\\Desktop\\ImranSelenium\\WebApplicationTesting\\TSRTC_ScreenShots\\"+linkName+".png"));
			
			driver.navigate().back();
			
			HeaderBlock=driver.findElementByClassName("menu-wrap");
			HeaderBlockLInks=HeaderBlock.findElements(By.tagName("a"));
			
			
	 }
		driver.close();
		
	}

}
