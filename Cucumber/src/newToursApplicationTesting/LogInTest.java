package newToursApplicationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LogInTest 
{

	FirefoxDriver driver;
	
	@Given("^Open Firefox Browser and naivate to NewTours Application$")
	public void Open_Firefox_Browser_and_naivate_to_NewTours_Application()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/*@When("^I enter Valid UserName and Password and click on SignIn button$")
	public void I_enter_Valid_UserName_and_Password_and_click_on_SignIn_button()
	{
	  
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		String ExpectedTitle="Find";
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		Assert.assertTrue("LogIn Failed -- FAIL", ActualTitle.contains(ExpectedTitle));
	}*/
	
	@When("^I enter Valid \"([^\"]*)\" and \"([^\"]*)\" and click on SignIn button$")
	public void I_enter_Valid_and_and_click_on_SignIn_button(String UserName, String Password) 
	{
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
		String ExpectedTitle="Find";
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		Assert.assertTrue("LogIn Failed -- FAIL", ActualTitle.contains(ExpectedTitle));
	}

	@Then("^User should be able to successfully login and Close the Application$")
	public void User_should_be_able_to_successfully_login_and_Close_the_Application() 
	{
	   driver.close();
	}
}
