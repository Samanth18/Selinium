package WebDriverMethods;

import java.io.Closeable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetPageSource {

	public static void main(String[] args) {

		//Launch the browser 
		WebDriver driver = new ChromeDriver();
		
		//navigate to application
		driver.get("https://www.instagram.com/");
		
		//Fetch the page source code
		System.out.println(driver.getPageSource());
		
		
	}

}
