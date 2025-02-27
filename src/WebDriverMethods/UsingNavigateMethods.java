package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigateMethods {

	public static void main(String[] args) throws InterruptedException   {

	  //Launch the browser
	  WebDriver driver= new ChromeDriver();
	  
	  //maximize the browser window
	  driver.manage().window().maximize();
	  
	  //Navigate to an application
	  driver.get("https://www.facebook.com/");
	  
	  //Identify element and click on it
	  driver.findElement(By.linkText("Forgotten password?")).click();
	  
	  //Navigate to previous web page
	  driver.navigate().back();
	  Thread.sleep(3000);
	  
	  //Navigate to next webpage
	  driver.navigate().forward();  
	  Thread.sleep(3000);
	  
	  //Refresh web page
	  driver.navigate().refresh();
	  
	  //Navigate to another application
	  driver.navigate().to("https://www.instagram.com/");
	  Thread.sleep(3000);
	  
	  //close the browser 
	  driver.quit();
	  
	}

}
