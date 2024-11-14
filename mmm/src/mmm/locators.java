package mmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.id("inputUsername")).sendKeys("hello");
			driver.findElement(By.name("inputPassword")).sendKeys("123");
			driver.findElement(By.className("signInBtn")).click();
			System.out.println(driver.findElement(By.className("error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mohsin");
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("aliraza34052@gmail.com");
		//	driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("122345");
			driver.findElement(By.className("reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.className("infoMsg")).getText());
			driver.findElement(By.className("go-to-login-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
			driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.className("signInBtn")).click();
	}

}
