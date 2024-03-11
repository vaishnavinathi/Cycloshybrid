package testCases;

import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.Register;
import pageObject.Registerconforim;
import testBase.Baseclass1;

public class TC_01_register extends Baseclass1 {
@Test
	
	public void register() throws InterruptedException {
		Homepage hp=new Homepage(driver);

		Register rg = new Register(driver);
		
		//Registerconforim rc = new Registerconforim(driver);
		
		
			
		
		hp.click_register();
		Thread.sleep(3000);
		rg.name();
		rg.Lname();
		rg.email();
		rg.website();
		rg.gender();
		rg.drpdn();
		rg.cloth();
		rg.mobile();
		rg.landline();
		Thread.sleep(3000);
		/*rc.psd();
		rc.cpsw();
		rc.cb();
		rc.capcha();
		rc.submit();*/
	
	}
}
