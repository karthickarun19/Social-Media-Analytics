package chart;
import java.util.concurrent.TimeUnit;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.unmetric.highcharts.HighCharts;
import com.unmetric.pages.followingPage;
import com.unmetric.pages.homePage;
import com.unmetric.pages.loginPage;


public class UnMetrics {
	
	   private WebDriver driver;
	    Properties prop=null;
	    EncodeDecode ed;
	   
	    //Inorder to open the application
	    @BeforeClass
	     public void setUp() throws Exception {
	
	       driver = new FirefoxDriver();
	       String baseUrl = "https://discover.unmetric.com/app/";
	       driver.get(baseUrl);
	    	 
	       driver.get(baseUrl);
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }
	    
	    @AfterClass
	    public void tearDown() {
	        driver.close();
	    }
	    //Below code extract the value from the tool tip of given high chart
        @Test
        public void openPage() throws Exception{
	
	     try{
	    	
	    	 
	     loginPage page= PageFactory.initElements(driver, loginPage.class); 

	     homePage hp=page.doLogIn(ed.decodeUsername("c2FydW5fa2FydGhpY2tAeWFob28uY28uaW4="), ed.decodePassword("V2VsY29tZTEyMw=="));
	     followingPage fp=hp.clickFollowing();
	     fp.clickTopic();
	      WebElement element = driver.findElement(By.cssSelector("#highcharts-0.highcharts-container > svg > g.highcharts-tracker > g > rect:nth-child(1)"));
		  Actions builder = new Actions(driver);
		  builder.moveToElement(element).build().perform();
		   HighCharts hc=PageFactory.initElements(driver, HighCharts.class);
		    String y=hc.getToolTip();
		    System.out.println(y);

		        
	       }catch(Exception e){
             e.printStackTrace();
       }
	 

    }
}
