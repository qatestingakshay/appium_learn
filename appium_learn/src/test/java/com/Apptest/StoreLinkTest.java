package com.Apptest;

import java.net.MalformedURLException; 

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Android.Base;
import com.pom.Homepage;
import com.pom.StorePage;

public class StoreLinkTest extends Base{
	
	Homepage homepage;
	StorePage storePage;
	public StoreLinkTest(){
		super();
	}
	@BeforeMethod
	public void initailsetup() throws MalformedURLException, InterruptedException{
		setup();
		homepage = new Homepage();
		storePage = new StorePage();
				
	}
	//@Test(priority=1,enabled= true)
	//@Test(groups = { "smoke"})
	//@Test(description="Description : 1. login to application <br> 2. enter the cref")
	public void storelinktest1(){
		String Title = homepage.verifyPageTitle();
		System.out.println(Title+"Tittle");
		storePage = homepage.storeLink();
		String colorpagetitle= storePage.verifyPageTitle();
		System.out.println(colorpagetitle);
	}
	//@Test(priority=3,enabled= true)
	//@Test(groups = { "reg" })
	@Test(description="Description : 1. login to application <br> 2. enter the cref")
	public void storelinktest2(){
		String Titlee = homepage.verifyPageTitle();
		System.out.println(Titlee+"Title");
		storePage = homepage.storeLink();
		String colorpagetitle= storePage.verifyPageTitle();
		System.out.println(colorpagetitle);
	}
	//@Test(priority=2,enabled = false)
	//@Test(groups = { "smoke", "reg" })
	@Test(description="Description : 1. login to application <br> 2. enter the cref")
	public void storelinktest3(){
		String Titlee = homepage.verifyPageTitle();
		System.out.println(Titlee+"Title");
		storePage = homepage.storeLink();
		String colorpagetitle= storePage.verifyPageTitle();
		System.out.println(colorpagetitle);
	}
	@AfterMethod
	public void teardown(){
		getdriver.quit();;
	}
}
