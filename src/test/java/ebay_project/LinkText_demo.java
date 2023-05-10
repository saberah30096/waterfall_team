package ebay_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_demo {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com//");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().deleteAllCookies();// For deleting all history.
		
		
		driver.findElement(By.linkText("Contact")).click();
	}

}
