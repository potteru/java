package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_XpathByAttribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// Enter userName
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd123456abc");
		
		//Enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		
		//click on login
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
	}

}
