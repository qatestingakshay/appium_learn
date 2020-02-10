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
	@Test
	public void storelinktest(){
		String Tittle = homepage.verifyPageTitle();
		System.out.println(Tittle+"Tittle");
		storePage = homepage.storeLink();
		String colorpagetitle= storePage.verifyPageTitle();
		System.out.println(colorpagetitle);
	}
	@AfterMethod
	public void teardown(){
		getdriver.quit();;
	}
}
