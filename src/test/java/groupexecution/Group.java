package groupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	@Test(priority=1,groups="Smoke")
	public void verifyurl() {
		Reporter.log("smoke test case",true);
	}
@Test(priority=2,groups="Smoke")
public void verifylogo() {
	Reporter.log("smoke test case",true);
	}
@Test(priority=3,groups="Functional")
public void login() {
	Reporter.log("functional test case",true);
}
@Test(priority=4,groups="Functional")
public void logout() {
	gdfhjkg
		fgmg78865
	Reporter.log("functional test case",true);
}
	}


