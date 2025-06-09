
package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	AdminUserPage adminuserpage;
	HomePage homepage;
@Test(groups= {"regression"}, description="Verify whether the useris able to add  the new admin users information in the admin users page successfully", retryAnalyzer=retry.Retry.class)
public void verifyWhetherUserIsAbleToAddNewAdminUserInformation() throws IOException
{
	String username=ExcelUtility.getStringData(1,0,"loginpage");//excel reader
	String password=ExcelUtility.getStringData(1,1,"loginpage");
	//String username="admin";
	//String password="admin";
	//String user ="adm";
	//String pass="adm12";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password);
	//loginpage.enterPassword(password);
	homepage=loginpage.clickTheSignInButton();
	
	FakerUtility faker=new FakerUtility();
	String user=faker.creatARandomFirstName();
	String pass=faker.creatARandomFirstName();
			
	//AdminUserPage admin=new AdminUserPage(driver);
	adminuserpage=homepage.moreInfoAdminUser();
	adminuserpage.newMethod().enterusername(username).enterpassword(password).userType().saveMethod();
	//admin.moreInfo();
	//admin.newMethod();
	//admin.enterusername(user);
	//admin.enterpassword(pass);
	//admin.userType();
	//admin.saveMethod();
	boolean isalertavailable=adminuserpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.ADMINUSERSERROR);

}
	
	
	
}
