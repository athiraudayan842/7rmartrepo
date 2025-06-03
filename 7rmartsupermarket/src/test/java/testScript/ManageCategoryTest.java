package testScript;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;

public class ManageCategoryTest extends Base {
@Test
	public void manageCategoryTest() throws AWTException
	{
		
		String username="admin";
		String password="admin";
		String product="rice";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickTheSignInButton();
		
		ManageCategoryPage category=new ManageCategoryPage(driver);
		category.moreInfo();
		category.newMethod();
		category.categoryMethod(product);
		category.groupMethod();
		category.imageMethod();
		category.saveMethod();
	
		boolean isalertavailable=category.isAlertDisplayed();
		Assert.assertTrue(isalertavailable);
	}
	
	
	
	
	
}
