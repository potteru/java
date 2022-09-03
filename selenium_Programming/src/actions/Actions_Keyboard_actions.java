package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Keyboard_actions {

	public static void main(String[] args) throws InterruptedException {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		// click on create new acc link
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);

		// step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		// step2:
		Actions act = new Actions(driver);

		// step3:
		act.click(month).perform();

		Thread.sleep(2000);

		// navigate to 1st option using home key
		act.sendKeys(Keys.HOME).perform();

		Thread.sleep(2000);

		// navigate to sep option
		for (int i = 1; i <= 8; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}

		Thread.sleep(2000);

		act.sendKeys(Keys.ENTER).perform();

	}

}
