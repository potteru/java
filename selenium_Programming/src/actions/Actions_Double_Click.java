package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Double_Click {

	public static void main(String[] args) {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement topOffer = driver.findElement(By.xpath("//img[@alt='Top Offers']"));

		Actions act = new Actions(driver);

		act.doubleClick(topOffer).perform();

	}

}
