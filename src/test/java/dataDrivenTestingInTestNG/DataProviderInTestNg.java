package dataDrivenTestingInTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DataProviderInTestNg {

	WebDriver driver;
	@BeforeTest
	void setup() {

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.testfire.net/login.jsp");

	}

	@Test(dataProvider="db",dataProviderClass=TakingData.class)
	void login(String uname ,String pwd) {
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='passw']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();

	}

	@AfterTest
	void tearDown() {
		driver.quit();
	}
	
	
}
