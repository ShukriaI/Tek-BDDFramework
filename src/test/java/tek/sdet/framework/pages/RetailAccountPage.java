package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;


public class RetailAccountPage  extends BaseSetup{

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
//	@FindBy(xpath="//img[@id='profileImage']")
//	   public WebElement imageInput;
	
	
	
	@FindBy(css=" #nameInput")
	public WebElement updateName;
	
	
	
	@FindBy(xpath="//input[@id='personalPhoneInput']")
	public WebElement updatPhoneNumber;
	
	
	
	
	@FindBy(xpath="//button[text()='Update']")
	public WebElement updateBtn;
	
	
	
	@FindBy(xpath="//img[@id='profileImage']")
	   public WebElement imageInput;
	
	
   
	
	
	
	
	
	
	
	
	
	
}
