package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_basics {
	//pre conditions annotations - starting with @before
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	@BeforeTest
	public void launchbrowser() {
		System.out.println("launch the browser");
	}
	@BeforeClass
	public void login() {
		System.out.println("login into application");
	}
	
	@BeforeMethod
	public void enterurl() {
		System.out.println("enter URL");
			
		}
		@Test
		public void googleTitleTest() {
			System.out.println("google title test");
	}
	@Test
	public void verifylogo() {
		int a = 9/0;
		System.out.println("google logo verified");
		
	}
	
	//post conditions - starts with @after
	@AfterMethod
	public void logout() {
		System.out.println("logut from the application");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}
	@AfterTest
	public void deleteallcookies() {
		System.out.println("delete all the cookies");
	}
	

}
