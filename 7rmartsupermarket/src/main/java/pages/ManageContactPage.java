package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageContactPage {

	public WebDriver driver;	
	
	   public ManageContactPage(WebDriver driver) {
		   this.driver=driver;
			PageFactory.initElements(driver, this);	
		}
	
	//@FindBy(xpath="//a[contains(@href,'uniqassosiates.com/admin/list-contact')]")WebElement moreinfo;
	
    @FindBy(xpath="//a[@role='button']")WebElement editField;
    
    @FindBy(xpath="//input[@id='phone']")WebElement phoneField;
    
    @FindBy(xpath="//input[@id='email']")WebElement emailField;
 
    @FindBy(xpath="//textarea[@id='content' and @name='address']")WebElement addressField;
 
    @FindBy(xpath="//textarea[@id='content' and @name='del_time']")WebElement deliverytimeField;
    
    @FindBy(xpath="//input[@id='del_limit']")WebElement deliverychargelimitField;
    
    @FindBy(xpath="//button[@name='Update']")WebElement update;
    
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
    

   
    
	//public void moreInfo()
    //{
    	//moreinfo.click();
    //}

    public ManageContactPage editMethod()
    {
    editField.click();
	return this;	
    }
    public ManageContactPage phoneFieldMethod(String num)
    {
    	phoneField.clear();
    phoneField.sendKeys(num);
	return this;	
    }

    public ManageContactPage emailFieldMethod(String email)
    {
    	emailField.clear();
    	emailField.sendKeys(email);
		return this;
    }
    public ManageContactPage addressMethod(String address)
    {
    	addressField.clear();
    	addressField.sendKeys(address);
		return this;
    }
    public ManageContactPage deliveryTimeMethod(String deliverytime)
    {
    	deliverytimeField.clear();
    	deliverytimeField.sendKeys(deliverytime);
		return this;
    }
    public ManageContactPage deliveryChargeTime(String deliverychargelimit)
    {
    	deliverychargelimitField.clear();
    	deliverychargelimitField.sendKeys(deliverychargelimit);
		return this;	
    }
   public ManageContactPage updateMethod()
   {
	   //WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(update));//explicit wait 
	   Actions actions=new Actions(driver);//action class
	   actions.click(update).build().perform();
	//update.click();   
	return this;
   }
    public boolean isAlertDisplayed()
    {
    	return alert.isDisplayed();

    }
} 
    
    
    
    

