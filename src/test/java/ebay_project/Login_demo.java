package ebay_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_demo {

	public static void main(String[] args) throws Exception {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com//");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().deleteAllCookies();// For deleting all history.
		
		driver.findElement(By.id("login2")).click(); //click login link
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("WaterFall");//Enter User Name
		driver.findElement(By.id("loginpassword")).sendKeys("12345");// Enter password
		driver.findElement(By.xpath("//button[text()='Log in']")).click();//click login
		
		
	}

}