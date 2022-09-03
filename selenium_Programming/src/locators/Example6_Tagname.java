package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_Tagname {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/tagname.html");
		
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		driver.findElement(By.xpath("input")).sendKeys("xyz");
		
		//findElement() points to the first matching element
	}

}
