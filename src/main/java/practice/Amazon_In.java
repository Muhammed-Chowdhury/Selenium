package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_In {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver() ;
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
	
	//we are not able to use enter method
	driver.findElementByXPath("(//span[text()='42,999'])[1]");
	
	driver.findElementByXPath("(//img[@class='s-image'])[1]");
	

	
	
	
	
	
	
	
}



}
