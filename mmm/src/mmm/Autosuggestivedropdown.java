package mmm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import  java.lang.Iterable;
public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException{
		
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		
		    driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("autosuggest")).sendKeys("ind");
			Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.className("ui-menu-item"));
			//for (WebElement option: options)
			//{
			//	if (option.getText().equalsIgnoreCase("India"))
						{
				//	option.click();
					//break;
						}
						
			}
	}


