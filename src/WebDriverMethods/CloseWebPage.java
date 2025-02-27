package WebDriverMethods;

import java.net.http.WebSocket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWebPage {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver= new ChromeDriver();
	
		
		//Navigate to application
		driver.get("https://www.instagram.com/");
		
		//Fetch the page source code
		System.out.println(driver.getPageSource());
		
		//driver.close();
		
		driver.quit();
		
		
	}

}
