package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	ManageNewsPage managenewspage;
	HomePage homepage;

	@Test(description = "Verify whether the user is able to add the new news  in the Manage News page successfully")
	public void verifyWhetherUserIsAbleToAddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");// excel reader
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		// String username="admin";
		// String password="admin";
		// String news="Have a nice day";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		// loginpage.enterPassword(password);
		homepage = loginpage.clickTheSignInButton();

		// ManageNewsPage manage=new ManageNewsPage(driver);
		
		String news = ExcelUtility.getStringData(0, 1, "managenewspage");

		managenewspage = homepage.moreInfoManageNews();
		managenewspage.newMethod().textFieldMethod(news).saveMethod();

		// manage.moreInfo();
		// manage.newMethod();
		// manage.textFieldMethod(news);
		// manage.save();
		boolean isalertavailable = managenewspage.isAlertDisplayed();
		Assert.assertTrue(isalertavailable, Constant.ADDNEWSERROR);

	}

	@Test(description = "Verify whether the user is able to display the save button in the Manage News page successfully")
	public void verifyWhetherUserIsAble() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "loginpage");// excel reader
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		// String username="admin";
		// String password="admin";

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		// loginpage.enterPassword(password);
		homepage = loginpage.clickTheSignInButton();

		// ManageNewsPage manage=new ManageNewsPage(driver);
		managenewspage = homepage.moreInfoManageNews();
		managenewspage.newMethod().isSaveButtonDisplayed();
		boolean issavedisplayed=managenewspage.isSaveAlertDisplay();
		Assert.assertTrue(issavedisplayed,Constant.DISPLAYSAVEBUTTONERROR);
		// manage.moreInfo();
		// manage.newMethod();
		// manage.isSaveButtonDisplayed();
	}

	@Test(description = "Verify whether the user is able to delete the news in the Manage News page successfully")
	public void manageNewsTest2() throws IOException {
		// String username="admin";
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");// excel reader
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterPassword(password);
		// loginpage.enterPassword(password);
		homepage = loginpage.clickTheSignInButton();

		// ManageNewsPage manage=new ManageNewsPage(driver);
		managenewspage = homepage.moreInfoManageNews();
		managenewspage.deleteMethod().deleteAlert();
		// manage.moreInfo();
		// manage.deleteMethod();
		// manage.deleteAlert();
		boolean isDeleteAlertDisplay=managenewspage.isDeleteAlertDisplay();
		Assert.assertTrue(isDeleteAlertDisplay,Constant.DELETENEWSERROR);
	}
}
