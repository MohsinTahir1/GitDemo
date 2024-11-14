package mmm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import  java.lang.Iterable;
public class javaalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		  String text="Rahul";
		    driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys(text);
			driver.findElement(By.id("alertbtn")).click();
		    System.out.println(driver.switchTo().alert().getText());
			Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Rahul, share this practice page and share your knowledge");
			driver.switchTo().alert().accept();
			driver.findElement(By.id("confirmbtn")).click();
			driver.switchTo().alert().dismiss();
	}

}
