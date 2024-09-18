package New_WebSites;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class trivago {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.trivago.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='query']")).sendKeys("pune");
		driver.findElement(By.xpath("//mark[text()='Pune']")).click();
		driver.findElement(By.xpath("(//div[@class='text-center'])[1]/div[2]/button/time[text()='5']")).click();
		driver.findElement(By.xpath("(//div[@class='text-center'])[1]/div[2]/button/time[text()='15']")).click();
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='View Deal']")).click();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			driver.switchTo().window(id);
		}
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//span[text()='View prices']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//button[text()='Select']")).click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/trivago.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
