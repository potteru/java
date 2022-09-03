package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_XpathBytext2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click on Create New Link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	}

}
