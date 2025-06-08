package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class ManageNewsPage  {
public WebDriver driver;
public ManageNewsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


//@FindBy(xpath="//a[contains(@href,'niqassosiates.com/admin/list-news')]")WebElement moreinfo;

@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newField;

@FindBy(xpath="//textarea[@id='news']")WebElement textField;

@FindBy(xpath="//button[text()='Save']")WebElement saveField;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertField;

@FindBy(xpath="//a[contains(@href,'/admin/news/delete') and contains(@class,'btn-danger')]")WebElement delete;

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement deletealert;


//public void moreInfo()
//{
	//moreinfo.click();
//}

public ManageNewsPage newMethod()
{
newField.click();
return this;	
}
public ManageNewsPage textFieldMethod(String news)
{
textField.sendKeys(news);
return this;	
}

public ManageNewsPage save()
{
	saveField.click();
	return this;
}
public boolean isAlertDisplayed()
{
	return alertField.isDisplayed();

}

public ManageNewsPage isSaveButtonDisplayed()
{
	if(saveField.isDisplayed()) {
		System.out.println("save button is displayed");
	}
	else
	{
		System.out.println("save button is not displayed");	
	}
	return this;
}
public ManageNewsPage deleteMethod()
{
delete.click();
return this;	
}
public boolean deleteAlert()
{
	
	driver.switchTo().alert().accept();
	return deletealert.isDisplayed();
}
}
