package framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFramework {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\Test Data\\DDF.xlsx");
	
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
