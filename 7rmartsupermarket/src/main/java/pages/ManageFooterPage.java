package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
	public WebDriver driver;
	public ManageFooterPage(WebDriver driver) {
		  this.driver=driver;
			PageFactory.initElements(driver, this);	
	}	
	
@FindBy(xpath="//a[contains(@href,'uniqassosiates.com/admin/list-footertext')]")WebElement moreinfo;	
@FindBy(xpath="//a[contains(@href,'.uniqassosiates.com/admin/Footertext/edit?edit=1')]")WebElement edit;		
@FindBy(xpath="//textarea[@id='content']")WebElement addressField;
@FindBy(xpath="//input[@name='email']")WebElement emailField;
@FindBy(xpath="//input[@id='phone']")WebElement phoneField;
@FindBy(xpath="//button[@name='Update']")WebElement update;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;


public void moreInfo()
{
	moreinfo.click();
}
public void edit()
{
	edit.click();
}

public void addressMethod(String address)
{
	addressField.clear();
	addressField.sendKeys(address);

}
public void emailFieldMethod(String email)
{
	emailField.clear();
	emailField.sendKeys(email);
}
public void phoneFieldMethod(String num)
{
	phoneField.clear();
phoneField.sendKeys(num);	
}
public void updateMethod()
{
update.click();	
}
public boolean alert()
{
	return alert.isDisplayed();

}

public void isUpadateButtonDisplayed()
{
	if(update.isDisplayed()) {
		System.out.println("update button is displayed");
	}
	else
	{
		System.out.println("update button is not displayed");	
	}

}
}

