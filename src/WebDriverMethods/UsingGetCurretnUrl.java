package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetCurretnUrl {

	public static void main(String[] args) {

		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Navugate to an application
		driver.get("https://www.zomato.com/");
		
		//Fetch the url of the webpage
		String url =driver.getCurrentUrl();
		
		System.out.println("url of the webpage : "+url);
	}

}
