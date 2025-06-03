package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends Base {
@Test
	public void mangeContactTest()
	{
		String username="admin";
		String password="admin";
		String num="9994328014";
		String email="meenu@gmail.com";
		String address="siva bhavan";
		String deliverytime="9.00";
		String deliverychargelimit="10";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickTheSignInButton();	
	
		ManageContactPage contact=new ManageContactPage(driver);
		
	contact.moreInfo();
	contact.editMethod();
	contact.phoneFieldMethod(num);
	contact.emailFieldMethod(email);
	contact.addressMethod(address);
	contact.deliveryTimeMethod(deliverytime);
	contact.deliveryChargeTime(deliverychargelimit);
	contact.updateMethod();
	contact.alert();
	boolean isalertavailable=contact.alert();
	Assert.assertTrue(isalertavailable);
	}	
		
}	
		
		
	
	
	
	
	
	

