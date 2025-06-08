package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends Base {
	ManageContactPage managecontactpage;
	HomePage homepage;
@Test(description="Verify whether the user is able to add the contact us  in the Manage Contact page successfully")
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
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		homepage=loginpage.clickTheSignInButton();	
	
		//ManageContactPage contact=new ManageContactPage(driver);
		
	//contact.moreInfo();
		managecontactpage=homepage.moreInfoManageContact();
		managecontactpage.editMethod().phoneFieldMethod(num).emailFieldMethod(email).addressMethod(address).deliveryTimeMethod(deliverytime).deliveryChargeTime(deliverychargelimit).updateMethod().isAlertDisplayed();
	//contact.editMethod();
	//contact.phoneFieldMethod(num);
	//contact.emailFieldMethod(email);
	//contact.addressMethod(address);
	//contact.deliveryTimeMethod(deliverytime);
	//contact.deliveryChargeTime(deliverychargelimit);
	//contact.updateMethod();
	//contact.alert();
	boolean isalertavailable=managecontactpage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.ADDMANAGECONTACTERRORR);
	}	
		
}	
		
		
	
	
	
	
	
	

