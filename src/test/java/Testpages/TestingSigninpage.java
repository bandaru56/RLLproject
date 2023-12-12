package Testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseTest;
import pages.Signinpage;

 
public class TestingSigninpage extends BaseTest{
	Signinpage SP;
	@BeforeTest
	public void OpenApp()
	{
		getBrowser();
		SP=new Signinpage();
	}

	@Test(priority=1)
	public void testLogin() {
		SP.enterLoginDetails("msandhyasandy1207@gmail.com", "Naveen@123456");
 
		}
}
	


