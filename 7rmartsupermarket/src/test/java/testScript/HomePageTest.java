package testScript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;
import pages.HomePage;

public class HomePageTest extends Base {

	HomePage homepage;
	@Test(description="Verify whether the user is able to logout the home page successfully")
	public void verifyWhetherUserIsAbleToLogoutTHeSession() throws IOException
	{
		String username=ExcelUtility.getStringData(1,0,"loginpage");//excel reader
		String password=ExcelUtility.getStringData(1,1,"loginpage");
		//String username="admin";
		//String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		//loginpage.clickTheSignInButton();
		//HomePage logoutpage=new HomePage(driver);
		homepage=loginpage.clickTheSignInButton();
		homepage.clickAdmin();
		homepage.clickLogout();
		boolean issavedisplayed=homepage.isLogoutDisplay();
		Assert.assertTrue(issavedisplayed,Constant.LOGOUTERROR);
				
	}
	
	
}
