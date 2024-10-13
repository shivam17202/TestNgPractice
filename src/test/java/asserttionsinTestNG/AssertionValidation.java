package asserttionsinTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionValidation {

	WebDriver driver;
	@Test(priority=1)
	void setup()  {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://merchant.boxpay.in/");
		driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("ghf");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ghf");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	
	@Test(priority=2)
	void validate() {
		WebElement el=driver.findElement(By.xpath("//p[text()='Please enter a valid email address']"));
		
		Assert.assertTrue(el.isDisplayed(),"`````````````````````~~~~~~~~~~~~");
	}
	@Test(priority=3)
	void tearDown() {
		//System.out.println(driver);
		driver.close();
	}
}
