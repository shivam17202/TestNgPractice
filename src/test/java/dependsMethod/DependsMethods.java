package dependsMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethods {
	@Test
	void test1() {
		Assert.assertTrue(false);
		System.out.println("test 1");
	}
	@Test(dependsOnMethods= {"test1"},alwaysRun=true)
	void test2() {
		System.out.println("test 2");
	}
	
}
