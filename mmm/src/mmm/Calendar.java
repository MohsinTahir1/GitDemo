package mmm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import  java.lang.Iterable;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		
		    driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			driver.findElement(By.className("css-76zvg2.css-bfa6kz.r-homxoj.r-ubezar")).click();
	}

}
