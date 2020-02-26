package com.Selenium;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;

import com.Android.Base;
import com.Apptest.AppTest;

public class SearchColor extends Base {
	
	@FindBy(xpath="//a[@class='button-bar__options__option__btn '])[1]")
	WebElement searchcolorLink;
	
	@FindBy(xpath="//a[@class='button-bar__options__option__btn  button-bar__options__option__btn--active ']")
	WebElement Cancel;
	
	@FindBy(xpath="(//a[@class='button-bar__options__option__btn '])[1]")
	WebElement Red;
	
	@FindBy(xpath="(//a[@class='button-bar__options__option__btn '])[2]")
	WebElement Orange;
	
	@FindBy(xpath="//*[@id=\"SearchBarInput4\"]")
	WebElement SearchBarInput4;
	
	public void SearchBarInput(String Blue) {		
		SearchBarInput4.sendKeys(Blue);
	}
    public void Cancelbtn() {
    	Cancel.click();
    }
   
    public void searchcolor() {
    	searchcolorLink.click();
    	
    }
    	
    
		
	}

	

