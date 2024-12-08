package pageObject;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{
		
	WebDriver driver;
	
	  //Constructor
		public Loginpage(WebDriver driver) 
	  {
		  super(driver);
	  }
		
	//Locators
	@FindBy(xpath="//input[@name='username']")  
	WebElement txt_username;
		
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btn_submit;
	
	
	
	
	//Action methods
	
	public void username(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void password(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void submit()
	{
		btn_submit.click();
	}
		
	public void alert()
	{
		driver.switchTo().alert().accept();
	}
}
