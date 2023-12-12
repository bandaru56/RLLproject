package Testpages;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseTest;
import pages.HomepageTest;
import pages.Signinpage;


public class TestingHomepage extends BaseTest{
	Signinpage SP;
	HomepageTest HP;
	@BeforeTest
	public void OpenApp()
	{
		getBrowser();
		SP=new Signinpage();
		HP=new HomepageTest();
	}

	@Test(priority=1)
	public void testLogin() {
		SP.enterLoginDetails("msandhyasandy1207@gmail.com", "Naveen@123456");
 
		}
	@Test(priority=2)
	public void CheckingDetails() throws InterruptedException {
		HP.Checking();
		HP.Checkingview();
		HP.Searchon();
	Thread.sleep(30000);
}
	@Test(priority=3)
public void CloseBrowser() {
	driver.close();
}
	
	
	
   
}
