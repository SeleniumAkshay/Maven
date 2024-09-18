package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shadow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow/nested?sublist=2");
		
		Thread.sleep(2000);
		SearchContext shadow = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		WebElement shadow1 = shadow.findElement(By.cssSelector("section[class='shadowInner']"));

		WebElement ele = shadow.findElement(By.cssSelector("input[id='email']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).sendKeys("Hello").perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
