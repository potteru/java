package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		String path = "D:\\Downloaded Softwares\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
	//	driver.navigate().to("https://www.flipkart.com/");
	//	Thread.sleep(2000);
	//	driver.navigate().back();
	//	Thread.sleep(2000);
	//	driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//driver.close();
		
		//driver.quit();
		
		//Actions on WebElenemt
		
	
		//  WebElement un = driver.findElement(By.xpath("//input[@type='text']"));
		//  un.sendKeys("ABC"); Thread.sleep(2000); un.clear(); Thread.sleep(2000);
		//  un.sendKeys("XYZ");
		  
		//  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABC");
	//	  driver.findElement(By.xpath("//input[@type='text']")).clear();
	//	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("XYz");
		  
	//	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	//	  Thread.sleep(2000);
	//	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	  Thread.sleep(3000);
		  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		  Thread.sleep(3000);
		  System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected()); //false
		 
		  driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		  
		  boolean enable= driver.findElement(By.xpath("(//button[@type='submit'])[2]")).isEnabled();
		 
		  System.out.println("Button is enabled =="+ enable); //true
		  
		  boolean display=
		  driver.findElement(By.xpath("(//button[@type='submit'])[2]")).isDisplayed();
		  
		 
		  if(display==true) {
		  driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		  
		  }
		  
		//  Thread.sleep(1000); driver.close();
		 
	}

}
