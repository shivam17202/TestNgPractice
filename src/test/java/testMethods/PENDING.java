package testMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PENDING {

	@Test(invocationCount=15)
	void test() throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		WebDriver d=new ChromeDriver(op);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://checkpost.parivahan.gov.in/checkpost/faces/public/payment/ChecklTransactionStatus.xhtml#");
		d.findElement(By.id("j_idt42")).sendKeys("UP13CT9751");
		d.findElement(By.xpath("//span[text()='Get Details']")).click();
		d.findElement(By.id("j_idt46:0:j_idt60")).click();
		
		d.close();
		}
}
