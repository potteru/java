package webdriver_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {

	public static void main(String[] args) throws InterruptedException {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath(("(//a[@role='button'])[3]"))).click();
		Thread.sleep(3000);
		
		String mainWindow = driver.getWindowHandle();

		Set<String> allHandle = driver.getWindowHandles();

		ArrayList<String> al = new ArrayList<String>(allHandle); // [mainPageID(0) childWindowID(1)]

		// switch to child window
	//	driver.switchTo().window(al.get(1));

		Thread.sleep(3000);
		// click on training link from childWindow

		driver.findElement(By.xpath("//a[@class='_42ft _42fu layerCancel _sv7 uiOverlayButton selected _42g- _42gy'])")).click();
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		Select dropdown = new Select(day);

		// dropdown.selectByVisibleText("26");

		// dropdown.selectByValue("26");

		dropdown.selectByIndex(5);

		System.out.println(dropdown.isMultiple());
		
		List<WebElement> date = dropdown.getOptions();
		
		//Multi select
		
		//All delect method
		
		List<WebElement> allselected = dropdown.getAllSelectedOptions();
		
		WebElement first = dropdown.getFirstSelectedOption();

		
	}

}
