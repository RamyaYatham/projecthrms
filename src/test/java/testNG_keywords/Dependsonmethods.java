 package testNG_keywords;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {
	@Test
	public void login() {
		Reporter.log("hello",true);
		//to fail the testcase use Assert.fail methods
		Assert.fail();
	}
	@Test(dependsOnMethods = {"login"})
	public void logut() {//if logout depends on login and if we use dependsonmethods then logut also fails
		Reporter.log("heyy",true);
	}


}
