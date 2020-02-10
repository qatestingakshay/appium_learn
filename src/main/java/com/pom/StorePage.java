package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Android.Base;

public class StorePage extends Base{

	@FindBy(xpath="//*[@id='topCategoryLink_21030']")
	 WebElement color;
	 
	 public StorePage(){
		 PageFactory.initElements(getdriver, this);
	 }

	 public String verifyPageTitle(){
		 return getdriver.getTitle();
		 
	 }
	 
	 public void colorLink(){
		 color.click();
		 
	 }
	 
	 
}
