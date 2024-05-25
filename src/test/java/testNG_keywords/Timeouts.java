package testNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
	@Test(timeOut = 10)
	public void testcase() {
		Reporter.log("hiii",true);
	}

}