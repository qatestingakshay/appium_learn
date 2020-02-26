package com.Apptest;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Android.Base;
import com.pom.Homepage;
import com.pom.StorePage;

public class StoreLinkTest2 extends Base{
	
	Homepage homepage;
	StorePage storePage;
	public StoreLinkTest2(){
		super();
	}
	@BeforeMethod
	public void initailsetup() throws MalformedURLException, InterruptedException{
		setup();
		homepage = new Homepage();
		storePage = new StorePage();
				
	}
	@Test
	public void storelinktest1() throws InterruptedException{
		
		getdriver.findElement(By.xpath("//*[@id=\"storeLocatorQuickLink\"]")).click();
		
		Thread.sleep(5000);
		if(getdriver.findElements(By.xpath("//*[@title='Sherwin-Williams on Instagram']")).size()!=0) {
			
			WebElement element = getdriver.findElement(By.xpath("//*[@title='Sherwin-Williams on Instagram']"));
			JavascriptExecutor executor = (JavascriptExecutor)getdriver;
			executor.executeScript("arguments[0].click();", element);
			//getdriver.findElement(By.xpath("//*[@title='Sherwin-Williams on Instagram']")).click();
			ArrayList<String> tabs2 = new ArrayList<String> (getdriver.getWindowHandles());
			getdriver.switchTo().window(tabs2.get(1));
			
			getdriver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/header/section/div[1]/a/button")).click();
			Thread.sleep(5000);
			getdriver.close();
			getdriver.switchTo().window(tabs2.get(0));
			Thread.sleep(5000);
			if(getdriver.findElements(By.xpath("//*[@title='Sherwin-Williams on Facebook']")).size()!=0) {
				System.out.println("Sherwin-Williams on Facebook ");
				WebElement element1 = getdriver.findElement(By.xpath("//*[@title='Sherwin-Williams on Facebook']"));
				JavascriptExecutor executor1 = (JavascriptExecutor)getdriver;
				executor1.executeScript("arguments[0].click();", element1);
				//getdriver.findElement(By.xpath("//*[@title='Sherwin-Williams on Facebook']")).click();
			}else {
				System.out.println("facebook page link not working");
			}
			
		}else if(getdriver.findElements(By.xpath("//*[@title='Sherwin-Williams on Facebook']")).size()!=0) {
			getdriver.findElement(By.xpath("//*[@title='Sherwin-Williams on Facebook']")).click();
		}else if(getdriver.findElements(By.xpath("//*[@title='Sherwin-Williams on Facebook']")).size()!=0) {
			
		}else {
			
		}
		
		
	}
	
	@AfterMethod
	public void teardown(){
		getdriver.close();
	}
}
