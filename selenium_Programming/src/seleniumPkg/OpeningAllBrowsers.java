package seleniumPkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpeningAllBrowsers {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		System.setProperty("webdriver.edge.driver", "D:\\Downloaded Softwares\\edgedriver\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		
		Thread.sleep(3000);
		driver.close();
		
		Thread.sleep(3000);
		driver1.close();
	}

}
