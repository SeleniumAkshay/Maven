package New_WebSites;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInWithJunit3 {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}

	@Test
	public void loginTest1() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://stock.scriptinglogic.in/");

		WebElement usrnm = driver.findElement(By.id("login-username"));
		usrnm.sendKeys("admin");

		WebElement pswd = driver.findElement(By.id("login-password"));
		pswd.sendKeys("admin");

		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();

		try {
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Log out")).click();
		} catch (NoSuchElementException e) {
		}

	}

	@Test
	public void loginTest2() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://stock.scriptinglogic.in/");

		WebElement usrnm = driver.findElement(By.id("login-username"));
		usrnm.sendKeys("ain");

		WebElement pswd = driver.findElement(By.id("login-password"));
		pswd.sendKeys("amin56");

		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();

		try {
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Log out")).click();
		} catch (NoSuchElementException e) {
		}

	}

	@Test
	public void loginTest3() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://stock.scriptinglogic.in/");

		WebElement usrnm = driver.findElement(By.id("login-username"));
		usrnm.sendKeys("admin");

		WebElement pswd = driver.findElement(By.id("login-password"));
		pswd.sendKeys("admin");

		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();

		try {
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Log out")).click();
		} catch (NoSuchElementException e) {
		}

	}

	@Test
	public void loginTest4() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://stock.scriptinglogic.in/");

		WebElement usrnm = driver.findElement(By.id("login-username"));
		usrnm.sendKeys("");

		WebElement pswd = driver.findElement(By.id("login-password"));
		pswd.sendKeys("");

		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();

		try {
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Log out")).click();
		} catch (NoSuchElementException e) {
		}

	}

	@Test
	public void loginTest5() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://stock.scriptinglogic.in/");

		WebElement usrnm = driver.findElement(By.id("login-username"));
		usrnm.sendKeys("admin");

		WebElement pswd = driver.findElement(By.id("login-password"));
		pswd.sendKeys("");

		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();

		try {
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Log out")).click();
		} catch (NoSuchElementException e) {
		}

	}

	@Test
	public void loginTest6() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("https://stock.scriptinglogic.in/");

		WebElement usrnm = driver.findElement(By.id("login-username"));
		usrnm.sendKeys("");

		WebElement pswd = driver.findElement(By.id("login-password"));
		pswd.sendKeys("admin");

		WebElement btn = driver.findElement(By.name("submit"));
		btn.click();

		try {
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Log out")).click();
		} catch (NoSuchElementException e) {
		}

	}

}
