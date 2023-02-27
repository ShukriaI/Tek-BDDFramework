package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement orderButtonClick;
	
	@FindBy(xpath="(//p[contains(text(),'Show Details')])[1]")
	public WebElement firstOrderclick;
	
	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement cancelOrderButton;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement cancellationReason;
	
	@FindBy(css="#orderSubmitBtn")
	public WebElement submitOrderCancellation;
	
	@FindBy(xpath="//p[contains(text(),'Your Order Has Been Cancelled')]")
	
	public WebElement confirmationMessage;
	
	
	//Order second Scenario
	
	
	@FindBy(xpath="//button[@id='returnBtn']")
	public WebElement returnOrderButton;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement returnReasonButton;
	
	@FindBy(xpath="//select[@id='dropOffInput']")
	public WebElement returnDropOffLocation;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement returnSubmitButton;
	
	@FindBy(xpath="//p[contains(text(),'Return was successfull')]")
	public WebElement returnSuccessfullMessage;
	
	//Third scenario of order
	
	
	@FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement reviewButton;
	
	@FindBy(xpath="//input[@id='headlineInput']")
	public WebElement headlineMessageInput;
	
	@FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement descriptionMessageInput;
	
	@FindBy(xpath="//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmitButton;
	
	
	@FindBy(xpath="//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewSuccessfullMessage;
	
	
	@FindBy(xpath="//button[@id='buyAgainBtn']")
	public WebElement buyAgainButton;
	
	@FindBy(css="#placeOrderBtn")
	public WebElement placeYourOrderBtnAgain;
	
	@FindBy(xpath="(//p[text()='Show Details'])[2]")
	public WebElement secondItemOrder;
	
	
	
}
