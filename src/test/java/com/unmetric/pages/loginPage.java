package com.unmetric.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//login page to enter the credential
public class loginPage {
	 private WebDriver driver;
	 private WebDriverWait wait;
	
	 @FindBy(xpath="html/body/div[2]/div/div/div/div[1]/div[3]/input")
	 private WebElement username;
	 @FindBy(xpath="html/body/div[2]/div/div/div/div[1]/div[4]/input")
	 private WebElement password;
	 @FindBy(xpath="html/body/div[2]/div/div/div/div[2]/div[1]/button")
	 private WebElement signUp;
	 
     public loginPage(WebDriver driver) throws IOException {
    	 
     this.driver = driver;
     int waitTimeoutInSeconds = 15;
     wait = new WebDriverWait(driver, waitTimeoutInSeconds, 100);
 
    }
     public homePage doLogIn(String myUsername, String myPassword ){
    	 
    	 username.sendKeys(myUsername);
    	 password.sendKeys(myPassword);
    	 signUp.click();
    	 return PageFactory.initElements(driver, homePage.class);
     }
}
