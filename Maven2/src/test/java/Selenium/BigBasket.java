package Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("mango"+Keys.ENTER);
	
		driver.findElement(By.xpath("//h3[contains(text(),'Mango')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for (String string : ids) {
			Thread.sleep(2000);
			driver.switchTo().window(string);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'grid grid-flow-col')])[6]/div")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
