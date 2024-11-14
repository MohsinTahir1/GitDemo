package mmm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class seleniumintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // invoking browser
    // Chrome - ChromeDriver ->Methods
	// steps to invoke chrome 	
	// Selenium Manager	
		
		//WebDriver driver=new ChromeDriver();
		
	// firefox lunach	
		//WebDriver driver=new FirefoxDriver();
		
	// edge lunach	
			WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
	}

}
