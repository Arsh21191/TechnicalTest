package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	By Home = By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[1]/a");
	By News = By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[2]/a");
	By Sport = By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[3]/a");
	By Reel = By.xpath("//*[@id=\"orb-nav-links\"]/ul/li[4]/a");
	By More = By.xpath("//*[@id=\"orb-nav-more\"]/a");
	By Culture = By.xpath("//*[@id=\"orb-panel-more\"]/div/ul/li[8]/a");
	By Consent = By.xpath("/html/body/div[8]/div[2]/div[1]/div[2]/div[2]/button[1]/p");
	By Search = By.xpath("//*[@id=\"orb-search-q\"]");
	By searchButton = By.xpath("//*[@id=\"orb-search-button\"]");
	By moduletitle=By.xpath("//*[@id=\"page\"]/section[2]/h2");
	By cookie=By.xpath("//*[@id=\"bbccookies-continue-button\"]/span[2]");
	//By Header = By.xpath("//*[@id=\"orb-header\"]");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement VerifyHome()
	{
		return driver.findElement(Home);
	}
	
	public WebElement VerifyURL()
	{
		return driver.findElement(News);
	}
	
	public WebElement VerifySport()
	{
		return driver.findElement(Sport);
	}
	
	public WebElement VerifyReel()
	{
		return driver.findElement(Reel);
	}
	
	public WebElement VerifyMore()
	{
		return driver.findElement(More);
	}
	
	public WebElement VerifyCulture()
	{
		return driver.findElement(Culture);
	}
	
	
	public WebElement consent()
	{
		return driver.findElement(Consent);
	}
	
     public WebElement search()
    {
	return driver.findElement(Search);
    }
     
     public WebElement searchButton()
     {
    	 return driver.findElement(searchButton);
     }
     
     public WebElement getTitle()
     {
    	 return driver.findElement(moduletitle);
     }
     
     public WebElement cookiealert()
     {
    	 return driver.findElement(cookie);
     }
}
