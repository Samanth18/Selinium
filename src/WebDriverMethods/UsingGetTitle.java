package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetTitle {

	public static void main(String[] args) {
		
        //Launch the browser 
		WebDriver driver=new ChromeDriver();
		
       //Navigate to application
		driver.get("https://www.zomato.com/");
		
		//Fetch the title of the webpage
		String title = driver.getTitle();
		
		System.out.println("Title of the webpage : "+title);
	}

}
