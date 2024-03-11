package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerconforim extends Basepage1 {

	public Registerconforim(WebDriver Driver) {
		super(Driver);
		
	}
	@FindBy(xpath="//input[@id='id_7']")
	WebElement psd;
	
	@FindBy(xpath="//input[@id='id_8']")
	WebElement cpsw;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement cb;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement capcha;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	
	
	public void psd() {
		psd.sendKeys("Vaishnavi");
		
	}
	public void cpsw() {
		cpsw.sendKeys("Vaishnavi");
		
	}
	public void cb() {
		cb.click();
	}
	
	public void capcha() {
		capcha.click();
	}
	public void submit() {
		submit.click();
	}
}
