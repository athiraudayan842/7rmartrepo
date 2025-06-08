package testScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;

public class HomePageTest extends Base {

	
	@Test(description="Verify whether the user is able to logout the home page successfully")
	public void logoutTest()
	{
		String username="admin";
		String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickTheSignInButton();
		HomePage logoutpage=new HomePage(driver);
		logoutpage.clickAdmin();
		logoutpage.clickLogout();
				
	}
	
	
}
