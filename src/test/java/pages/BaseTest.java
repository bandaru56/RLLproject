package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

public static WebDriver driver;
	
	public static void getBrowser()
	{
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");	
	}
	
	public static void teardown()
	{
		driver.quit();
	}
	
}