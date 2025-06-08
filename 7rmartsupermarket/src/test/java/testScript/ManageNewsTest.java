package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base{
	ManageNewsPage managenewspage;
	HomePage homepage;

@Test(description="Verify whether the user is able to add the new news  in the Manage News page successfully")
public void manageNewsTest()
{
	String username="admin";
	String password="admin";
	String news="Have a nice day";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password);
	//loginpage.enterPassword(password);
	homepage=loginpage.clickTheSignInButton();
	
	//ManageNewsPage manage=new ManageNewsPage(driver);
	managenewspage=homepage.moreInfoManageNews();
	managenewspage.newMethod().textFieldMethod(news).save();
	
	//manage.moreInfo();
	//manage.newMethod();
	//manage.textFieldMethod(news);
	//manage.save();
	boolean isalertavailable=managenewspage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable,Constant.ADDNEWSERROR);
	
}
	
@Test(description="Verify whether the user is able to display the save button in the Manage News page successfully")
public void manageNewsTest1()
{
	String username="admin";
	String password="admin";
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password);
	//loginpage.enterPassword(password);
	homepage=loginpage.clickTheSignInButton();	
	
	//ManageNewsPage manage=new ManageNewsPage(driver);
	managenewspage=homepage.moreInfoManageNews();
	managenewspage.newMethod().isSaveButtonDisplayed();
	//manage.moreInfo();
	//manage.newMethod();
	//manage.isSaveButtonDisplayed();
}
@Test(description="Verify whether the user is able to delete the news in the Manage News page successfully")
public void manageNewsTest2()
{
	String username="admin";
	String password="admin";
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username).enterPassword(password);
	//loginpage.enterPassword(password);
	homepage=loginpage.clickTheSignInButton();
	
	//ManageNewsPage manage=new ManageNewsPage(driver);
	managenewspage=homepage.moreInfoManageNews();
	managenewspage.deleteMethod().deleteAlert();
	//manage.moreInfo();
	//manage.deleteMethod();
	//manage.deleteAlert();
}
}
