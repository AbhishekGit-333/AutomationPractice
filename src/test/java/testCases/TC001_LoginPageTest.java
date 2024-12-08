package testCases;

import org.testng.annotations.Test;

import pageObject.Loginpage;
import testBase.Baseclass;

public class TC001_LoginPageTest extends Baseclass {	
	
	
	@Test (groups = {"sanity","master"})
	public void verify_login()
	{
		Loginpage hm = new Loginpage(driver);
		hm.username(p.getProperty("username"));
		hm.password(p.getProperty("Password"));
		hm.submit();
		hm.alert();
	}
	

}
