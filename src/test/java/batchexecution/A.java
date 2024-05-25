package batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void TC1() {
		Reporter.log("I am TC1",true);
	}
@Test
public void TC2() {
	Reporter.log("I am TC2",true);
}
@Test(enabled =false)
public void TC3() {
	Reporter.log("I am TC3",true);
}
}
