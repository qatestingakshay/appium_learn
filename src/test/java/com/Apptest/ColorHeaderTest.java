package com.Apptest;

import java.net.MalformedURLException; 

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Android.Base;
import com.excel.Xls_Reader;
import com.pom.Colorpage;

public class ColorHeaderTest extends Base{
	
	Colorpage colorpage;
	
	
	Xls_Reader reader =  new Xls_Reader(System.getProperty("user.dir")+"\\DataPool\\address.xlsx");
	public ColorHeaderTest(){
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
	@Parameters("color")
	public void Colorheader(String color) throws InterruptedException {
		
		int rowcount = reader.getRowCount("color");
		System.out.println("rowcount : "+rowcount);
		for (int i = 1; i < rowcount; i++) {
			getdriver.get(url);
			getdriver.manage().window().maximize();
			String excelvalue = reader.getCellData("color", "colortype", i);
			System.out.println(excelvalue);
			Thread.sleep(5000);
			colorpage.Shopproducts();
			Thread.sleep(5000);
			//colorpage.Homeowners();
			colorpage.HomeownersLink();
			colorpage.Color();
			Thread.sleep(5000);
			colorpage.Search(excelvalue);
			Thread.sleep(5000);
			colorpage.Colorbutton();
			Thread.sleep(5000);
			String Headercolor = colorpage.Header();
			System.out.println(Headercolor);
			Assert.assertEquals(Headercolor, "Digital Color Wall");
		}
		
		
	
		
	
	}
	
	
	
}
