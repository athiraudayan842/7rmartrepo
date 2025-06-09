package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {

	public WebDriver driver;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="//a[contains(@href,'uniqassosiates.com/admin/list-category')]")WebElement
	// moreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newField;
	@FindBy(xpath = "//input[@type='text']")
	WebElement categoryField;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement groupField;
	@FindBy(xpath = "//input[@id='main_img']")
	WebElement image;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	// public void moreInfo()
	// {
	// moreinfo.click();
	// }
	public ManageCategoryPage newMethod() {
		newField.click();
		return this;
	}

	public ManageCategoryPage categoryMethod(String product) {
		categoryField.sendKeys(product);
		return this;
	}

	public ManageCategoryPage groupMethod() {
		groupField.click();
		return this;
	}

	public ManageCategoryPage imageMethod() throws AWTException {
		PageUtility pageutility = new PageUtility();
		pageutility.clickElement(driver, image);

		// Actions actions=new Actions(driver);
		// actions.click(image).build().perform();
		// StringSelection file = new
		// StringSelection("C:\\Users\\Admin\\Desktop\\rice.jpg");
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		// Robot robot = new Robot();
		// robot.delay(250);
		// robot.keyPress(KeyEvent.VK_CONTROL);
		// robot.keyPress(KeyEvent.VK_V);
		// robot.keyRelease(KeyEvent.VK_V);
		// robot.keyRelease(KeyEvent.VK_CONTROL);
		// robot.keyPress(KeyEvent.VK_ENTER);
		// robot.keyRelease(KeyEvent.VK_ENTER);
		
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.fileuploadUsingRobertClass(image,Constant.IMAGEFILE);
		return this;
	}

	public ManageCategoryPage saveMethod() {
		// save.click();
		// Actions actions=new Actions(driver);
		// actions.click(save).build().perform();
		PageUtility page = new PageUtility();
		page.clickElement(driver, save);
		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();

	}
}
