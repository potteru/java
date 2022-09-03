package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		// Screenshot

		// Q. How to take screenshot in selenium --> By using getScreenshotAs()

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		System.out.println(src);

	//	File dest = new File("C:\\Users\\admin\\AppData\\Local\\Temp\\xyz2.png");
		
		File dest = new File("C:\\Users\\admin\\AppData\\xyz2.png");
		FileHandler.copy(src, dest);

	}

}
