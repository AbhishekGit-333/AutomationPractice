package testCases;

import org.testng.annotations.Test;

import pageObject.Ochomepage;
import testBase.Baseclass;

public class TC001_OC_Loginpagetest extends Baseclass {
	
	@Test (groups = {"regression"})
	public void Verifylogin()
	{
		Ochomepage Ochm = new Ochomepage(driver);
		Ochm.Enterusername(p.getProperty("Ename"));
		Ochm.Enterpassword(p.getProperty("Epassword"));
		Ochm.clickonlogin();
	}

}
