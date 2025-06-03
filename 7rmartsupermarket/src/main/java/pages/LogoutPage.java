package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	public WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
 
	
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement adminField;	
	@FindBy(xpath="//a[contains(@href,'.com/admin/logout') and @class='dropdown-item']")WebElement logoutField;
	
	

	public void clickAdmin()
	{
		
	adminField.click();	
	}
	
	public void clickLogout()
	{
	
	logoutField.click();	
	}
}

