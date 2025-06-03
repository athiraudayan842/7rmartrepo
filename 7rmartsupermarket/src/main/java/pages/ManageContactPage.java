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
	
	@FindBy(xpath="//a[contains(@href,'uniqassosiates.com/admin/list-contact')]")WebElement moreinfo;
	
    @FindBy(xpath="//a[@role='button']")WebElement editField;
    
    @FindBy(xpath="//input[@id='phone']")WebElement phoneField;
    
    @FindBy(xpath="//input[@id='email']")WebElement emailField;
 
    @FindBy(xpath="//textarea[@id='content' and @name='address']")WebElement addressField;
 
    @FindBy(xpath="//textarea[@id='content' and @name='del_time']")WebElement deliverytimeField;
    
    @FindBy(xpath="//input[@id='del_limit']")WebElement deliverychargelimitField;
    
    @FindBy(xpath="//button[@name='Update']")WebElement update;
    
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
    
    
   
    
	public void moreInfo()
    {
    	moreinfo.click();
    }

    public void editMethod()
    {
    editField.click();	
    }
    public void phoneFieldMethod(String num)
    {
    	phoneField.clear();
    phoneField.sendKeys(num);	
    }

    public void emailFieldMethod(String email)
    {
    	emailField.clear();
    	emailField.sendKeys(email);
    }
    public void addressMethod(String address)
    {
    	addressField.clear();
    	addressField.sendKeys(address);
    }
    public void deliveryTimeMethod(String deliverytime)
    {
    	deliverytimeField.clear();
    	deliverytimeField.sendKeys(deliverytime);
    }
    public void deliveryChargeTime(String deliverychargelimit)
    {
    	deliverychargelimitField.clear();
    	deliverychargelimitField.sendKeys(deliverychargelimit);	
    }
   public void updateMethod()
   {
	   //WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(update));//explicit wait 
	   Actions actions=new Actions(driver);//action class
	   actions.click(update).build().perform();
	//update.click();   
   }
    
    
    public boolean alert()
    {
    	return alert.isDisplayed();

    }
} 
    
    
    
    

