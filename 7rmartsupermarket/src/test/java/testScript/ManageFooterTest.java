package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;


public class ManageFooterTest extends Base{
	ManageFooterPage managefooterpage;
	HomePage homepage;
@Test(description="Verify whether the user is able to update  the footr text information  in the Manage Footer page successfully")
	public void verifyWhetherUserIsAbleToUpdateTheFooterTextInformation() throws IOException
	{
	String username=ExcelUtility.getStringData(1,0,"loginpage");//excel reader
	String password=ExcelUtility.getStringData(1,1,"loginpage");
	
	
		//String username="admin";
		//String password="admin";
		
		//String address="siva bhavan";
		//String email="meenu@gmail.com";
		//String num="9994328014";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		homepage=loginpage.clickTheSignInButton();
		
	ManageFooterPage footer=new ManageFooterPage(driver);	
		
		String address=ExcelUtility.getStringData(1,0,"managefooterpage");
		String email=ExcelUtility.getStringData(1,1,"managefooterpage");
		String num=ExcelUtility.getIntegerData(1,2,"managefooterpage");
			
		
		managefooterpage=homepage.moreInfoManageFooter();
		managefooterpage.edit().addressMethod(address).emailFieldMethod(email).phoneFieldMethod(num).updateMethod().isAlertDisplayed();
		//footer.moreInfo();
		//footer.edit();
		//footer.addressMethod(address);
		//footer.emailFieldMethod(email);
		//footer.phoneFieldMethod(num);
		//footer.updateMethod();
		//footer.alert();
		boolean isalertavailable=managefooterpage.isAlertDisplayed();
		Assert.assertTrue(isalertavailable,Constant.UPDATEFOOTERERROR);
				
		
	}
@Test(description="Verify whether the user is able to display the update button  in the Manage Footer page successfully")
	public void verifyWhetherUserIsAbleToDisplayTheUpdateButton() throws IOException
	{
	String username=ExcelUtility.getStringData(1,0,"loginpage");//excel reader
	String password=ExcelUtility.getStringData(1,1,"loginpage");
		//String username="admin";
		//String password="admin";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		homepage=loginpage.clickTheSignInButton();
		
		//ManageFooterPage footer=new ManageFooterPage(driver);	
		managefooterpage=homepage.moreInfoManageFooter();
		managefooterpage.edit().isUpadateButtonDisplayed();
		//footer.moreInfo();
		//footer.edit();
		//footer.isUpadateButtonDisplayed();
			
	}
	
	
	
	
}
