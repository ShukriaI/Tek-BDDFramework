package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

//	@FindBy(xpath="//img[@id='profileImage']")
//	   public WebElement imageInput;

	@FindBy(css = " #nameInput")
	public WebElement updateName;

	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement updatPhoneNumber;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updateBtn;

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement imageInput;

	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressBtn;

	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement countryDropDown;

	@FindBy(css = " #fullNameInput")
	public WebElement addressNameInput;

	@FindBy(css = "#phoneNumberInput")
	public WebElement addressPhoneNumber;

	@FindBy(xpath = "//input[@id='streetInput']")
	public WebElement streetAddressOption;

	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentAddressInput;

	@FindBy(css = "#cityInput")
	public WebElement addressCityInput;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateAddressInput;

	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement addressZipCodeInput;

	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement addressSubmitButton;

	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressMessageSuccessfull;

}
