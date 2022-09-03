package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {

	public static void main(String[] args) {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[contains(text(),  'Click me')]")).click();

		driver.switchTo().parentFrame();  //Parent Frame
		
		driver.switchTo().defaultContent(); // Main Frame

		driver.findElement(By.xpath("//a[@id='menuButton']")).click();

	}

}
