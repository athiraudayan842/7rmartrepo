package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	public void selectByIndex(WebElement element, int Index) {
		Select select = new Select(element);
		select.selectByIndex(Index);
	}

	public void selectByValue(WebElement element, String Value) {
		Select select = new Select(element);
		select.selectByValue(Value);
	}

	public void clickElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void sendKeys(WebDriver driver, WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='value';", element);

	}

	public void scroll(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}

	public void dragAndDrop(WebDriver driver, WebElement element1, WebElement element2)

	{

		Actions actions = new Actions(driver);

		actions.dragAndDrop(element1, element2).build().perform();

	}

	public void rightClick(WebDriver driver, WebElement element1)

	{

		Actions actions = new Actions(driver);

		actions.contextClick(element1).build().perform();

	}

	public void mouseHover(WebDriver driver, WebElement element1)

	{

		Actions actions = new Actions(driver);

		actions.moveToElement(element1).build().perform();

	}

	public void doubleClick(WebDriver driver, WebElement element1)

	{

		Actions actions = new Actions(driver);

		actions.doubleClick(element1).build().perform();

	}
}
