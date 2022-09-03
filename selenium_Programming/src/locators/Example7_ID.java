package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_ID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/id.html");
		driver.manage().window().maximize();
		
		//enter FN
		driver.findElement(By.id("1234")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.id("1234")).sendKeys("xyz");

	}

}
