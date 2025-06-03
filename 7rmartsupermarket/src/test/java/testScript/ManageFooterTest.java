package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterPage;


public class ManageFooterTest extends Base{
@Test
	public void manageFooterTest()
	{
		
		String username="admin";
		String password="admin";
		
		String address="siva bhavan";
		String email="meenu@gmail.com";
		String num="9994328014";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickTheSignInButton();
		
	ManageFooterPage footer=new ManageFooterPage(driver);	
		footer.moreInfo();
		footer.edit();
		footer.addressMethod(address);
		footer.emailFieldMethod(email);
		footer.phoneFieldMethod(num);
		footer.updateMethod();
		footer.alert();
		boolean isalertavailable=footer.alert();
		Assert.assertTrue(isalertavailable);
				
		
	}
	public void ManageFooterTest1()
	{
		String username="admin";
		String password="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickTheSignInButton();
		
		ManageFooterPage footer=new ManageFooterPage(driver);	
		footer.moreInfo();
		footer.edit();
		footer.isUpadateButtonDisplayed();
			
	}
	
	
	
	
}
