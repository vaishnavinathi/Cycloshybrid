package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepagelogin extends Basepage1 {

	public Homepagelogin(WebDriver Driver) {
		super(Driver);
		
	}
	@FindBy (id="login-link")
	WebElement btn_loginlink;
	
	public void click_login() {
		btn_loginlink.click();
}
}
