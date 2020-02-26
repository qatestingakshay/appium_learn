package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Android.Base;

public class Homepage extends Base{
	
			
 @FindBy(xpath="(//a[@id='storeLocatorQuickLink'])[1]")
 WebElement storelink;
 

 
 public Homepage(){
	 PageFactory.initElements(getdriver, this);
 }

 public String verifyPageTitle(){
	 return getdriver.getTitle();
 }
 
 public StorePage storeLink(){
	 storelink.click();
	 return new StorePage();
 }
	
}
