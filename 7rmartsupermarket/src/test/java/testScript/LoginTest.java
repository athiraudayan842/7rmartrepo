package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest  extends Base{

	@Test(groups= {"regression"}, retryAnalyzer=retry.Retry.class)
	
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
	Assert.assertTrue(ishomepageavailable);
	
	
	
		
	}
	@Test
	public void loginTest1()
	{
	
	String username="admin";
	String password="admi";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
	
	}
	@Test
	public void loginTest2()
	{
	
	String username="admi";
	String password="admin";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
	
	}
@Test
	public void loginTest3()
	{
	
	String username="admi";
	String password="adm";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertavailable=loginpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
	
	}
}
