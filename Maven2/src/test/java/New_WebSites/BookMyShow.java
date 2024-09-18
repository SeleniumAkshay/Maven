package New_WebSites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.tagName("strong")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Kalki')]")).click();
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='3D']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
