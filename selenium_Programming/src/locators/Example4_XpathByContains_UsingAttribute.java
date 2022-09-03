package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_XpathByContains_UsingAttribute {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("zyxw");
		
		driver.findElement(By.xpath("//input[contains(@class,'text _55r1 _6luy _9npi')]")).sendKeys("987");
		
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth _4jy6 _4jy')]")).click();
		
		
	}

}
