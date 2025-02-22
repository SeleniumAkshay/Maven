package New_WebSites;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Abhi_Bus {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.abhibus.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='icon col auto']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='icon col auto']")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Select Seats'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='E6']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Continue']")).click();
		driver.findElement(By.xpath("//h4[text()='Login to AbhiBus']/following-sibling::span")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Qspiders");
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("30");
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9865329865");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("qsp@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/abhiBus.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
