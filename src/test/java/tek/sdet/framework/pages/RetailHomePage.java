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
	
	
	
}
