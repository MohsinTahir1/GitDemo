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

public class calendarui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    driver.findElement(By.className("react-date-picker__inputGroup__year")).click();
	    driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
	    driver.findElement(By.className("react-calendar__navigation__label__labelText")).click();
	    driver.findElement(By.xpath("//button[text()='2027']")).click();
	    driver.findElement(By.xpath("//abbr[text()='June']")).click();
	    driver.findElement(By.xpath("//abbr[text()='15']")).click();
	    System.out.println(driver.findElement(By.className("react-date-picker__inputGroup")).getText());
	}

}