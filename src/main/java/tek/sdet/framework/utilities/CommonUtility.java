package tek.sdet.framework.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;
import tek.sdet.framework.base.BaseSetup;

public class CommonUtility extends BaseSetup {
//this constructor is to wait for the webDriver 

	
	public WebDriverWait getWait() {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20));

// this wait is specific for the element 
	}

	public WebElement waitTillClickable(WebElement element) {
		return this.getWait().until(ExpectedConditions.elementToBeClickable(element));

	}

	public WebElement waitTillClickable(By by) {
		return this.getWait().until(ExpectedConditions.elementToBeClickable(by));
	}

	public WebElement waitTillPresence(WebElement element) {

		return this.getWait().until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement waitTillPresence(By by) {
		return this.getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public WebElement waitTillElementIsNotPresence(WebElement element) {
		return this.getWait().until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	public void click(WebElement element) {
		this.waitTillClickable(element).click();
	}

	public void sendText(WebElement element, String value) {
		this.waitTillPresence(element).sendKeys(value);
	}

	public String getElementText(WebElement element) {
		return this.waitTillPresence(element).getText();
	}

	public byte[] takeScreenShotAsBytes() {
		return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
	}

	public void click(By by) {
		waitTillClickable(by).click();
	}

	public void sendText(By by, String value) {
		this.waitTillPresence(by).sendKeys(value);
	}

	public String getElementText(By by) {
		return this.waitTillPresence(by).getText();
	}

	public String getTitle() {
		String title = getDriver().getTitle();
		return title;
	}

	public void sendValueUsingJS(WebElement element, String value) {
		JavascriptExecutor executor = ((JavascriptExecutor) getDriver());
		executor.executeScript("arguments[0].value='" + value + "';", element);
	}

	public void clearTextUsingSendKyes(WebElement toClear) {
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);

	}

	public void clearText(WebElement element) {
		this.waitTillPresence(element).clear();
	}

	public void clearText(By by) {
		this.waitTillPresence(by).clear();

	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deSelectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.deselectByVisibleText(visibleText);
	}

	public String getAttribte(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public String getTagname(WebElement element) {
		return element.getTagName();

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void HighlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		js.executeScript("arguments[0].style.border='1px white'", element);

	}

	public void dragAndDropAction(WebElement elementToHover, WebElement elementToClick) {
		Actions action = new Actions(getDriver());
		action.dragAndDrop(elementToHover, elementToClick).build().perform();
	}

	public boolean isElementDisplyed(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isElementSelected(WebElement element) {
		if (element.isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public void moveToElementAction(WebElement elemenet) {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(elemenet);
		actions.build().perform();
	}

	public WebElement fluientWaitforElement(WebElement element, int timoutSec, int pollingSec) {
		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30)).ignoring(NoSuchElementException.class, TimeoutException.class)
				.ignoring(StaleElementReferenceException.class);
		for (int i = 0; i < 2; i++)
			fWait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public void switchwindow(String pageTitle) {
		String currentWindow = getDriver().getWindowHandle();
		Set<String> handles = getDriver().getWindowHandles();
		for (String windHandle : handles) {
			String currentWindowtitle = getDriver().switchTo().window(windHandle).getTitle();

			if (currentWindowtitle.equals(pageTitle)) {
				break;
			} else {
				getDriver().switchTo().window(currentWindow);
			}
		}
	}

	public void selectCalendarDateWithJS(String date, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) getDriver());
		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);
	}


	public void clearTextWithJS(String string) {
		JavascriptExecutor js = ((JavascriptExecutor) getDriver());
		js.executeScript(string);

	}

	public void scrollPageDownWithJS() {
		JavascriptExecutor js = ((JavascriptExecutor) getDriver());
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
