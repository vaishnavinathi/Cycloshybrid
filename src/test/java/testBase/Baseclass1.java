package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/users/registration");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterClass
	public void close() {
		driver.quit();

	}

}
