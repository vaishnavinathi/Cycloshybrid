package testCases;

import org.testng.annotations.Test;

import pageObject.Homepagelogin;
import pageObject.loginpage;
import testBase.Baseclasslogin;

public class TC_02_login extends Baseclasslogin{
	@Test
	public void LoginAccount() throws InterruptedException {
		Homepagelogin hpl=new Homepagelogin(driver);
		loginpage lp=new loginpage(driver);
		hpl.click_login();
		logger.info("click on login");
		lp.setUser(RB.getString("User"));
		logger.info("Entered user");
		
	   lp.setpassword(RB.getString("password"));
		logger.info("Entered password");
		lp.clicksubmit();
		logger.info("Clicked on Submit");
		
		
		

}

}
