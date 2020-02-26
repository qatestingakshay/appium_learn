package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Android.Base;

public class Colorpage extends Base {
	
	//@FindBy(xpath="//*[@id=\"paints--stains--colors---supplies\"]/div[2]/a")
	//WebElement Shopourproducts;
	

	@FindBy(xpath="//*[@class='globalGatewayHeaderLinks']/li[1]")
	WebElement Shopourproducts;
	
	
	
	@FindBy(xpath="//span[@id='segmentSelectorHeaderText']")
	WebElement Homeowners;
	
	@FindBy(xpath="(//ul[@class='segSelector__segments sw-cols sw-cols--flex']/li/a)[1]")
	WebElement HomeownersLink;
	
	@FindBy(xpath="//*[@id=\"topCategoryLink_21030\"]")
	WebElement Colorlink;
	
	@FindBy(xpath="//*[@class='ngdialog-close']")
	WebElement popupclose;
	
	@FindBy(xpath="//*[@placeholder=\"Search by Color Name or Number\"]")
	WebElement Searchbutton1;
	
	@FindBy(xpath="//button[@title='Find Color']/span")
	WebElement Findcolorbutton;
	
	@FindBy(xpath="//div[@class='colorWall-header']/h1")
	WebElement Colorwallheader;
	
	public Colorpage() {
		PageFactory.initElements(getdriver, this);
	}
	 
	public void Shopproducts()
	{
		Shopourproducts.click();
	}
	
	public void Homeowners()
	{
		Homeowners.click();
	}
	
	public void HomeownersLink() throws InterruptedException
	{
		
		HomeownersLink.click();
		Thread.sleep(5000);
		if(getdriver.findElements(By.xpath("//*[@class='ngdialog-close']")).size()!=0) {
		if(popupclose.isDisplayed()) {
			popupclose.click();
		}else {
			System.out.println("popup is not displayed");
		}
		}
	}
	
	public void Color()
	{
		
		Colorlink.click();
	}
	public void Search(String value)
	{
		
		
		
		Searchbutton1.sendKeys(value);
		
		
	}
	
	public void Colorbutton()
	{
		Findcolorbutton.click();
	}
	
	public String Header()
	{
		 String ColorHeader = Colorwallheader.getText();
		 return ColorHeader;
	}
	}
