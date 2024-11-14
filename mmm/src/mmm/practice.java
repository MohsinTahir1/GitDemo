package mmm;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import  java.lang.Iterable;
import java.time.Duration;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		  String text="Rahul";
		    driver.manage().window().maximize();
		    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		    driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		    driver.findElement(By.id("password")).sendKeys("learning");
		    driver.findElement(By.cssSelector("input[value='user']")).click();
		    WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		    w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		    driver.findElement(By.id("okayBtn")).click();
		    WebElement staticDropdown=driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		    Select dropdown=new Select(staticDropdown);
		    dropdown.selectByValue("consult");
		    driver.findElement(By.cssSelector("input[name='terms']")).click();
		    driver.findElement(By.xpath("//input[@name='signin']")).click();
		String [] products= {"iphone","Samsung","Nokia","Blackberry"};
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-link")));
		   List<WebElement>product= driver.findElements(By.className("col-lg-3"));
		    for(int i=0;i<product.size();i++)
		    {
		    String [] ab=	product.get(i).getText().split(" ");
		   	      String Formatting=ab[0].trim();
		 List cd=Arrays.asList(products);
		    if(cd.contains(Formatting)) {
		    	driver.findElements(By.className("card-footer")).get(i).click();
		    	}
		  //  driver.findElement(By.className("nav-link")).click();
		    }
		    driver.findElement(By.className("nav-link")).click();
	}
}

