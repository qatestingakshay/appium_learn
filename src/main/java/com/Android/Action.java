package com.Android;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Action extends Base {
	
	public static void click(By locator,String Value) {
		
		try {
			if (driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).click();
			}
			else {
				System.out.println(Value+" : locator is not displayed : "+locator);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	
public static void enter(By locator,String Value,String name) {
		
		try {
			if (driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).sendKeys(Value);
			}
			else {
				System.out.println(Value+" : locator is not displayed : "+locator);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

}
