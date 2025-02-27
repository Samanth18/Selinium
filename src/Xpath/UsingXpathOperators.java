package Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathOperators {

	public static void main(String[] args) {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//Navigate to an application
		driver.get("https://www.flipkart.com/");
		
		
		
		
	}
	
}
