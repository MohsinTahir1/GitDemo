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
public class practicelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("checkBoxOption2")).click();
	    String ab=driver.findElement(By.xpath("//label[@for='benz']")).getText();
	    System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
	    WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
	    Select dropdown=new Select(staticDropdown);
	    dropdown.selectByVisibleText(ab);
	    driver.findElement(By.id("name")).sendKeys(ab);
	    driver.findElement(By.id("alertbtn")).click();
	    driver.switchTo().alert().getText();
	    Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Option2, share this practice page and share your knowledge");
	   
	}

}
