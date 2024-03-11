package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage1 {
	WebDriver Driver;


	public Basepage1( WebDriver Driver) {
		
        this.Driver=Driver;
		
		PageFactory.initElements(Driver, this);
		
		// TODO Auto-generated constructor stub
	}
}
