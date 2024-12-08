package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ocproductcategorypathpage extends Basepage{
	
	WebDriver driver;
	
	//constructor
	public Ocproductcategorypathpage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[2]")
	WebElement Icn_Wishlist;
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement verifywidhlistadded;
	
//	Action Methods
	
	public void clickonwishlist()
	{
		Icn_Wishlist.click();
	}
	
	public String wishlistconfmsg()
	{
		try {
		return(verifywidhlistadded.getText());
		} catch(Exception e) {
			return (e.getMessage());
		}
	}
	

}
