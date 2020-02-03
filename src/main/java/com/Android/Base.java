package com.Android;

import java.net.MalformedURLException;
import java.net.URL;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	public static AndroidDriver<AndroidElement> driver;
	
	public static WebDriver getdriver ;
	
	public static String UserEmail = "swautomation.testing@sherwin.com";
	public static String Password = "test123";
	
	//String UserEmail = null;
	
	@BeforeMethod
	public void setup() throws MalformedURLException, InterruptedException{
		 // String value = "mobile";
		  String value = "browser";
		  //add git git code in to repo 

		if (value.equalsIgnoreCase("mobile")) {
			DesiredCapabilities Cap = new DesiredCapabilities();
			Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S10e");
			//Cap.setCapability("appPackage", "com.sherwin.probuyplus.debug");
			//Cap.setCapability("appActivity", "com.sherwin.pro.StyleGuideActivity");
			Cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "200");
			Cap.setCapability(MobileCapabilityType.APP,
					"C:\\dev\\appium\\Appium_automation\\src\\main\\resources\\sherwin-pro-4.1.0-482-debug.apk");
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), Cap);
			Thread.sleep(10000);
			// driver.findElement(By.xpath("//android.widget.Button[@text='SIGN IN']")).click();
			// 
			driver.findElementByAndroidUIAutomator("text(\"SIGN IN\")").click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@text='Email']")).sendKeys(UserEmail);
			Thread.sleep(10000);
			//click(By.xpath("//android.widget.Button[@text='SIGN IN']"), "Sign in Button");
			//enter(By.xpath("//*[@text='Email']"), UserEmail, "Enter User Email Address");
			driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(Password);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//android.widget.Button[@text='SIGN IN']")).click();
		}else if (value.equalsIgnoreCase("browser")) {
			
			
			System.setProperty("webdriver.chrome.driver", "C:/dev/appium/Appium_automation/src/main/resources/chromedriver.exe");
			 
			//System.setProperty("webdriver.chrome.driver",System.getProperty("C:/dev/appium/Appium_automation/src/main/resources/chromedriver.exe"));
		getdriver = new ChromeDriver();
		getdriver.get("https://qa-www.sherwin-williams.com/");
		
		
		
		
		
		}

	}
	@AfterMethod
	public void afterethod() {
		
		getdriver.close();	
		
	}
	
	

}
