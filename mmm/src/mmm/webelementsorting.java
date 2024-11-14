package mmm;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class webelementsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
			
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
			driver.findElement(By.xpath("//tr/th[1]")).click();
			List<WebElement> ab=driver.findElements(By.xpath("//tr/td[1]"));
			List <String> original=ab.stream().map(s-> s.getText()).collect(Collectors.toList());
			List <String> notoriginal=original.stream().sorted().collect(Collectors.toList());
			Assert.assertTrue(original.equals(notoriginal));
			List <String> price;
			do{
				List<WebElement> abc=driver.findElements(By.xpath("//tr/td[1]"));
			price=abc.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
			price.forEach(s->System.out.println(s));
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}}
			while(price.size()<1);
}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String pricelist=s.findElement(By.xpath("following-sibling ::td[1]")).getText();
		return pricelist;
	}
}
