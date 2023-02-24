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

	//this is the edit address locators
	@FindBy(xpath="//button[@class='account__address-btn'][1]")
	public WebElement addressEditButton;
	
	@FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressEdtieddButtonMessageSuccessfull;
	
	@FindBy(xpath="//input[@value='Anna Daive']")
	public WebElement editAddressNameInput;
	
	@FindBy(xpath="//input[@value='7038998850']")
	public WebElement addressEditPhoneInput;
	
	@FindBy(xpath="//input[@value='4654 Chantilly BLVD']")
	public WebElement addressStreetEditInput;
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement addressEditUpdateButton;
	//these are the remove address locators
	
	@FindBy(xpath="//button[@class='account__address-btn'][2]")
	public WebElement removeAddressButton;
	
	@FindBy(xpath="//p[text()='shukria iqbal']")
	public WebElement nameValidationInput;
	
	
	
}
