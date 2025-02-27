package WebDriverMethods; 

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UsingManageMethods {

	public static void main(String[] args) {
		 //Launchig the browser 
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//naviagte to an application
	    driver.get("https://www.facebook.com/");
	    
	    //Fetch the size
	    System.out.println("Max size of the window : "+driver.manage().window().getSize());
	    
	    //set the size of the window
	    Dimension dim = new Dimension(800, 300);
	    driver.manage().window().setSize(dim);
	   
	    
	    
	    
	    //Fetch the size
	    System.out.println("size of window after set size : "+ driver.manage().window().getSize());
	    
	    //Fetch the position 
	    System.out.println("Before setting position : "+driver.manage().window().getPosition());
	    
	    //Set position of the window
	    Point p = new Point(400 , 500);
	    driver.manage().window().setPosition(p);
	   
	    
	    //Fetch the position
	    System.out.println("After setting position : "+ driver.manage().window().getPosition());
	    
	    //Close the browser 
	    driver.quit();
		        
	}

}
