package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Myaccountpage;
import pageObject.Ochomepage;
import testBase.Baseclass;
import utilities.DataProviders;

public class TC003_OC_LoginpagetestDDT extends Baseclass {
	
	@Test  (dataProvider = "LoginData" , dataProviderClass=DataProviders.class, groups = {"master","regression"}) //Getting data provider from different class
	public void Verifylogin(String email, String Pwd, String exp)
	{	
		try
		{
		Ochomepage Ochm = new Ochomepage(driver);
		Ochm.Enterusername(email);
		Ochm.Enterpassword(Pwd);
		Ochm.clickonlogin();
		
		//My account 
		Myaccountpage macc = new Myaccountpage(driver);
		boolean targetpage =macc.isMyAccountPageExists();
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetpage==true)
			{
				macc.clicklogout();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				macc.clicklogout();
				Assert.assertTrue(false);
				
			}
			else
			{
				Assert.assertTrue(true);
			}
				
		}
		
	}catch(Exception e)
		{
			Assert.fail();
		}
	}}
