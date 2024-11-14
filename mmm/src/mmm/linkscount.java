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
public class linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    System.out.println(driver.findElements(By.tagName("a")).size());	
	    WebElement footdriver=driver.findElement(By.id("gf-BIG"));
	    System.out.println(footdriver.findElements(By.tagName("a")).size());
	   WebElement specificlink= footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	  System.out.println( specificlink.findElements(By.tagName("a")).size());
	  List<WebElement> ab=specificlink.findElements(By.tagName("a"));
	  for(int i=0;i<ab.size();i++)
	  {
		  String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  ab.get(i).sendKeys(selectLinkOpeninNewTab);
		  }
		 Set<String> abc= driver.getWindowHandles(); 
		Iterator<String> it =abc.iterator();
		while(it.hasNext()) {
		driver.switchTo().window(it.next());
		  System.out.println(driver.getTitle());
		}
	    }
}
