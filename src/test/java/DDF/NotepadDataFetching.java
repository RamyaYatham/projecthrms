package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class NotepadDataFetching {
	@Test
	public void readDatafromNotepad() throws Throwable {
		FileInputStream fisp = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\ADVANCEDSELENIUM\\src\\test\\resources\\CommonData.properties");
		//create object of properties class
		Properties p = new Properties();
		//move the folder from files to properties folder
		p.load(fisp);
	//write the keys and print the value
		p.getProperty("un");
		System.out.println(p.getProperty("un"));
		p.getProperty("pwd");
		System.out.println(p.getProperty("pwd"));
		p.getProperty("url");
	System.out.println(p.getProperty("url"));
	}
	

}
