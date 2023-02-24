package tek.sdet.framework.steps;

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
	
	
	
	@When("User click on Account option")
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
	  
		 
		 
		 
	 }
	 @When("User click add address button")
	 public void userClickAddAddressButton() {
    click(factory.accountPage().addressSubmitButton);
    logger.info("User clicked add address button");

	 }
	 @Then("a message should be displayed {string}")
	 public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().addressMessageSuccessfull) ;
	  Assert.assertEquals(factory.accountPage().addressMessageSuccessfull,string);  
	  
	 }



	 
	 
}	
	
	

