package testNg_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_demo2 {
	
	@Test
	public void login () throws Exception {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com//");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().deleteAllCookies();// For deleting all history
		
		driver.findElement(By.id("login2")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("waterfall");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
		Thread.sleep(5000);
		boolean loginsuccess = driver.findElement(By.id("nameofuser")).isDisplayed();
		Assert.assertTrue(loginsuccess);
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}
	
	
	
	

}
