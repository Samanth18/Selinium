package WebDriverMethods;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximaizeTheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Launch the browser
		WebDriver driver = new ChromeDriver();
	
		//Maximize the window
        driver.manage().window().maximize();
        
		//Navigate to an application
        driver.get("https://www.facebook.com/");
        
        org.openqa.selenium.Dimension dim = driver.manage().window().getSize();
        System.out.println("width,height : "+dim);
        
        int width = dim.getWidth();
        System.out.println("Width of the webpage : "+width);
        
        System.out.println("Heigh of the webpage : "+dim.getHeight());
         
        
        //Full screen
        driver.manage().window().fullscreen();
        
        //Minimize the window
       // driver.manage().window().minimize();
           

	}

}
