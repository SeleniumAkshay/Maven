package New_WebSites;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ZEE5 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.zee5.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("searchInput")).sendKeys("telugu movies" + Keys.ENTER);
		
		SearchContext shadow = driver.findElement(By.xpath("//ct-web-popup-imageonly")).getShadowRoot();
		shadow.findElement(By.cssSelector("div#close")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'slick-current')]")).click();

		driver.findElement(By.xpath("//button[@title='Quality selector']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='SD - 480p']")).click();
		Thread.sleep(2000);

		WebElement details = driver.findElement(By.xpath("//h2[contains(text(),'Details About')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", details);

		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//table[@class='css-1dj0w3j']")).getText();

		System.out.println(text);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Movies By Language']")).click();

		driver.findElement(By.partialLinkText("Telugu Movies")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Yes, I would']")).click();

		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshot/zee5.png");

		FileHandler.copy(src, dest);

		Thread.sleep(3000);
		driver.quit();

	}

}
