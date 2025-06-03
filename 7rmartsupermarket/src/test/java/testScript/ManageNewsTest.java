package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base{

@Test
public void manageNewsTest()
{
	String username="admin";
	String password="admin";
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();
	
	ManageNewsPage manage=new ManageNewsPage(driver);
	String news="Have a nice day";
	manage.moreInfo();
	manage.newMethod();
	manage.textFieldMethod(news);
	manage.save();
	boolean isalertavailable=manage.isAlertDisplayed();
	Assert.assertTrue(isalertavailable);
	
}
	
@Test
public void manageNewsTest1()
{
	String username="admin";
	String password="admin";
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();	
	
	ManageNewsPage manage=new ManageNewsPage(driver);
	manage.moreInfo();
	manage.newMethod();
	manage.isSaveButtonDisplayed();
}
@Test
public void manageNewsTest2()
{
	String username="admin";
	String password="admin";
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickTheSignInButton();	
	ManageNewsPage manage=new ManageNewsPage(driver);
	manage.moreInfo();
	manage.deleteMethod();
	manage.deleteAlert();
}
}
