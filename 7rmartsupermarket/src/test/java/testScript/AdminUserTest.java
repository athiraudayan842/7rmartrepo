package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
@Test(groups= {"regression"}, retryAnalyzer=retry.Retry.class)
public void adminUserTest ()
{
	String username="admin";
	String password="admin";
	//String user ="adm";
	//String pass="adm12";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	
	FakerUtility faker=new FakerUtility();
	String user=faker.creatARandomFirstName();
	String pass=faker.creatARandomFirstName();
			
	AdminUserPage admin=new AdminUserPage(driver);
	admin.moreInfo();
	admin.newMethod();
	admin.enterusername(user);
	admin.enterpassword(pass);
	admin.userType();
	admin.save();
	boolean isalertavailable=admin.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);

}
	
	
	
}
