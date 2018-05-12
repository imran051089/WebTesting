package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{

	@BeforeTest
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("Appliation Launch and LogIn");
	}

	
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("This is used to test ComposeMail Functionality");
	}
	
	@Test(priority=2)
	public void InBox()
	{
		System.out.println("This is used to test Inbox Functionality");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("This is used to close the Application");
	}
	
}
