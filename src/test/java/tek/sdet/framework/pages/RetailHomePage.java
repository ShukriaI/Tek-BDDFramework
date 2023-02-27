package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}
	/*
	 * Syntax for finding UI element and storing them in POM classes
	 * 
	 * @FindBy(locatorType="value")
	 * 
	 */

	@FindBy(xpath = "//a[contains(text(),'TEKSCHOOL')]")
	public WebElement tekSchoolLogo;

	@FindBy(xpath = "//select[@id='search']")
	public WebElement allDepartmentSerach;

	@FindBy(css = "#searchInput")
	public WebElement searchBar;

	@FindBy(linkText = "Sign in")
	public WebElement signInButton;

	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton;

	@FindBy(xpath = " //a[@id='orderLink']")
	public WebElement orderButton;

	@FindBy(xpath = "//a[@id='signinLink']")
	public WebElement homePageSingInBtn;

	@FindBy(xpath = "//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement KasaOutDoorSmartPlug;

	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement cartKasaItemQuantity;

	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addToCartButton;

	@FindBy(id = "cartBtn")
	public WebElement cartButtonOption;

	@FindBy(xpath = "//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;

	@FindBy(css = "#accountLink")
	public WebElement accountOption;

	@FindBy(xpath = "//span[contains(text(),'All')]")
	public WebElement sidebarAllButton;

	@FindBy(xpath = "//span[@class='top-nav__cart-quantity' and text()='2']")
	public WebElement cartIconQuantity;

	@FindBy(xpath = "//div[@class='sidebar__content']//span")
	public List<WebElement> sidebarAllDepartment;

	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	public WebElement electronics;

	@FindBy(xpath = "//span[contains(text(),'Computers')]")
	public WebElement computers;

	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement smartHome;

	@FindBy(xpath = "//span[contains(text(),'Sports')]")
	public WebElement sports;

	@FindBy(xpath = "//span[contains(text(),'Automative')]")
	public WebElement automative;

	@FindBy(xpath = "//div[@class='top-nav__btn top-nav__cart']")
	public WebElement cartButtonClickToBuy;

	@FindBy(id = "proceedBtn")
	public WebElement proceedCheckOutCartButton;

	@FindBy(id = "placeOrderBtn")
	public WebElement placeNewAddressButton;

	@FindBy(css = "#countryDropdown")
	public WebElement countryDropDownButton;

	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement placeNewCardPayment;

	@FindBy(css = "#placeOrderBtn")
	public WebElement placeYourOrderButton;

	@FindBy(xpath = "//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedSuccess22fully;

	@FindBy(xpath = "//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexItemClick;

	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement quantityApexItem;

	@FindBy(xpath = "//span[@id='cartQuantity' and text()='2']")
	public WebElement cartQuantity5Items;

	@FindBy(xpath = "//img[@class='image']")
	public WebElement apexSecondOrder;

	@FindBy(xpath="//select[@id='search']")
	public WebElement allCategoryChangeButton;
	
	@FindBy(xpath="//input[@id='searchInput']")
	public WebElement searchBarButton;
	
	@FindBy(xpath="//button[@id='searchBtn']")
	public WebElement searchClickButton;
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement itemXpath;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement itemQuantitybutton;
	
	@FindBy(xpath = " //span[contains(text(),'Add to Cart')]")
	public WebElement addtoCartClickButton;
	
	@FindBy(id="addressBtn")
	public WebElement addAddressButtonOrder;
	@FindBy(css="#cartQuantity")
	public WebElement cartQuantityAssetionBtn;
	
	@FindBy(xpath="//div[@id='cartBtn']")
	public WebElement cartBtnClickToProceed;
	
	@FindBy(xpath="//button[@id='proceedBtn']")
	public WebElement proceedToCheckOutBtn;
	
	@FindBy(xpath="//button[@id='addAddressBtn']")
	public WebElement orederWithNewAddressLink;
	
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement addPaymentMethodLink;
	
	@FindBy(xpath="//button[@id='placeOrderBtn']")
	public WebElement placeYourOrderButton1;
	
	@FindBy(xpath="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedMessage;
	
	
	@FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendXpath;
	
	
	@FindBy(xpath="//span[text()='Delete']")
    public WebElement deleteItemFromCart;
	
	@FindBy(xpath="//h1[contains(text(),'Your Shopping Cart is Empty')]")
	public WebElement emptyShoppingCart;
	
	
	
	
	
	
}
