package testScript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;
import pages.HomePage;

public class HomePageTest extends Base {

	
	@Test(description="Verify whether the user is able to logout the home page successfully")
	public void verifyWhetherUserIsAbleToLogoutTHeSession() throws IOException
	{
		String username=ExcelUtility.getStringData(1,0,"loginpage");//excel reader
		String password=ExcelUtility.getStringData(1,1,"loginpage");
		//String username="admin";
		//String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password).clickTheSignInButton();
		//loginpage.enterPassword(password);
		//loginpage.clickTheSignInButton();
		HomePage logoutpage=new HomePage(driver);
		logoutpage.clickAdmin();
		logoutpage.clickLogout();
				
	}
	
	
}
