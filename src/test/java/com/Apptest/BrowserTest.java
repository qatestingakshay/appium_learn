package com.Apptest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Android.Action;

public class BrowserTest extends Action {

	@Test
	public void QAtest() {
		
		System.out.println("Running in Browser");
		
		String browserurl =getdriver.getCurrentUrl();
		System.out.println("browserurl"+browserurl);
		
		getdriver.findElement(By.xpath("(//a[@id='storeLocatorQuickLink'])[1]")).click();
		
		getdriver.findElement(By.xpath("//*[@sw-focus-route='scene-dot-3']")).click();

		
		
	}
	
}
