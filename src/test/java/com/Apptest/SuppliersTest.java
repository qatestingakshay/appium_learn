package com.Apptest;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Android.Base;
import com.pom.SuppliersPage;

public class SuppliersTest extends Base {
	SuppliersPage supplierspage;
	public SuppliersTest()
	{
		super();
	}

	@BeforeMethod
	public void insetup() throws MalformedURLException, InterruptedException {
		setup();
		supplierspage =new SuppliersPage();
	}

	@Test
	public void suppliersTest() throws InterruptedException {
		supplierspage.supplieslinkclick();
	}

	@Test
	public void auppliersurlTest() throws InterruptedException {
		String supplerspageurl = supplierspage.verifysuppliesurl();
		if(supplerspageurl.equals("https://www.sherwin-williams.com/")){
			System.out.println(supplerspageurl+"Page URL match Passssssss");
		}else {
			System.out.println(supplerspageurl+"Page URL not match Faillllllllll");
		}
	}
	//@Test(priority=3)
	@Test
	public void suppliersUrlTittle() throws InterruptedException {

		String supplerspagetitle= supplierspage.verifysupplieslink();
		if(supplerspagetitle.equals("Sherwin-Williams Paints, Stains, Supplies and Coating SolutionsPage")){
			System.out.println(supplerspagetitle+"Page Tittle match Passssssss");
			supplierspage.supplieslinkclick();
		}else {
			System.out.println(supplerspagetitle+"Page Tittle not match Faillllllllll");
		}	

	}




	@AfterMethod
	public void teardown() {
		getdriver.quit();

	}
}
