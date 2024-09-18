package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_select_multi {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/MultipleSelect.html");
		
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select sel=new Select(ele);
		sel.selectByValue("audi");
		Thread.sleep(1000);
		sel.selectByIndex(1);
		
		boolean value = sel.isMultiple();
		System.out.println(value);
		
		System.out.println();
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getText());
		
		System.out.println();
		List<WebElement> all = sel.getAllSelectedOptions();
		for (WebElement ele1 : all) {
			System.out.println(ele1.getText());
		}

		System.out.println();
		List<WebElement> options = sel.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		System.out.println("Wrap");
		WebElement wrap = sel.getWrappedElement();
		System.out.println(wrap);
		System.out.println(wrap.getText());
		
		Thread.sleep(1000);
		sel.deselectAll();
//		sel.deselectByVisibleText("Saab");
//		Thread.sleep(1000);
//		sel.deselectByIndex(3);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
