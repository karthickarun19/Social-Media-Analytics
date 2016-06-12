package com.unmetric.highcharts;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HighCharts {

    private WebDriver driver;
    private WebDriverWait wait;
   
    @FindBy(css="g.highcharts-tooltip  text  tspan:nth-child(3)")
    private WebElement toolTip;
 
        public HighCharts(WebDriver driver) throws IOException {
        	
        this.driver = driver;
        int waitTimeoutInSeconds = 15;
        wait = new WebDriverWait(driver, waitTimeoutInSeconds, 100);
    
    }
        
         public String getToolTip(){
             String y=toolTip.getText();
        	 
        	return y;
    	
    }




















}
