package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P2 {
	@Test
	public void TC2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com");
	}

}
