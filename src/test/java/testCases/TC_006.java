package testCases;

import org.testng.annotations.Test;

import pageObject.login;
import pageObject.Task6;
import testBase.Baseclass1;

public class TC_006  extends Baseclass1 {
	@Test 
	public void register() throws InterruptedException {
		login L1=new login(driver);
		
		Task6 T6 = new Task6(driver);
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		T6.payuser();
		Thread.sleep(2000);
		T6.Scheduledpayments();
		Thread.sleep(2000);
		T6.Scheduled();
		Thread.sleep(2000);
		T6.Canceled();
		Thread.sleep(3000);
		T6.getcurrentpage();
	}
}


