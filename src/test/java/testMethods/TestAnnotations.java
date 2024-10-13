package testMethods;

import org.testng.annotations.*;

public class TestAnnotations {

	@BeforeSuite
	public void test() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void test1() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void test2() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void test3() {
		System.out.println("Before method");
	}
	@Test
	public void Test() {
		System.out.println("test 1");
	}
	@Test
	public void Test2() {
		System.out.println("test 2");
	}
	@AfterSuite
	public void test4() {
		System.out.println("After Suite");
	}
	@AfterTest
	public void test5() {
		System.out.println("Ater test");
	}
	@AfterClass
	public void test6() {
		System.out.println("After class");
	}
	@AfterMethod
	public void test7() {
		System.out.println("After Method");
	}
}
