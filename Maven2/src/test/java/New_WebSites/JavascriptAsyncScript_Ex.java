package New_WebSites;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAsyncScript_Ex {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
//		js.executeScript("alert('akshay');");
		
		js.executeAsyncScript("window.setTimeout(function(){alert('Qspiders');},8000);alert('akshay');");
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
