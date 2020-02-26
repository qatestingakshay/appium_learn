package com.Apptest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Android.Base;
import com.excel.Xls_Reader;
import com.pom.Colorpage;

public class ExcelTest2 extends Base {
	
	Colorpage colorpage;
	public ExcelTest2(){
		super();
	}
	
	@BeforeMethod
	public void Browsersetup() throws MalformedURLException, InterruptedException {
		setup();
		colorpage = new Colorpage();
	}
	
	
	@AfterMethod
    public void close() {
		getdriver.quit();
	}
	

	@Test
	public void excelread() throws InterruptedException {
		// TODO Auto-generated method stub
		
		getdriver.findElement(By.xpath("//*[@id=\"storeLocatorQuickLink\"]")).click();

		Xls_Reader reader =  new Xls_Reader(System.getProperty("user.dir")+"\\DataPool\\address.xlsx");
		
		int rowcout = reader.getRowCount("color");
		
		System.out.println("rowcout : "+rowcout);
		
		reader.addSheet("blue");
		reader.addColumn("blue", "status");
		
		for(int row=2; row<= rowcout; row++ ){
			
		String colortype = reader.getCellData("color", "colortype", row);
		
		try {
			search(colortype);
			
			if(row==4) {
			reader.setCellData("red", "status", row, "fail");
			}else {
				reader.setCellData("red", "status", row, "pass");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reader.setCellData("red", "status", row, "fail");
		}
		
		String firstname = reader.getCellData("color", "firstname", row);
		//search(firstname);
		search(firstname);
		String lastname = reader.getCellData("color", "lastname", row);
		//search(lastname);
		search(lastname);
		String city = reader.getCellData("color", "city", row);
		//search(city);
		search(city);
		
		
		System.out.println("++++++++++++++++++  "+row+"  ++++++++++++++++++++  ");
		System.out.println(colortype);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(city);
		System.out.println("======================end row  :  " +row+"  :  =======================");
		
		
		
		
		
		
		}
		

		
		
	}
	
	
	
	
	public void search(String value) throws InterruptedException {
		
		
		getdriver.findElement(By.xpath("//*[@id=\"SimpleSearchForm_SearchTerm\"]")).sendKeys(value);
		Thread.sleep(5000);
		getdriver.findElement(By.xpath("//*[@id=\"SimpleSearchForm_SearchTerm\"]")).clear();
	
	}
	

}
