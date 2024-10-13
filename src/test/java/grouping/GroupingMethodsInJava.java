package grouping;

import org.testng.annotations.*;

public class GroupingMethodsInJava {

	@Test(groups= {"smoke"})
	public void test() {
		System.out.println("test");
	}
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups= {"sanity"})
	public void Test2() {
		System.out.println("test 2");
	}
	@Test(groups= {"sanity"},dependsOnMethods= {"test1"})
	public void Test3() {
		System.out.println("test 3");
	}
	@Test(groups= {"sanity","smoke"})
	public void Test4() {
		System.out.println("test 4");
	}
}
