package com.Apptest;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Android.Base;

public class Prism extends Base {

	@Test
	public void Color() throws InterruptedException
	{
		getdriver.get(qaurl);
		getdriver.manage().window().maximize();
		Thread.sleep(5000);
		if(getdriver.findElements(By.xpath("//span[@class='color-wall-mode-btns__descendant inherit-font']")).size()!=0) {
			List<WebElement>Colorfamilies=getdriver.findElements(By.xpath("//span[@class='color-wall-mode-btns__descendant inherit-font']"));
			List<WebElement> Colorbtn =getdriver.findElements(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div"));
			int size =Colorbtn.size();
			System.out.println("size : "+size);
			if(size == 1232) {
				System.out.println("size expeted matched paasssssssss : "+size);
			}else {
				System.out.println("size expeted not matched faillll : "+size);
			}
			for(int i=0;i<Colorfamilies.size();i++) {
				System.out.println(i);
				Thread.sleep(5000);
				System.out.println(getdriver.findElement(By.xpath("(//span[@class='color-wall-mode-btns__descendant inherit-font'])["+(i+1)+"]")).getText());
					if( getdriver.findElement(By.xpath("(//span[@class='color-wall-mode-btns__descendant inherit-font'])["+(i+1)+"]")).getText().equalsIgnoreCase("Colour Families")){   
						getdriver.findElement(By.xpath("(//span[@class='color-wall-mode-btns__descendant inherit-font'])["+(i+1)+"]")).click();		
						Thread.sleep(5000);
						if(getdriver.findElements(By.xpath("(//ul[@class='button-bar__options no-list'])[2]/li")).size()!=0) {
							List<WebElement>Colorfamiliesbtn=getdriver.findElements(By.xpath("(//ul[@class='button-bar__options no-list'])[2]/li"));
							for(int j=0;j<Colorfamiliesbtn.size();j++) {
								if(Colorfamiliesbtn.get(j).isDisplayed())  {
									System.out.println(	Colorfamiliesbtn.get(j).getText());
									Colorfamiliesbtn.get(j).click();
									Thread.sleep(2000);
									System.out.println("size : "+Colorfamiliesbtn.size());
									System.out.println("j size : "+j);
									if((j+1)==Colorfamiliesbtn.size()) {
										System.out.println("pass");
										getdriver.findElement(By.xpath("(//*[@class='color-wall-mode-btns__descendant inherit-font'])[1]")).click();
										Thread.sleep(5000);
										//break;

									}
								}
							}
						}

					
					}else if (getdriver.findElement(By.xpath("(//span[@class='color-wall-mode-btns__descendant inherit-font'])["+(i+1)+"]")).getText().equalsIgnoreCase("Timeless Colours")){
					
						getdriver.findElement(By.xpath("(//span[@class='color-wall-mode-btns__descendant inherit-font'])["+(i+1)+"]")).click();
						
					}else if (getdriver.findElement(By.xpath("(//span[@class='color-wall-mode-btns__descendant inherit-font'])["+(i+1)+"]")).getText().equalsIgnoreCase("Search colour")){
					boolean flag =false;
						getdriver.findElement(By.xpath("(//span[@class='color-wall-mode-btns__descendant inherit-font'])["+(i+1)+"]")).click();
						getdriver.findElement(By.xpath("//input[@class='SearchBar__input']")).sendKeys("blue");
						List<WebElement>bluecolorfamily = getdriver.findElements(By.xpath(".//*[@class='color-wall-swatches__swatch']//div"));
						
						List<WebElement>viewdetails= getdriver.findElements(By.xpath("//section[@class='color-swatch-inner__content']/a"));
						System.out.println(viewdetails.size());
						
						for(int k=0;k<viewdetails.size();k++) {
							viewdetails.get(k).click();
							
							// Create object of WebDriverWait class

							WebDriverWait wait=new WebDriverWait(getdriver,120);
							// Wait till the element is not visible
							WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button-bar__options__option__btn ']")));
							getdriver.findElement(By.xpath("//a[@class='button-bar__options__option__btn ']")).click();
							if( k ==10) {
								flag=true;
								break;
							}
							
						}
						
						if(flag==true) {
							getdriver.findElement(By.xpath(".//*[@class='button-bar__options__option__btn  button-bar__options__option__btn--active ']")).click();

						}else {
							System.out.println("fals was false");
						}
						
						
						
						
						
						
						
						
					}else {
						System.out.println(Colorfamilies.get(i));
					}
				
			    }

				

			}
		}
		

	}

