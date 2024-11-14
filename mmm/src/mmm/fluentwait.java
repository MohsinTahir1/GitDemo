package mmm;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import  java.lang.Iterable;
import java.time.Duration;
public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	    driver.findElement(By.cssSelector("[id='start'] button")).click();
	    Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
	    		.ignoring(NoSuchElementException.class);
	    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	        	if(driver.findElement(By.id("finish")).isDisplayed()) {
	        		return driver.findElement(By.id("finish"));
	        	}
	        	else
	        		return null;
	        }
	        });
	    
	      System.out.println(driver.findElement(By.id("finish")).getText());
	    
	}
}

