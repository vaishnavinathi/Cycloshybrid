package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends Basepage1 {

	public Register(WebDriver Driver) {
		super(Driver);
		
	}
@FindBy(xpath="//input[@id='id_1']")
	
	WebElement name;
	
	@FindBy (xpath="//input[@id='id_2']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='id_3']")
	
	WebElement email;
	
@FindBy(xpath="//input[@id='website']")
	
	WebElement website;
	
	@FindBy (xpath="//label[text()=' Male ']")
	WebElement gender;
	
	@FindBy(xpath="//button[@id='business_type']")
	
	WebElement drpdn;
	
	
	@FindBy (id="business_type_clothing")
	WebElement cloth;
	
	@FindBy (xpath="//input[@id='id_4']")
	
	WebElement mobile;
	
	@FindBy (xpath="//input[@id='id_5']")
	WebElement landline;
	
	@FindBy(xpath="//span[text()='Next']")
	
	WebElement next;
	
	public void name() {
		name.sendKeys("Vaishnavi");
		
	}
	public void Lname() {
		Lname.sendKeys("nathi");
		
	}
	
	public void email() {
		email.sendKeys("vaishnavinathi@gmail.com");
	}
	
	
	public void gender() {
		gender.click();
		
	}
	public void website() {
		website.sendKeys("vaishnavinathi@gmail.com");
	}
	public void drpdn() {
		drpdn.click();
		
		
	}
	public void cloth () {
		cloth.click();
		
		
	}
	public void mobile() {
		mobile.sendKeys("99495089510");
		
	}
	public void landline() {
		landline.sendKeys("244781");
		
	}
	public void next() {
		next.click();
	}
	

	
	
}
