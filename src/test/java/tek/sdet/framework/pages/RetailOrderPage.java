package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(xpath="(//p[contains(text(),'Show Details')])[1]")
	public WebElement firstOrderclick;
	
	@FindBy(xpath="(//button[@id='cancelBtn'])[1]")
	public WebElement theOrderCancel;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement cancellationReason;
	
	@FindBy(css="#orderSubmitBtn")
	public WebElement submitOrderCancellation;
	
	@FindBy(xpath="//p[contains(text(),'Your Order Has Been Cancelled')]")
	
	public WebElement confirmationMessage;
	
	
	
	
	
	
	
	
	
	
}
