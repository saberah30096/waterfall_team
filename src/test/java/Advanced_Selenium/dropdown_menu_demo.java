package Advanced_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_menu_demo {

	public static void main(String[] args) throws Exception {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().deleteAllCookies();// For deleting all history.
		
		Select sl = new Select(driver.findElement(By.id("gh-cat")));
		//by visible text
		//by value
		//By index
		Thread.sleep(5000);
		//sl.selectByVisibleText("Books");
		
		//sl.selectByIndex(5);
		sl.selectByValue("11450");
	}

}
