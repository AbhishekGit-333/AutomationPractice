package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Ochomepage;
import pageObject.Ocproductcategorypathpage;
import testBase.Baseclass;

public class TC002_OC_WishlistTest extends Baseclass{
	
	
	
	@Test(groups = {"sanity","regression"})
	public void Verifylogin()
	{
		Ochomepage Ochm = new Ochomepage(driver);
		Ochm.Enterusername(p.getProperty("Ename"));
		Ochm.Enterpassword(p.getProperty("Epassword"));
		Ochm.clickonlogin();
	}
	
	
	
	@Test(priority = 2, groups = {"Regression"})
	public void verifywishlist() throws InterruptedException
	{
		Ochomepage Ochm = new Ochomepage(driver);
		Ochm.componentmenu();
		Ochm.Monitorsubmenu();
		
		Ocproductcategorypathpage Ocpc = new Ocproductcategorypathpage(driver);
		Ocpc.clickonwishlist();
		Thread.sleep(5000);
		
		String confmessgage=Ocpc.wishlistconfmsg();
		if(confmessgage.equals("Success: You have added Apple Cinema 30\" to your wish list!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
		 Assert.assertTrue(false);
		}
	}

}
