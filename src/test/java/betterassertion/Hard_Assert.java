package betterassertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	@Test
	public void TC1() {
		String s1="Hii";
		String s2="Hello";
		Assert.assertEquals(s1,s2,"Both are not matching");
		//after failing
		System.out.println("boss i am after failing TC");
		
		
	}

}
