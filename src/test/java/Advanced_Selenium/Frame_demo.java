package Advanced_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_demo {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();// For deleting all history
		
		//to write test case for frame we need to use the following bothlines.
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("compact1")).click();
		


		
		

	}

}
