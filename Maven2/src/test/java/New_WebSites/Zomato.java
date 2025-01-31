package New_WebSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='searchContainer']/div/div[1]/input")).sendKeys("pune"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[contains(@placeholder,'dish')]"));
		ele.sendKeys("PK Biryani House");
		Thread.sleep(2000);
		ele.sendKeys(""+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Order Online")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("biryani");
		driver.findElement(By.xpath("//img[@alt='Biryani Rice Plain']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
