package com.unmetric.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
	 private WebDriver driver;
	 private WebDriverWait wait;
	 @FindBy(xpath="html/body/div[2]/div[2]/div/ul/li[2]/a/i[1]")
	 private WebElement following;
	
	     public homePage(WebDriver driver) {
	    	   
		  this.driver = driver;
	     int waitTimeoutInSeconds = 15;
	      wait = new WebDriverWait(driver, waitTimeoutInSeconds, 100);
	 
	    }
	   public followingPage clickFollowing(){
		   following.click();
		   return PageFactory.initElements(driver, followingPage.class);
	   }
	 
}
