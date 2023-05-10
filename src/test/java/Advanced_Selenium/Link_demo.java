package Advanced_Selenium;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_demo {

	public static <E> void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();// For deleting all history
		
		
		//to find number of links
		 List<WebElement> alllink = driver.findElements(By.tagName("a"));
		 
		 System.out.println("List of link are " + alllink.size());
		 
		 //to print all list of links
		 for (int i = 0; i<alllink.size();i++) {
			 
			 System.out.println(alllink.get(i).getAttribute("href"));
			 
			//if any tagname starts with <a> - this is a lenk text or link
			 // Every link attribute name is href.
		 
			 
			 
		 }
	}

	
	
}
