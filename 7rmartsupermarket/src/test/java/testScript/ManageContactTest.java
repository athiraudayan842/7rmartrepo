package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	ManageContactPage managecontactpage;
	HomePage homepage;
@Test(description="Verify whether the user is able to add the contact us  in the Manage Contact page successfully")
	public void verifyWhetherUserIsAbleToAddContactUsDetails() throws IOException
	{
	String username=ExcelUtility.getStringData(1,0,"loginpage");
	String password=ExcelUtility.getStringData(1,1,"loginpage");
		//String username="admin";
		//String password="admin";
		//String num="9994328014";
		//String email="meenu@gmail.com";
		//String address="siva bhavan";
		//String deliverytime="9.00";
		//String deliverychargelimit="10";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		homepage=loginpage.clickTheSignInButton();	
	
		//ManageContactPage contact=new ManageContactPage(driver);
		String num=ExcelUtility.getIntegerData(0,1,"managecontactpage");
		String email =ExcelUtility.getStringData(1,1,"managecontactpage");
		String address=ExcelUtility.getStringData(2,1,"managecontactpage");
		String deliverytime=ExcelUtility.getIntegerData(3,1,"managecontactpage");
		String deliverychargelimit=ExcelUtility.getIntegerData(4,1,"managecontactpage");
		
		
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
		
		
	
	
	
	
	
	

