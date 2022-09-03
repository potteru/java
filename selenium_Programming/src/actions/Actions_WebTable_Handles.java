package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_WebTable_Handles {

	public static void main(String[] args) throws InterruptedException {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/admin/Desktop/table.html");
		Thread.sleep(2000);
		// Number of Rows in the table
		int row = driver.findElements(By.xpath("//table[@id='123 ']//tr")).size();

		System.out.println("Total Row in Table are= " + row);

		// Number of Cols in the table

		int cols = driver.findElements(By.xpath("//table[@id='123 ']//tr[1]/th")).size();

		System.out.println("Total Col in Table are= " + cols);

		String sub = driver.findElement(By.xpath("//table[@id='123 ']//tr[2]/td[1]")).getText();
		System.out.println("Subject Name is =" + sub);

	}

}
