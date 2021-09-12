package testcases;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
	
	
	
	@Test(priority = 1)
	public void login()
	{
		lp.loginToApp();
		lp.enterPin();
		
	}
	

	

}
