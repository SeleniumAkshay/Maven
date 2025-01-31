package New_WebSites;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("hello");
		Thread.sleep(2000);
		System.out.println(ele.getText());
		Thread.sleep(2000);

		driver.get("https://www.flipkart.com/");
		String access = driver.findElement(By.name("q")).getAccessibleName();
		System.out.println(access);
		Thread.sleep(2000);

		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		int count = links.size();

		int empty = 0;

		int textContains = 0;

		for (WebElement link : links) {
			String text = link.getText();
			if (text.isEmpty()) {
				empty++;
			} else {
				textContains++;
			}
			System.out.println(text);
		}

		System.out.println("Total Links : " + count);
		System.out.println("Total Empty Links : " + empty);
		System.out.println("Total Text Contains Links : " + textContains);

		Thread.sleep(3000);
		driver.quit();

	}

}
