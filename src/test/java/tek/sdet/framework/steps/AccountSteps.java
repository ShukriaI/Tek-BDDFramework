package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	
	
	@When("User click on account option")
	public void userClickOnAccountOption() {
	    click(factory.homePage().accountOption);
	    logger.info("user clicked on Account option");
		
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearText(factory.accountPage().updateName);
		sendText(factory.accountPage().updateName, nameValue);
		clearText(factory.accountPage().updatPhoneNumber);
		sendText(factory.accountPage().updateName, phoneValue);
      logger.info("User filled the information form successfully");
	
		
	}
	

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		waitTillClickable(factory.accountPage().updateBtn) ;
		click(factory.accountPage().updateBtn);
		logger.info("User clicked on Update button");
	  
	}

	
	 @When("User profile information should be updated")
	 public void userProfileInformationShouldBeUpdated() {	 
	 Assert.assertTrue(isElementDisplyed(factory.accountPage().updateBtn)); 
	 logger.info("User profile information should be updated");
	 } 

	
	 
	 @Then("User should be logged in into Account")
		public void userShouldBeLoggedInIntoAccount() {
		 Assert.assertTrue(isElementDisplyed(factory.homePage().accountOption));
	}

	
	 
	 @When("User click on add address option")
	 public void userClickOnAddAddressOption() {
	    click(factory.accountPage().addAddressBtn);
	    logger.info("User clicked on add address option");
	    
	 }
	 @When("User fill new address form with below information")
	 public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	  List<Map<String,String>> addressInformation = dataTable.asMaps(String.class,String.class);
	  selectByVisibleText(factory.accountPage().countryDropDown,addressInformation.get(0).get("country"));
	  sendText(factory.accountPage().addressNameInput,addressInformation.get(0).get("FullName"));
	  sendText(factory.accountPage().addressPhoneNumber,addressInformation.get(0).get("PhoneNumber"));
	  sendText(factory.accountPage().streetAddressOption,addressInformation.get(0).get("StreetAddress"));
	  sendText(factory.accountPage().apartmentAddressInput,addressInformation.get(0).get("apt"));
	  sendText(factory.accountPage().addressCityInput,addressInformation.get(0).get("city"));
	  selectByVisibleText(factory.accountPage().stateAddressInput,addressInformation.get(0).get("state"));
     sendText(factory.accountPage().addressZipCodeInput,addressInformation.get(0).get("zipCode"));
		 logger.info("User filled new address form with below information");
		 
	 }
	 @When("User click add address button")
	 public void userClickAddAddressButton() {
    click(factory.accountPage().addressSubmitButton);
    logger.info("User clicked add address button");

	 }
	 @Then("a message should be displayed {string}")
	 public void aMessageShouldBeDisplayed(String messageValue) {
		waitTillPresence(factory.accountPage().addressMessageSuccessfull) ;
	  Assert.assertTrue(isElementDisplyed(factory.accountPage().addressMessageSuccessfull));  
	  logger.info("The successfull message was displayed"+messageValue);
	 }



	 
	 
}	
	
	

