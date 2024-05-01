package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task6 extends Basepage1 {

		public Task6(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
		WebElement payuser;
		
		@FindBy(xpath="//div[text()='Scheduled payments']")
		WebElement Scheduledpayments;
		
		@FindBy(xpath="//div[text()='Scheduled']")
		WebElement Scheduled;
		
		@FindBy(xpath="//a[text()=' Canceled ']")
		WebElement Canceled;
		
		
		public void payuser() {
			payuser.click();
		}
		public void Scheduledpayments() {
			Scheduledpayments.click();
		}
		public void Scheduled() {
			Scheduled.click();
		}
		public void Canceled() {
			Canceled.click();
		}
		public void getcurrentpage() {
			System.out.println(Driver.getTitle());
		}
}