package mmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		// firefox lunach	
			//WebDriver driver=new FirefoxDriver();
			
		// edge lunach	
				//WebDriver driver=new EdgeDriver();
		    driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			// dropdown with select tag
			WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
			Select dropdown=new Select(staticDropdown);
			dropdown.selectByIndex(3);
			dropdown.getFirstSelectedOption();
			dropdown.selectByVisibleText("AED");
			dropdown.selectByValue("USD");
	}

}
