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

public class AccountSteps extends CommonUtility {

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
		waitTillClickable(factory.accountPage().updateBtn);
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
    ///**this method needs to be fill for future purposes of adding the address**//
	@When("User fill new address form with below information")
	public void UserFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		  List<Map<String,String>> newAddressInformation = dataTable.asMaps(String.class,String.class);
		  selectByVisibleText(factory.accountPage().countryDropDown,newAddressInformation.get(0).get("Country"));
		  sendText(factory.accountPage().addressNameInput,newAddressInformation.get(0).get("Fullname"));
		  sendText(factory.accountPage().addressPhoneNumber,newAddressInformation.get(0).get("PhoneNumber"));
		  sendText(factory.accountPage().streetAddressOption,newAddressInformation.get(0).get("StreetAddress"));
		  sendText(factory.accountPage().apartmentAddressInput,newAddressInformation.get(0).get("Apt"));
		  sendText(factory.accountPage().addressCityInput,newAddressInformation.get(0).get("City"));
		  selectByVisibleText(factory.accountPage().stateAddressInput,newAddressInformation.get(0).get("State"));
		     sendText(factory.accountPage().addressZipCodeInput,newAddressInformation.get(0).get("ZipCode"));
			 logger.info("User filled new address form with below information");

	}


	@When("User click add address button")
	public void userClickAddAddressButton() {
		click(factory.accountPage().addressSubmitButton);
		logger.info("User clicked add address button");

	}

	@When("user fill edit address form with below information")
	 public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	  List<Map<String,String>> addressInformation = dataTable.asMaps(String.class,String.class);
	  selectByVisibleText(factory.accountPage().countryDropDown,addressInformation.get(0).get("country"));
	  clearTextUsingSendKyes(factory.accountPage().addressNameInput);
	  sendText(factory.accountPage().addressNameInput,addressInformation.get(0).get("FullName"));

	  clearTextUsingSendKyes(factory.accountPage().addressPhoneNumber);
	  sendText(factory.accountPage().addressPhoneNumber,addressInformation.get(0).get("phoneNumber"));
	  
	  clearTextUsingSendKyes(factory.accountPage().streetAddressOption);
	  sendText(factory.accountPage().streetAddressOption,addressInformation.get(0).get("streetAddress"));
	  
	  clearTextUsingSendKyes(factory.accountPage().apartmentAddressInput);
	  sendText(factory.accountPage().apartmentAddressInput,addressInformation.get(0).get("apt"));
	  
	  clearTextUsingSendKyes(factory.accountPage().addressCityInput);
	  sendText(factory.accountPage().addressCityInput,addressInformation.get(0).get("city"));
	  
	  selectByVisibleText(factory.accountPage().stateAddressInput,addressInformation.get(0).get("state"));
	  
	  clearTextUsingSendKyes(factory.accountPage().addressZipCodeInput);
     sendText(factory.accountPage().addressZipCodeInput,addressInformation.get(0).get("zipCode"));
		 logger.info("User filled edited address form with below information");
	}
	@Then("a message should be displayed {string}")
	public void MessageShouldBeDisplayed(String messageValue) {
		waitTillPresence(factory.accountPage().addressMessageSuccessfull);
		Assert.assertTrue(isElementDisplyed(factory.accountPage().addressMessageSuccessfull));
		logger.info("The successfull message was displayed" + messageValue);
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addressEditButton);
		logger.info("User clicked on edit address option");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().addressEditUpdateButton);
		logger.info("User clicked update Your Address button");
	}
	@Then("A message should be displayed {string}")
	public void AMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().addressEdtieddButtonMessageSuccessfull);
    Assert.assertTrue(isElementDisplyed(factory.accountPage().addressEdtieddButtonMessageSuccessfull));
     logger.info("A message was displayed"+string);
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	 click(factory.accountPage().removeAddressButton);   
	logger.info("User clicked on remove option of Address section");
		
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	waitTillPresence(factory.accountPage().addressValidationButton);
	Assert.assertTrue(isElementDisplyed(factory.accountPage().addressValidationButton));
	logger.info("Address details was removed");
	}
}
