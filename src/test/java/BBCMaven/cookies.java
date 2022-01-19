package BBCMaven;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;	
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anura\\eclipse-workspace\\BBCMaven\\src\\main\\java\\resources\\chromedriver.exe");					
		driver=new ChromeDriver();        
		driver.get("https://www.bbc.com/");
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("Count of all cookies =" +allCookies.size());
		
		//System.out.println(driver.manage().getCookies());   // Return The List of all Cookies
		/*driver.manage().getCookieNamed();  //Return specific cookie according to name
		driver.manage().addCookie();   //Create and add the cookie
		driver.manage().deleteCookie();  // Delete specific cookie
		driver.manage().deleteCookieNamed(); // Delete specific cookie according Name
		driver.manage().deleteAllCookies(); */
	}

}
