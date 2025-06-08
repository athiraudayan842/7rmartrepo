package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest  extends Base{

	@Test(groups= {"regression"}, description="Verify whether the user is able to login the dashboard with valid username and valid password successfully", retryAnalyzer=retry.Retry.class)
	
public void loginTest() throws IOException
	{
	
	String username="admin";
	String password="admin";
		//String username=ExcelUtility.getStringData(1,0,"loginpage");//excel reader
		//String password=ExcelUtility.getStringData(1,1,"loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	boolean ishomepageavailable=loginpage.isDashboardDisplay();
	Assert.assertTrue(ishomepageavailable,Constant.LOGINCORRECTUSERNAMECORRECTPASSWORD);
	
	
	
		
	}
	@Test(description="Verify whether the user is able to login the dashboard with valid username and invalid password successfully")
	public void loginTest1()
	{
	
	String username="admin";
	String password="admi";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.LOGINCORRECTUSERNAMEWRONGPASSWORD);
	
	}
	@Test(description="Verify whether the user is able to login the dashboard with invalid username and valid password successfully")
	public void loginTest2()
	{
	
	String username="admi";
	String password="admin";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.LOGINWRONGUSERNAMCORRECTPASSWORD);
	
	}
@Test(description="Verify whether the user is able to login the dashboard with invalid username and invalid password successfully")
	public void loginTest3()
	{
	
	String username="admi";
	String password="adm";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.LOGINWRONGUSERNAMEWRONGPASSWORD);
	
	}
}
