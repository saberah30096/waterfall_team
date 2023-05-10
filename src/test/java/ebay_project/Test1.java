package ebay_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");// To launch url
		driver.manage().window().maximize(); // maximize our window
		driver.findElement(By.id("login2")).click(); //click login
		driver.findElement(By.id("LOGIN_SMALL")).click();
		 
		 
		 // for click we have - click() method
		 // for type or enter -  sendkey() method
		 // for closing window - close() method
		 // for quit-quit() method
		
		
	}

}
