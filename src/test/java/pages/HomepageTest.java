package pages;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 


public class HomepageTest extends BaseTest { 

	@FindBy(id="checking-menu")
	static WebElement Button_Click;
	@FindBy(id="view-checking-menu-item")
	static WebElement Click_on;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/label/input")
	static WebElement Search_Click;
	
	
	public void Checking() {
		Button_Click.click();
		
	}
	public void Checkingview() {
		Click_on.click();
		
	}
	public void Searchon() {
		Search_Click.click();
		
	}
	
	public HomepageTest()
	{
		PageFactory.initElements(driver,this);
	}
	
}

