package Selenium;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Duplicate {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		
		Thread.sleep(2000);
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		int xiaomi = 0;
		int onePlus = 0;
		int motorola = 0;
		
		HashSet<String> xiaomiSet=new HashSet<String>();
		HashSet<String> onePlusSet=new HashSet<String>();
		HashSet<String> motorolaSet=new HashSet<String>();
		
		for (WebElement ele : eles) {
			String text = ele.getText();
			System.out.println(text);
			if (text.contains("Xiaomi")) {
				xiaomiSet.add(text);
				xiaomi++;
			}
			else if (text.contains("OnePlus")) {
				onePlusSet.add(text);
				onePlus++;
			}
			else if (text.contains("Motorola")) {
				motorolaSet.add(text);
				motorola++;
			}
		}
		
		System.out.println(xiaomi);
		System.out.println(onePlus);
		System.out.println(motorola);
		
		System.out.println();
		
		for (String xia : xiaomiSet) {
			System.out.println(xia);
		}
		
		for (String one : onePlusSet) {
			System.out.println(one);
		}
		
		for (String moto : motorolaSet) {
			System.out.println(moto);
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
