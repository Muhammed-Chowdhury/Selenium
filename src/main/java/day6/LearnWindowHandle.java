package day6;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
	
public static Set<String> windowHandles;

public static void main(String[] args) {
	
	
	//open/navigate browser
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	ChromeDriver driver = new ChromeDriver();
	
	//launch URL/Application
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	//maximize window
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementByXPath("(//span[text()='AGENT LOGIN'])[1]").click();
	

	//getWindowHandle(); returns unique address of current active window and Data type is string
	// String currentWindow =driver.getWindowHandle();
	// System.out.println(currentWindow);
	
	
	
	driver.findElementByLinkText("Contact Us").click();
	
	
	
	
	//Collection(Set) of String
	 Set<String> allWin = driver.getWindowHandles();
	 
	//for each window one by one iterartor we use foreach iterator
	//String eachWin -for each window reference
    // allWin- contains all windowreference because of getWindowHandles() method.
	 for (String eachWin : allWin) {
		 System.out.println(eachWin);
		 driver.switchTo().window(eachWin);// Switch window
		 System.out.println(driver.getTitle());
		 
		 
	 }
	 
	 
}

}
	 
	 
	 
	
	
	
	
	
	



