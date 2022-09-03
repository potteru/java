package window_handlers;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handlers {

	public static void main(String[] args) throws InterruptedException {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");

		// click on New Tab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		String mainWindow = driver.getWindowHandle();

		Set<String> allHandle = driver.getWindowHandles();

		ArrayList<String> al = new ArrayList<String>(allHandle); // [mainPageID(0) childWindowID(1)]

		// switch to child window
		driver.switchTo().window(al.get(1));

		// click on training link from childWindow
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

		Thread.sleep(4000);

		// switch to main page
		driver.switchTo().window(mainWindow);

		Thread.sleep(2000);

		// click on newWindow from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

	}

}
