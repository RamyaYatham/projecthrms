package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching {
	public static void main(String[] args) throws Throwable {
		//create object of FindInputStream class
		FileInputStream fise =new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\ADVANCEDSELENIUM\\src\\test\\resources\\TestData.xlsx");
		//open the excel sheet 
		Workbook wb = WorkbookFactory.create(fise);
		//navigate to sheet, row, cell and fetch data
		String data1 = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
//print(0,1)
	double data2 = wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	System.out.println(data2);
	//print(0,3) data
	boolean data3 = wb.getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();	
	System.out.println(data3);
	}

}
