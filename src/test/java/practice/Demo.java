package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test// it sis followed by non static method
	public void m1() {
		Reporter.log("hii",true);
	}
	@Test
	public void m2() {
		Reporter.log("hello good morning",true);
	}
}
