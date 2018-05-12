package com.RadioButtonTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Echo_RadioButtonTesting {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement>radio=table.findElements(By.name("group1"));
		
		System.out.println(radio.size());
		
		for(int i=0;i<radio.size();i++)
		{
			radio.get(i).click();
			
			for(int k=0;k<radio.size();k++)
			{
				System.out.println(radio.get(k).getAttribute("value")+"   "+radio.get(k).getAttribute("checked"));
				Thread.sleep(5000);
			}
		}
		
		
		driver.close();

	}

}
