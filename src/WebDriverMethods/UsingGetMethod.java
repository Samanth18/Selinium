package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to an application
		driver.get("https://www.zomato.com/");
	}

}


