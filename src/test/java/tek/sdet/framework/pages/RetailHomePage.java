package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	/*Syntax for finding UI element and storing them in POM classes 
	 * 
	 * @FindBy(locatorType="value")
	 * 
	 * */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css="#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath="//button[@id='searchBtn']")
	public WebElement searchButton;
	
	
	@FindBy(linkText="Sign in")
	public WebElement signInButton;
	
	@FindBy(id ="cartBtn")
    public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
    public WebElement pokemanProductImage;
	
	@FindBy(css="#accountLink")
	public WebElement accountOption;
	
	
	@FindBy(xpath="//span[contains(text(),'All')]")
	public WebElement sidebarAllButton;
	
	
	@FindBy(xpath="//div[@class='sidebar_content-item']//span")
	public List<WebElement> sidebarAllListDepartment;
	
	
	@FindBy(xpath="//span[contains(text(),'Electronics')]")
	public WebElement electronics;
	
	@FindBy(xpath= "//span[contains(text(),'Computers')]")
	public WebElement computers;
	
	@FindBy(xpath="//span[contains(text(),'Smart Home')]")
	public WebElement smartHome;
	
	@FindBy(xpath="//span[contains(text(),'Sports')]")
	public WebElement sports;
	
	@FindBy(xpath="//span[contains(text(),'Automative')]")
	public WebElement automative;
	
	@FindBy(xpath="//select[@id='search']")
	public WebElement allCategoryChangeButton;
	
	@FindBy(xpath="//input[@id='searchInput']")
	public WebElement searchBarButton;
	
	@FindBy(xpath="//button[@id='searchBtn']")
	public WebElement  searchClickButton;
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement itemXpath;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement itemQuantitybutton;
	
	@FindBy(xpath=" //span[contains(text(),'Add to Cart')]")
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
	public WebElement placeYourOrderButton;
	
	
	@FindBy(xpath="//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedMessage;
	
	
	@FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendXpath;
	
}
