package New_WebSites;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Qspiders_Fee {

	@Test
	public void fee() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://collector.qspiders.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("cgvhbj@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ghjvjhbjnj");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
		FileInputStream fis=new FileInputStream("");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("").getRow(0).getCell(0).toString();
		
//		driver.findElement(By.xpath("//span[text()='Search & Pay']")).click();
		int a=0;
		while (a<0) {
			
			driver.findElement(By.xpath("(//*[name()='path'][@fill='currentColor'])[6]")).click();
			driver.findElement(By.xpath("//input[@name='number']")).sendKeys(Keys.ENTER);
			
			try {
				String text = driver.findElement(By.xpath("//span[@class='p-3 flex justify-center']")).getText();
				if (text.contains("This student has not Registered")) {
					
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
