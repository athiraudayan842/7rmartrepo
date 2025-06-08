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
	
//@FindBy(xpath="//a[contains(@href,'uniqassosiates.com/admin/list-footertext')]")WebElement moreinfo;	
@FindBy(xpath="//a[contains(@href,'.uniqassosiates.com/admin/Footertext/edit?edit=1')]")WebElement edit;		
@FindBy(xpath="//textarea[@id='content']")WebElement addressField;
@FindBy(xpath="//input[@name='email']")WebElement emailField;
@FindBy(xpath="//input[@id='phone']")WebElement phoneField;
@FindBy(xpath="//button[@name='Update']")WebElement update;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;


//public void moreInfo()
//{
	//moreinfo.click();
//}
public ManageFooterPage edit()
{
	edit.click();
	return this;
}

public ManageFooterPage addressMethod(String address)
{
	addressField.clear();
	addressField.sendKeys(address);
	return this;

}
public ManageFooterPage emailFieldMethod(String email)
{
	emailField.clear();
	emailField.sendKeys(email);
	return this;
}
public ManageFooterPage phoneFieldMethod(String num)
{
	phoneField.clear();
phoneField.sendKeys(num);
return this;	
}
public ManageFooterPage updateMethod()
{
update.click();
return this;	
}
public boolean alert()
{
	return alert.isDisplayed();

}

public ManageFooterPage isUpadateButtonDisplayed()
{
	if(update.isDisplayed()) {
		System.out.println("update button is displayed");
	}
	else
	{
		System.out.println("update button is not displayed");	
	}
	return this;

}
}

