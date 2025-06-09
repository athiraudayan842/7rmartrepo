package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement adminField;
	@FindBy(xpath = "//a[contains(@href,'.com/admin/logout') and @class='dropdown-item']")
	WebElement logoutField;
	@FindBy(xpath = "//a[contains(@href,'uniqassosiates.com/admin/list-admin')and @class='small-box-footer']")
	WebElement moreinfoAdmin;
	@FindBy(xpath = "//a[contains(@href,'uniqassosiates.com/admin/list-contact')]")
	WebElement moreinfoManageContact;
	@FindBy(xpath = "//a[contains(@href,'uniqassosiates.com/admin/list-news')]")
	WebElement moreinfoManageNews;
	@FindBy(xpath = "//a[contains(@href,'uniqassosiates.com/admin/list-category')]")
	WebElement moreinfomanagecategory;
	@FindBy(xpath = "//a[contains(@href,'uniqassosiates.com/admin/list-footertext')]")
	WebElement moreinfomanagefooter;

	public ManageContactPage moreInfoManageContact() {
		moreinfoManageContact.click();
		return new ManageContactPage(driver);
	}

	public ManageNewsPage moreInfoManageNews() {
		moreinfoManageNews.click();
		return new ManageNewsPage(driver);
	}

	public AdminUserPage moreInfoAdminUser() {
		moreinfoAdmin.click();
		return new AdminUserPage(driver);
	}

	public ManageCategoryPage moreInfoManageCategory() {
		moreinfomanagecategory.click();
		return new ManageCategoryPage(driver);
	}

	public ManageFooterPage moreInfoManageFooter() {
		moreinfomanagefooter.click();
		return new ManageFooterPage(driver);
	}

	public void clickAdmin() {

		adminField.click();
	}

	public void clickLogout() {

		logoutField.click();
	}
}
