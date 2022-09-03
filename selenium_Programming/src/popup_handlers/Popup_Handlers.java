package popup_handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handlers {

	public static void main(String[] args) {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().sendKeys("Accepting alert");

		driver.switchTo().alert().accept();

		driver.switchTo().alert().dismiss();

	}

}
