package BBCMaven;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Calendar;
import java.util.Date;

import PageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	
	
/*	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver.manage().deleteAllCookies();
		
	}*/
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	
	
	@Test
	
	public void MenuItems() throws IOException, InterruptedException
	{
		
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
		driver.manage().window().maximize();
		LandingPage l = new LandingPage(driver);
		l.consent().click();
		l.cookiealert().click();
		WebElement header = driver.findElement(By.id("orb-nav-links"));
	    System.out.println(header.findElements(By.tagName("a")).size());
	    for(int i=1;i<header.findElements(By.tagName("a")).size();i++)
	    {
	    	String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	header.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
	    	Thread.sleep(5000L);
	    }
	    	Set<String> abc = driver.getWindowHandles();
	    	Iterator<String> it=abc.iterator();
	    	
	    	while(it.hasNext())
	    	{
	    		driver.switchTo().window(it.next());
	    		System.out.println(driver.getTitle());
	    		log.info("successfully opened navigation bar links in different tabs and get their titles");
	    	}
	    }
		
	
	
	@Test
	
	public void basePageNavigation() throws IOException
	
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.consent().click();
		l.cookiealert().click();
		l.VerifyURL().click();
		
		if(driver.getCurrentUrl().endsWith("news")) {
			System.out.println("This script passed");
			log.info("Verified the news url successfully!");
		}
		
		else {
			System.out.println("This script failed");
		}
	}
	
	
	@Test
	
	
	public void search() throws IOException
	{
	
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));	
		LandingPage l = new LandingPage(driver);
		l.consent().click();
		l.cookiealert().click();
		l.search().sendKeys("Houghton Mifflin Harcourt");
		l.searchButton().click();
		WebElement data =driver.findElement(By.tagName("body"));
	    System.out.println("Text content: "+ data.getText());
	    
	}
		
		
		
		
		
	
@Test
	
	public void getDayDate() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
        Calendar cal = Calendar.getInstance(); 
		System.out.println("Month : " + cal.get(Calendar.MONTH));
		log.info("get the current month");
		System.out.println("Day of Month : " + cal.get(Calendar.DAY_OF_MONTH));
		log.info("get the current day of the month");
	}
		

	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
}







