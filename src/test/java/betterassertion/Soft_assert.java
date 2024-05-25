package betterassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	@Test
	public void TC2(){
		String s1="hiii";
		String s2="hello";
		//object for soft assert as it is non static method
		SoftAssert s=new SoftAssert();
		s.assertEquals(s1,s2,"both are not matching");//fails tc verif 1
		//after failing
		System.out.println("boss i am after failing TC");
		s.assertAll();
	
		
	}

}
