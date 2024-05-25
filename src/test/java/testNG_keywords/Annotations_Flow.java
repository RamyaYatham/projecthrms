package testNG_keywords;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_Flow {
	@BeforeSuite
	public void bs() {
		System.out.println("*****DB connection********");
	}
	@BeforeClass
	public void bc() {
		System.out.println("launch the browser");
	}
   @BeforeMethod
   public void bm() {
	   System.out.println("login to the app");
   }
   @Test
   public void mainTC() {
	   System.out.println("Main TestCase");
   }
   @AfterMethod
   public void am() {
	   System.out.println("logout from app");
   }
   @AfterClass
   public void ac() {
	   System.out.println("close the browser");
   }
   @AfterSuite
   public void as() {
	   System.out.println();
	   
   }
}
