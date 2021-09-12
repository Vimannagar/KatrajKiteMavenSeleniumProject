package testcases;

import org.testng.annotations.Test;

import extentlisteners.ExtentListeners;


public class LoginTest extends ExtentListeners {
	
	
	
	@Test(priority = 1)
	public void login()
	{
		lp.loginToApp();
		test.info("Login has been done successfully");
		
		lp.enterPin();
		
		test.info("Pin has been entered and continue has pressed");
	}
	

	

}
