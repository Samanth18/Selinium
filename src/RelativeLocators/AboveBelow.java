package RelativeLocators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class AboveBelow {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Navigate to an application
		driver.get("https://www.facebook.com/");
		
		//Identify pswd element
		WebElement pswd = driver.findElement(By.id("pass"));
		
		//Identify un tf
		WebElement un = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
		un.sendKeys("Selenium");
		pswd.sendKeys("abc123");
		
		//Identify login button
		WebElement login = driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd));
		login.click();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();		
	}

}
