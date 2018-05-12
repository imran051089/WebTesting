package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMercuryTours 

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
		
	
		@FindBy(name="firstName")
		WebElement FirstName;
		
		@FindBy(name="lastName")
		WebElement LastName;
		
		@FindBy(name="phone")
		WebElement PhoneNumber;
		
		@FindBy(name="userName")
		WebElement Email;
		
		@FindBy(name="address1")
		WebElement Address;
		
		@FindBy(name="city")
		WebElement City;
		
		@FindBy(name="state")
		WebElement State;

		@FindBy(name="postalCode")
		WebElement ZipCode;
		
		@FindBy(name="country")
		WebElement Country;
		
		@FindBy(name="email")
		WebElement UserName;
		
		@FindBy(name="password")
		WebElement Password;
		
		@FindBy(name="confirmPassword")
		WebElement ConfirmPassword;
	
		@FindBy(name="register")
		WebElement Register1;
		
		public void Register1()
		{
			Register1.click();
		}
		
		public void UserRegistration(String FN, String LN, String Phonenumber, String Email, String Address, String City, String State, String ZipCode, String Country, String UserName, String Password, String ConfirmPassword) 
		{
			
		}
	
}
