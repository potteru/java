package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome_Browser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//refresh or reload the page
		driver.navigate().refresh();
		
		//minimize the window
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//close the current browser
		driver.close();
		
		//close all opened browser
		driver.quit();
		
	}
}
