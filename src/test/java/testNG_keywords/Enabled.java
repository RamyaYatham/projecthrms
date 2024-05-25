package testNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void m1() {
		Reporter.log("Hii,true");
	}
@Test(enabled=false)
public void m2() {
	Reporter.log("good evening",true);
}
}
