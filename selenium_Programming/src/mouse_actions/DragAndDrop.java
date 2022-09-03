package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, des).perform();
		
		
		
		
		
	}

}
