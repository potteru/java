package seleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		String path = "D:\\Downloaded Softwares\\New folder\\chromedriver.exe";
		// Step1- set the path of browser (Key & value) --> ("Name of the browser", "path")

		System.setProperty("webdriver.chrome.driver", path);

		// Step2 -We need to create the object of chrome driver

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
	}
		
}
