package testMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LounchDriver {
	WebDriver driver;
	@Test
	void lounchDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		 driver=new ChromeDriver(op);
		driver.get("https://chatgpt.com/c/66fce368-2a34-8008-bb38-fe49e5bbbfdb");
	}
	@AfterTest
	void tearDown() {
		driver.close();
		
	}
}
