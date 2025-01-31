package New_WebSites;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
//		driver.manage().deleteCookieNamed("datr");
//		
//		driver.manage().deleteAllCookies();
		
		Cookie coo=new Cookie("Qspiders","Hadapsar");
		
		driver.manage().addCookie(coo);
		
		coo=new Cookie("datr","BGAgZ0TqtyI4S0t6FL3PBUf5");
		
		driver.manage().deleteCookie(coo);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for (Cookie cookie : cookies) {
			System.out.println("Cookie Name : "+cookie.getName());
			System.out.println("Cookie Value : "+cookie.getValue());
			System.out.println("Cookie Expiry : "+cookie.getExpiry());
			System.out.println("Cookie Path : "+cookie.getPath());
			System.out.println("Cookie Domain : "+cookie.getDomain());
			System.out.println("Cookie SameSite : "+cookie.getSameSite());
			System.out.println("-----------------------------------------");
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
