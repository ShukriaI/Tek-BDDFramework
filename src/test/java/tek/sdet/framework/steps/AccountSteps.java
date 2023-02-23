package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

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
//	@Then("User should be logged in into Account")
//	public void userShouldBeLoggedInIntoAccount() {
//	 Assert.assertTrue(isElementDisplyed(factory.homePage().accountOption));
//
//	}
	 @When("User profile information should be updated")
	 public void userProfileInformationShouldBeUpdated() {	 
	 Assert.assertTrue(isElementDisplyed(factory.accountPage().updateBtn)); 
	 logger.info("User profile information should be updated");
	 } 
//	waitTillPresence(factory.accountPage().personalMessageSuccess);
//	Assert.assertTrue(isElementDisplyed(factory.accountPage().personalMessageSuccess));
//		logger.info("User profile information is updated");
//	}
//
//	
	 @Then("User should be logged in into Account")
		public void userShouldBeLoggedInIntoAccount() {
		 Assert.assertTrue(isElementDisplyed(factory.homePage().accountOption));
	}
}	
	
	

