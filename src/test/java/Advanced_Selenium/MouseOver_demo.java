package Advanced_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_demo {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();// For deleting all history.
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='IT Infrastructure']"))).build().perform();
		
		driver.findElement(By.linkText("Servers")).click();
		
		
		
	}

}
