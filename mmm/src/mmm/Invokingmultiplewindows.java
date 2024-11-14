package mmm;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Invokingmultiplewindows {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/angularpractice/");
		//	driver.findElement(By.cssSelector("[name='name']"));
			driver.switchTo().newWindow(WindowType.WINDOW);
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
			String parnet=it.next();
			String child=it.next();
			driver.switchTo().window(child);
			driver.get("https://rahulshettyacademy.com/");
		//	String cd=driver.findElements(By.cssSelector("a{href*='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses/p']")).get(1).getText();	
			String cd=driver.findElement(By.linkText("Home")).getText();		
			driver.switchTo().window(parnet);
			driver.findElement(By.cssSelector("[name='name']")).sendKeys(cd);
			driver.quit();
			//GEt Height & Width
		WebElement dimension=driver.findElement(By.cssSelector("[name='name']"));
			System.out.println(dimension.getRect().getDimension().getHeight());

			System.out.println(dimension.getRect().getDimension().getWidth());
			}
}
