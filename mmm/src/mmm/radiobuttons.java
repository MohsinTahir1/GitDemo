package mmm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import  java.lang.Iterable;
public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		
		    driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
			Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
			System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			Assert.assertEquals(driver.findElement(By.className("book-a-flight hide-desktop")).getText(),"Book Flight");
			
			
	}

}
