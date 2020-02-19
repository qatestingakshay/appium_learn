package com.Apptest;

import org.testng.annotations.Test;

import com.Android.Base;
import com.pom.Homepage;
import com.pom.StorePage;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;

public class color extends Base {
	Homepage homepage;
	StorePage storePage;
	
	public color(){
		super();
	}
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException, InterruptedException {
	  setup();
		homepage = new Homepage();
		storePage = new StorePage();
  }
  @Test
  public void testcases() {
	  
  }

  @AfterMethod
  public void afterMethod() {
	 
		getdriver.quit();
  }

}
