package mmm;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class locatorsslenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
			driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement ab=	driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(ab)).getText());
		WebElement cd=	driver.findElement(By.cssSelector("[for='dateofBirth']"));
	    driver.findElement(with(By.tagName("input")).below(cd)).click();
	    WebElement ef=	driver.findElement(By.cssSelector("[for='exampleCheck1']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(ef)).click();
	    WebElement gh=	driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(gh)).getText());
	}

}
