package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ochomepage extends Basepage {
	
	WebDriver driver;
	
	  //Constructor
			public Ochomepage(WebDriver driver) 
		  {
			  super(driver);
		  }

			
	//Locators
			
			
		@FindBy(xpath="//input[@name='email']")	
		WebElement txt_username;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement txt_password;
			
		@FindBy(xpath="//input[@value='Login']")
		WebElement btn_login;
			
			
		@FindBy(xpath="//a[text()='Components']")  
		WebElement btn_component;
		
		@FindBy(xpath="//a[text()='Monitors (2)']")
		WebElement btn_Monitor;
		
	//Action methods
		
		public void Enterusername(String username)
		{
			txt_username.sendKeys(username);
		}
		
		public void Enterpassword(String password)
		{
			txt_password.sendKeys(password);
		}
		
		public void clickonlogin()
		{
			btn_login.click();
		}
		
		public void componentmenu()
		{
			btn_component.click();
		}
		
		public void Monitorsubmenu()
		{
			btn_Monitor.click();
		}
}
