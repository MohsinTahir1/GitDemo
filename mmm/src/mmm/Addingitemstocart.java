package mmm;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import  java.lang.Iterable;
public class Addingitemstocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		  String text="Rahul";
		    driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    String[] a= {"Cucumber","Beetroot"};
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> product=driver.findElements(By.className("product-name"));
			for (int i=0;i<product.size();i++)
			{
				String[] ab=product.get(i).getText().split("-");
				String formatting=ab[0].trim();
				List aList=Arrays.asList(a);
				if(aList.contains(formatting))
				{
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				}
			}
			driver.findElement(By.className("cart-icon")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
			driver.findElement(By.className("promoInfo")).getText();
			Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
	}

}
