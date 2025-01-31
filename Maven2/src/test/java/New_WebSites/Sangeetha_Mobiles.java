package New_WebSites;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Sangeetha_Mobiles {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.sangeethamobiles.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Realme']"));
		Actions act=new Actions(driver);
		act.scrollToElement(ele).perform();
		ele.click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//h2[contains(text(),'Realme')])[1]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[contains(text(),'Realme')]")).click();
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		act.scrollToElement(ele1).perform();
		ele1.click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/sangeetha.png");
		FileHandler.copy(temp, dest);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
