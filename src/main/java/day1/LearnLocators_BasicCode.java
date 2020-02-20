package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators_BasicCode {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		
		// launch the browser
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		// maximize the window
		driver.manage().window().maximize();
		
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
	//	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
	//	driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.close();
		
		
		
		
		
		
		
	}

}
