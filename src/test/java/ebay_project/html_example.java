package ebay_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class html_example {

	public static void main(String[] args) throws Exception {
		System.setProperty( "webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com//");// To launch or open application or  url
		driver.manage().window().maximize(); // maximize our webbrowser
		driver.manage().deleteAllCookies();// For deleting all history.
		driver.findElement(By.id("signin2")).click();// click signup link
		
		//Special note: selenium sometimes does not run the command on time. It mightnot display anything. if that happens
		// wait for 5 seconds and run it again. We will also thread.sleep method
		Thread.sleep(5000);// use it only if you need it.
		driver.findElement(By.id("sign-username")).sendKeys("Jahan");// to Enter User name.
		driver.findElement(By.id("sign-password")).sendKeys("12345");// Enter Password
		driver.findElement(By.xpath("//button[text()='Sign up']")).click(); //Click signUp
		//driver.findElement(By.id("login2")).click();// click login link
		
		//driver.close();// to close the url or application
		//driver.quit();// to quit the application
		 
		//System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.bankofamerica.com/");// To launch url
		//driver.manage().window().maximize(); // maximize our webbrowser
		
		
		
		

	}

}
