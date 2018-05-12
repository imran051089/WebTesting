package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours 
{
	// Obect Repository
	//WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;

	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement contact;
	
	public void Contact()
	{
		contact.click();
	}
	
	@FindBy(linkText="Home")
	WebElement HOME;
	
	public void HOME()
	{
		HOME.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement FLIGHTS;
	
	public void FLIGHTS()
	{
		FLIGHTS.click();
	}
	
	@FindBy(linkText="Hotels")
	WebElement HOTELS;
	
	public void HOTELS()
	{
		HOTELS.click();
	}
	
	@FindBy(linkText="Car Rentals")
	WebElement CarRentals;
	
	public void CarRentals()
	{
		CarRentals.click();
	}
	
	@FindBy(linkText="Cruises")
	WebElement Cruises;
	
	public void Cruises()
	{
		Cruises.click();
	}
	
	@FindBy(linkText="Destinations")
	WebElement Destination;
	
	public void Destination()
	{
		Destination.click();
	}
	
	@FindBy(linkText="Vacations")
	WebElement Vacation;
	
	public void Vacation()
	{
		Vacation.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement YourDestination;
	
	public void YourDestination()
	{
		YourDestination.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement FeaturedVacationDestination;
	
	public void FeaturedVacationDestination()
	{
		FeaturedVacationDestination.click();
	}
	
	@FindBy(linkText="Register                      here")
	WebElement RegisterHere;
	
	public void RegisterHere()
	{
		RegisterHere.click();
	}
	
	@FindBy(linkText="Business                      Travel @ About.com")
	WebElement BusinessTravel;
	
	public void BusinessTravelAbout()
	{
		BusinessTravel.click();
	}
	
	@FindBy(linkText="Salon Travel")
	WebElement SalonTravel;
	
	public void SalonTravel()
	{
		SalonTravel.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;

	@FindBy(name="login")
	WebElement LogIn;
	
	public void LogIN(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		LogIn.click();
	}
	
}
