package java_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SearchGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
				
				// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver();
				
		        //Launch the Online Store Website
				driver.get("http://www.store.demoqa.com");
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
				//Wait for 5 Sec
			
				
		        // Close the driver
		        driver.quit();
		    }
}
