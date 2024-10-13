package listnersInJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTest {

	public WebDriver driver;

	@BeforeTest

	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.testfire.net/login.jsp");

	}

	@Test(priority=1)
	void login() {
		Assert.assertTrue(false);
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("jsmith");
		driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
		driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();

	}
	
	@Test(priority=2)
	void test() {
		Assert.assertTrue(false);
	}

	@AfterTest
	void tearDown() {
		driver.quit();
	}
}
