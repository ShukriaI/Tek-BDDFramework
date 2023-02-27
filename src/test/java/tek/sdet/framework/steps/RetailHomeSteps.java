package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplyed(factory.homePage().tekSchoolLogo));
		logger.info("User is on retail website");
		logger.info("Actual Title "+ actualTitle + "Equals" + " ExpectedTitle " + expectedTitle);
		
		
	}
	
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar,productValue);
		click(factory.homePage().searchButton);
		logger.info("user search for product "+productValue);
	}
	
	
	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
	Assert.assertTrue(isElementDisplyed(factory.homePage().pokemanProductImage));	
	logger.info("the product is displayed on home page");
	}
	
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	    click(factory.homePage().sidebarAllButton);
	    logger.info("User clicked on All section");
	}

	
	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);
	   
		List<WebElement> ActualSideBar = factory.homePage().sidebarAllDepartment;
		
		for(int i=0; i<expectedSideBar.get(0).size();i++) {
			Assert.assertEquals(ActualSideBar.get(i).getText(),expectedSideBar.get(0).get(i));
			logger.info(ActualSideBar.get(i).getText()+" : is eqaul to: "+expectedSideBar.get(0).get(i));
			
		}
	}
//      Assert.assertEquals(expectedSideBar.get(0).get(0),factory.homePage().electronics.getText());
//      Assert.assertEquals(expectedSideBar.get(0).get(1),factory.homePage().computers.getText());
//      Assert.assertEquals(expectedSideBar.get(0).get(2),factory.homePage().smartHome.getText());
//      Assert.assertEquals(expectedSideBar.get(0).get(3),factory.homePage().sports.getText());
//      Assert.assertEquals(expectedSideBar.get(0).get(4),factory.homePage().automative.getText());
//      logger.info("the actual is equal to expected");    
//	}
//	
	@When("User is on {string}")
	public void userOnElectrinocs(String department) {
	    List<WebElement> sideBarOptions= factory.homePage().sidebarAllDepartment;
	      for(WebElement option:sideBarOptions) {
              if(option.getText().equals(department)) {
        	 click(option);
        	 try {
        	 logger.info(option.getText()+"user was on all department");
        	 }  catch (StaleElementReferenceException e) {	 
        	 }
        	 break;
         }
	}
	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	   List<List<String>> expectedDepartmentOption = dataTable.asLists(String.class);
	   List<WebElement> actualDepartmentOption = factory.homePage().sidebarAllDepartment;
	   for(int i =0; i<expectedDepartmentOption.get(0).size();i++) {
		   for(WebElement dept:actualDepartmentOption) {
			   if(dept.getText().equals(expectedDepartmentOption.get(0).get(i))) {
				   
				   Assert.assertTrue(isElementDisplyed(dept));
				   logger.info(dept.getText()+"(Is present)");
				   break;
			   }
		   }
	   }
	}
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String stringCatValue) {
	  selectByVisibleText(factory.homePage().allCategoryChangeButton, stringCatValue); 
	logger.info("User changed the category to Smart Home");
		
		
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String stringItemValue) {
   sendText(factory.homePage().searchBarButton, stringItemValue);
  logger.info("User searched for an item"+ stringItemValue);
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	  click(factory.homePage().searchClickButton);
	  logger.info("User clicked on Search icon");
	}
	
	@When("User click on item")
	public void userClickOnItem() {
   click(factory.homePage().itemXpath);
    logger.info("User clicked on item to search it");
	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String stringItemQuantity) {
    selectByValue(factory.homePage().itemQuantitybutton, stringItemQuantity);
    
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
   click(factory.homePage().addtoCartClickButton);
   logger.info("User added items on the cart");

	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		if(!factory.homePage().cartQuantityAssetionBtn.getText().equals(string)) {
			
			click(factory.homePage().cartButtonOption);
			click(factory.homePage().deleteItemFromCart);
		    logger.info("The cart category changed to");
			if(factory.homePage().cartQuantityAssetionBtn.getText().equals(string)) {
    Assert.assertEquals(string, factory.homePage().cartQuantityAssetionBtn.getText());
		}
	}
	}
	
	
	@When("User click on the item")
	public void userClickOnTheItem() {
	click(factory.homePage().apexLegendXpath);
	logger.info("User clicked on the item");
	}

	@When("User Click On item")
	public void UserClickOnItem() {
	   click(factory.homePage().itemXpath);
	   logger.info("User clicked on Item");
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
    click(factory.homePage().cartButtonOption);
    logger.info("User clicked on Cart Option");

	}
	@Then("User click on proceed to checkout button")
	public void userClickOnProceedToCheckoutButton() {
    click(factory.homePage().proceedToCheckOutBtn);
    logger.info("User clicked on proceed to check out");
	}
	
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
      click(factory.homePage().orederWithNewAddressLink);
     logger.info("User clicked on new address link");
	}
	@Then("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
       click(factory.homePage().addAddressButtonOrder);
       logger.info("User clicked add your address button");

	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
      click(factory.homePage().addPaymentMethodLink);
      logger.info("User clicked on add payment method");
	}


	@Then("User click on add your card button")
	public void userClickOnAddYourCardButton() {
     click(factory.accountPage().paymentSubmitBtnAddCard);
     logger.info("User added the cart to the account");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
      click(factory.homePage().placeYourOrderButton);
      logger.info("User placed the order");
      
	}
	@Then("a Message Should be Displayed For order purpose {string}")
	public void aMessageShouldBeDisplayedForOrderPurpose(String stringValue) {
     Assert.assertEquals(stringValue, factory.homePage().orderPlacedMessage.getText());
     logger.info("Message was displayed Thank you for shopping");
	}




	
	
}
