package mmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			locators2 ab=new locators2();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String ab1=ab.getpassword(driver);			
			driver.findElement(By.id("inputUsername")).sendKeys("rahul");
			driver.findElement(By.name("inputPassword")).sendKeys(ab1);
			Thread.sleep(2000);
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.tagName("p")).getText());
			Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
			Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello rahul," );
			driver.findElement(By.xpath("//button[text()='Log Out']")).click();
			driver.close();
				}
	
      public String getpassword(WebDriver driver) throws InterruptedException
      {
    	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
    	  driver.findElement(By.linkText("Forgot your password?")).click();
    	  Thread.sleep(2000);
			driver.findElement(By.className("reset-pwd-btn")).click();
			String password=driver.findElement(By.className("infoMsg")).getText();
		//	Please use temporary password 'rahulshettyacademy' to Login.
			String[] passwordsplit=password.split("'");
		//	password[0] , rahulsheetacademy'[1] 
			String[] passwordfinalsplit=passwordsplit[1].split("'");
			// rahulsheetacademy[0]
		String finalpassword=passwordfinalsplit[0];
		driver.findElement(By.className("go-to-login-btn")).click();
		return finalpassword;
      }
}
