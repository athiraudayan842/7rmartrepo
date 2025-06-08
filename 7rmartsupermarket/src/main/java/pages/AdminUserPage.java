package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {

	public WebDriver driver;	
	
	public AdminUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
//@FindBy(xpath="//a[contains(@href,'uniqassosiates.com/admin/list-admin')and @class='small-box-footer']")WebElement moreinfo;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newField;
@FindBy(xpath="//input[@name='username']")WebElement usernameField;
@FindBy(xpath="//input[@id='password']")WebElement passwordField;
@FindBy(xpath="//select[@name='user_type']")WebElement selectField;
@FindBy(xpath="//button[@name='Create']")WebElement saveField;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alertField;


//public void moreInfo()
//{
//moreinfo.click();	
//}
public AdminUserPage newMethod()
{
newField.click();
return this;	
}
public  AdminUserPage enterusername(String usernamevalue)
{
usernameField.sendKeys(usernamevalue);
return this;	
}
public AdminUserPage enterpassword(String passwordvalue)
{
passwordField.sendKeys(passwordvalue);
return this;	
}
public AdminUserPage userType()
{
	Select select=new Select(selectField);	
	select.selectByVisibleText("Admin");
	return this;
}
public AdminUserPage save()
{
	
	saveField.click();
	return this;
}
public boolean isAlertDisplayed()
{
	return alertField.isDisplayed();
	
}


}
