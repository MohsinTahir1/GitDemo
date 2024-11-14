package mmm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    SoftAssert ab=new SoftAssert();
	   
	   List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	   for(WebElement link: links) {
		   String url=link.getAttribute("href");
		    HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		    conn.setRequestMethod("HEAD");
		    conn.connect();
		    int responsecode=conn.getResponseCode();
		    System.out.println(responsecode);
		    ab.assertTrue(responsecode<400, link.getText());
	   }
	   ab.assertAll();
	}

}
