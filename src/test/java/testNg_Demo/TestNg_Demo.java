package testNg_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_Demo {
	
	
	@Test 
	public void jahan() {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com//");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().deleteAllCookies();// For deleting all history
		
		driver.findElement(By.xpath("//a[test()='Contact']")).click();
		
		
		boolean result = driver.findElement(By.xpath("//label[text()='Contact Email:']")).isDisplayed();// for checking contact email is dispalyed.
		
		Assert.assertTrue(result);
		
		
	}

}
