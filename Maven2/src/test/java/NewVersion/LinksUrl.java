package NewVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksUrl {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("qsp@gmail.com");
		String aria = driver.findElement(By.id("email")).getAriaRole();
		System.out.println(aria);

		String access = driver.findElement(By.id("email")).getAccessibleName();
		System.out.println(access);

		String domAtt = driver.findElement(By.id("email")).getDomAttribute("value");
		System.out.println(domAtt);
		
		String att = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(att);
		
		String domPro = driver.findElement(By.id("email")).getDomProperty("value");
		System.out.println(domPro);
		
		System.out.println();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		String aria1 = driver.findElement(By.id("small-searchterms")).getAriaRole();
		System.out.println(aria1);

		String access1 = driver.findElement(By.id("small-searchterms")).getAccessibleName();
		System.out.println(access1);

		String domAtt1 = driver.findElement(By.id("small-searchterms")).getDomAttribute("value");
		System.out.println(domAtt1);
		
		String att1 = driver.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(att1);
		
		String domPro1 = driver.findElement(By.id("small-searchterms")).getDomProperty("value");
		System.out.println(domPro1);
		
		
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		int eLinks = 0;
//		int tLinks = 0;
//
//		for (int i = 0; i < links.size(); i++) {
//
////			String text = links.get(i).getText();
////			System.out.println(text);
//			
//			String url = links.get(i).getAttribute("href");
//			String url1 = links.get(i).getDomAttribute("href");
//			String url2 = links.get(i).getDomProperty("href");
//			System.out.println(url);
//			System.out.println(url1);
//			System.out.println(url2);
//
//			if (url.isEmpty()) {
//				eLinks++;
//			} else {
//				tLinks++;
//			}
//		}
//
//		System.out.println(links.size());
//		System.out.println(eLinks);
//		System.out.println(tLinks);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
