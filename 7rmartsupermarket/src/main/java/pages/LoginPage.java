package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)// constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//webelements intilization
	}
	
	@FindBy(xpath="//input[@name='username']")WebElement usernameField;
	@FindBy(xpath="//input[@name='password']")WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']")WebElement signField;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboardField;
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;

public LoginPage enterTheUsername(String usernamevalue)
{
usernameField.sendKeys(usernamevalue);
return this;	
}

public LoginPage enterPassword(String passwordvalue)
{
passwordField.sendKeys(passwordvalue);
return this;	
}
	
public HomePage clickTheSignInButton()
{
	signField.click();
	return new HomePage(driver);
}

public boolean isDashboardDisplay()
{
return dashboardField.isDisplayed();	
}

public boolean isAlertDisplayed()
{
	return alert.isDisplayed();
	
}
	
	
	
	

	
}
