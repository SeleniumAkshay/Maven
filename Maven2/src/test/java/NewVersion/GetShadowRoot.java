package NewVersion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(3000);
		SearchContext element = driver.findElement(By.xpath("(//div[@class='my-3'])[2]")).getShadowRoot();
		
		element.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");
		
		Thread.sleep(3000);
		driver.quit();

	}

}
