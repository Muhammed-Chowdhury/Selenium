package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators_BasicCode {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
	
		//launce the browser
		driver.get("http://www.leaftaps.com/opentaps/control/main");
				
	
		
		//maximize
	    driver.manage().window().maximize();
		
	
	
		
	    //enter username -(element level)

		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//enter password -(element level)
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click login button-(element level)
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		
		
		
		
		

	}

}
