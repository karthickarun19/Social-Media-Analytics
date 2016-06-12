package com.unmetric.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class followingPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	 @FindBy(xpath="html/body/div[2]/div[4]/div/div[2]/div[1]/div[1]/a/div/h3")
	 private WebElement topic;
	 
	      public followingPage(WebDriver driver) throws MalformedURLException {
	    	  
	 	    
	 	     this.driver = driver;
		   
		     int waitTimeoutInSeconds = 15;
		     wait = new WebDriverWait(driver, waitTimeoutInSeconds, 100);
		 
		    }
	      
		   public void clickTopic(){
			   topic.click();
		   }
}
