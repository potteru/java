package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOut_DDF {

	public static void main(String[] args) {
		
		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABC123");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc456");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
