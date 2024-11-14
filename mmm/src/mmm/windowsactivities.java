package mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			driver.navigate().back();
			driver.navigate().forward();
			//driver.close();
	}

}
