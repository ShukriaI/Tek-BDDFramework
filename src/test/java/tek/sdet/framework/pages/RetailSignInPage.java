package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
	PageFactory.initElements(getDriver(), this);
	
	
	/*we are implementing PageFactory class to initialize the UI Elements using
	 * initElements method of PageFactory class this method accepts two parameters 
	 * first one is driver method() and second one is This keyword which refers to the 
	 * variable of the class in this case we are referring to UI element that will store in this class
	 * 
	 * 
	 */
	}
	@FindBy(xpath="//h1[text()='Sign in']")
	public WebElement signPageLogo;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement loginPageButton;
	
	@FindBy(linkText="Create New Account")
	public WebElement creatNewAccountButton;
	
	@FindBy(id="newCompanyAccount")
	public WebElement wantToSellSomethingLink;
	
	@FindBy(id="loginBtn")
	public WebElement lognInBtn;
	
	@FindBy(css="#newAccountBtn")
	public WebElement newAccountBtn;
	
	
	@FindBy(css="input[id=nameInput]")
	public WebElement nameField;
	
	
	@FindBy(css="#emailInput")
	public WebElement emailInput;
	
	
	@FindBy(xpath="//input[@id='passwordInput']")
	public WebElement passwordInput;
	
	
	@FindBy(css="#confirmPasswordInput")
	public WebElement confirmPassword;
	
	
	@FindBy(xpath="//button[@class='signup__btn']")
	public WebElement signUpBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
