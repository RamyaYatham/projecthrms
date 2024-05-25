package vTiger_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:8888/");
		//xpath for un
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//xpath for pwd
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//click on login button
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//expected title 
		String expT="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		//actual title 
		String actT = driver.getTitle();
		//verification
		if(actT.equals(expT)) {
			System.out.println("user is navigated to Home page, TC is passed");
		}
			else {
				System.out.println("user is not navigated to Home page, TC is failed");
			}

}
}
