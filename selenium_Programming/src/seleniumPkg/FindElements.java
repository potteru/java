package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcdefghijklmn");
	
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcdef12345");
		
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
		
		driver.findElement(By.xpath("(//a[@data-tooltip-content='Telugu'])[1]"));
		
		
	}
	
}
