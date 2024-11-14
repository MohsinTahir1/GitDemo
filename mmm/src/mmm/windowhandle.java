package mmm;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	    driver.findElement(By.className("blinkingText")).click();
	   Set<String> windows=driver.getWindowHandles();
	   Iterator<String> it=windows.iterator();
	 String parentid= it.next();
	 String childid=it.next();
	 driver.switchTo().window(childid);
	 System.out.println(driver.findElement(By.className("red")).getText());
	String ab= driver.findElement(By.className("red")).getText().split("at")[1].trim().split(" ")[0];
	System.out.println(ab);
	driver.switchTo().window(parentid);
	driver.findElement(By.id("username")).sendKeys(ab);
	}

}
