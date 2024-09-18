package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zomato {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Pune']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[contains(@class,'fZONMG')])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Pk");
		driver.findElement(By.xpath("(//p[contains(@class,'hoXOUV')])[1]")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/zomato.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
