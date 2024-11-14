package mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			driver.findElement(By.className("r-tju18j")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("css-76zvg2")).click();
			Thread.sleep(2000);
			//driver.findElement(By.className("css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73")).click();
			driver.findElement(By.className("css-1dbjc4n")).click();
	}

}
