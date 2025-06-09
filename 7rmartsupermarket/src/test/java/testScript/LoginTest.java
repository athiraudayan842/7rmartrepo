package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest  extends Base{

	@Test(groups= {"regression"}, description="Verify whether the user is able to login the dashboard with valid username and valid password successfully", retryAnalyzer=retry.Retry.class)
	
public void verifyWhetherUserIsAbleToLoginWithCorrectUserameAndCorrectPassword() throws IOException
	{
	
	//String username="admin";
	//String password="admin";
		String username=ExcelUtility.getStringData(1,0,"loginpage");//excel reader
		String password=ExcelUtility.getStringData(1,1,"loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password).clickTheSignInButton();
	//loginpage.enterPassword(password);
	//loginpage.clickTheSignInButton();
	boolean ishomepageavailable=loginpage.isDashboardDisplay();
	Assert.assertTrue(ishomepageavailable,Constant.LOGINCORRECTUSERNAMECORRECTPASSWORD);
	}	
	
	
		

	@Test(description="Verify whether the user is able to login the dashboard with valid username and invalid password successfully")
	public void verifyWhetherUserIsAbleToLoginWithCorrectUserameAndInCorrectPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(2,0,"loginpage");//excel reader
		String password=ExcelUtility.getStringData(2,1,"loginpage");
	
	//String username="admin";
	//String password="admi";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password).clickTheSignInButton();
	//loginpage.enterPassword(password);
	//loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.LOGINCORRECTUSERNAMEWRONGPASSWORD);
	
	}
	
	
	@Test(description="Verify whether the user is able to login the dashboard with invalid username and valid password successfully")
	public void verifyWhetherUserIsAbleToLoginWithInCorrectUserameAndCorrectPassword() throws IOException
	{
		String username=ExcelUtility.getStringData(3,0,"loginpage");//excel reader
		String password=ExcelUtility.getStringData(3,1,"loginpage");
	//String username="admi";
	//String password="admin";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password).clickTheSignInButton();
	//loginpage.enterPassword(password);
	//loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.LOGINWRONGUSERNAMCORRECTPASSWORD);
	
	}
	
	
@Test(description="Verify whether the user is able to login the dashboard with invalid username and invalid password successfully",dataProvider ="LoginProvider")
	public void verifyWhetherUserIsAbleToLoginWithInCorrectUserameAndInCorrectPassword(String username,String password ) throws IOException
	{
	
	//String username=ExcelUtility.getStringData(4,0,"loginpage");//excel reader
	//String password=ExcelUtility.getStringData(4,1,"loginpage");
	//String username="admi";
	//String password="adm";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password).clickTheSignInButton();
	//loginpage.enterPassword(password);
	//loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.LOGINWRONGUSERNAMEWRONGPASSWORD);
	
	}
@DataProvider(name="LoginProvider")
public Object[][] getDataFromTestData() throws IOException{
	return new Object[][] {{ExcelUtility.getStringData(4, 0,"loginpage"),ExcelUtility.getStringData(4,1,"loginpage")}};
	


}
}
