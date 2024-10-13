package listnersInJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnersInJava  implements ITestListener {
	WebDriver d;
	public ListnersInJava() {
		WebTest wt=new WebTest();
		d=wt.driver;
	}
	

	public void onTestStart(ITestResult result) {

		System.out.println("on Teststart"+d);
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {

		try {
			File f = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("G:\\TestNgPractice2\\ScreenShot\\Fail.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("onTestSkipped");
	}

	public void onFinish(ITestContext context) {

		System.out.println("onFinish");
	}

	public void onStart(ITestContext context) {

		System.out.println("onStart");
	}

}
