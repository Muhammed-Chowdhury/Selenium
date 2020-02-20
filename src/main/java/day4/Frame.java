package day4;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable");
		
	
	//driver.switchTo(),frame("test");  //id or name locator value	
		
		
	//	driver.switchTo().frame(0); // using index (if frame or iframe tag contain only one then use index (0)
		
	  //  driver.switchTo().frame([@id='selectable']/);
		
	 driver.switchTo().frame(driver.findElementByClassName("demo-frame")); //webelement
	 
	 driver.findElementByXPath("//ol[@id='selectable']/li").click();
	 
	// String text = driver.switchTo().alert().getText(); not related to this code
	// System.out.println(text);                          not related to this code


	}	

}
