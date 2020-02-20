package practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme_login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/account/login");
		
		
		
		driver.manage().window().maximize();
		
		driver.findElementById("email").sendKeys("Kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
	// Mouse Over on venders element
		WebElement vendor = driver.findElementByXPath("(//button[@type='button'])[6]");
		Actions builder  = new Actions (driver);
		builder.moveToElement(vendor).perform();
		
		
		
	

	}

}
