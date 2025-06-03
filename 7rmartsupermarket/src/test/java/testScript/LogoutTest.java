package testScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends Base {

	
	@Test
	public void logoutTest()
	{
		String username="admin";
		String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickTheSignInButton();
		LogoutPage logoutpage=new LogoutPage(driver);
		logoutpage.clickAdmin();
		logoutpage.clickLogout();
				
	}
	
	
}
