package testScript;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;

public class ManageCategoryTest extends Base {
	ManageCategoryPage managecategorypage;
	HomePage homepage;
@Test(description="Verify whether the user is able to add the new add category in the Manage Category page successfully")
	public void manageCategoryTest() throws AWTException
	{
		
		String username="admin";
		String password="admin";
		String product="rice";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		//loginpage.enterPassword(password);
		homepage=loginpage.clickTheSignInButton();
		
		//ManageCategoryPage category=new ManageCategoryPage(driver);
		managecategorypage=homepage.moreInfoManageCategory();
		managecategorypage.newMethod().categoryMethod(product).groupMethod().imageMethod().saveMethod();
		//category.moreInfo();
		
		//category.newMethod();
		//category.categoryMethod(product);
		//category.groupMethod();
		//category.imageMethod();
		//category.saveMethod();
	
		boolean isalertavailable=managecategorypage.isAlertDisplayed();
		Assert.assertTrue(isalertavailable,Constant.ADDMANAGECATECORYERROR);
	}
	
	
	
	
	
}
