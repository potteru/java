package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_XpathByIndex {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("wqer");;
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("zxc");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("abc@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("rt567ui");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("16");
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("april");
		
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1990");
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();;
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
	//	driver.findElement(By.xpath("(//label[@class='_58mt'])[3]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

}
