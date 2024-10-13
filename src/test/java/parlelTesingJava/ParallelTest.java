package parlelTesingJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver;
	@BeforeTest
	@Parameters({"browser"})
	void setup(String br) {
		
		switch(br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default : System.out.println("Unable to lounch");return;
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.testfire.net/login.jsp");
		
	
	}
	
	@Test
	void login() {
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("jsmith");
		driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
		driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}
}
