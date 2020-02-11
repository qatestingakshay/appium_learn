package com.pom;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.Android.Base;

public class SuppliersPage extends Base {

	 
	@FindBy(xpath="//*[@id='storeLocatorQuickLink']")
	WebElement supplieslink;
	
	 public SuppliersPage() {
		 PageFactory.initElements(getdriver, this);		 
	 }
	 
	 
	 public String verifysupplieslink() {
		 return getdriver.getTitle();
	 }
	 
	 public String verifysuppliesurl() {
		 return getdriver.getCurrentUrl();
	 }
	 
	 public void supplieslinkclick() {
		  supplieslink.click();
	 }
	 
	 
	
}
