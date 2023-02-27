package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	//1. This is my first scenario from order page
	@When("User click on order section")
	public void userClickOnOrderSection() {
	click(factory.orderPage().orderButtonClick);	
	logger.info("User clicked on order section");


	}
	
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
   click(factory.orderPage().firstOrderclick);
   logger.info("User clicked on first order in list");

	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	click(factory.orderPage().cancelOrderButton);
	logger.info("User clicked on Cancel The Order button");


	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String stringMessageValue) {
    selectByVisibleText(factory.orderPage().cancellationReason, stringMessageValue);
    logger.info("User selected the cancelation Reason"+ stringMessageValue);

	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().submitOrderCancellation);
		logger.info("User clicked on Cancel Order button");


	}
	@Then("A cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
    Assert.assertEquals(string, factory.orderPage().confirmationMessage.getText());
    logger.info("cancellation messager was displayed"+ string);

	}

   // 2. this is the second scenario of my Order page.
	
	@When("User click on Return items button")
	public void userClickOnReturnItemsButton() {
    click(factory.orderPage().returnOrderButton);
    logger.info("User clicked on return order button");

	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String stringValue) {
    selectByVisibleText(factory.orderPage().returnReasonButton, stringValue);
    logger.info("User selected the return reason");

	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String stringValueDropOff) {
     selectByVisibleText(factory.orderPage().returnDropOffLocation, stringValueDropOff);
     logger.info("User selected the drop off sercive");

	}
	@When("User click on return Order button")
	public void userClickOnReturnOrderButton() {
    click(factory.orderPage().returnSubmitButton);
    logger.info("User clicked on return order button");

	}
	@Then("Cancelation message should be displayed {string}")
	public void cancelationMessageShouldBeDisplayed(String string) {
    Assert.assertEquals(string,factory.orderPage().returnSuccessfullMessage.getText());
    logger.info("Cancellation message was displayed");
    

	}


   // Third scenario of my order page
	
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
    click(factory.orderPage().reviewButton);
    logger.info("User clicked on review button");

	}
	@When("User write Review headline")
	public void userWriteReviewHeadline(DataTable dataTable) {
	 List<Map<String,String>> reviewHeadline = dataTable.asMaps(String.class,String.class);
	 sendText(factory.orderPage().headlineMessageInput,reviewHeadline.get(0).get("headline"));
	 sendText(factory.orderPage().descriptionMessageInput, reviewHeadline.get(0).get("review standard message"));
	 logger.info("User wrote Review HeadLine and Discription");
		
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
    click(factory.orderPage().reviewSubmitButton);
    logger.info("User clicked on add review button");

	}
	@Then("A review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String stringReviewMessage) {
		waitTillPresence(factory.orderPage().reviewSuccessfullMessage);
    Assert.assertEquals(stringReviewMessage,factory.orderPage().reviewSuccessfullMessage.getText());
    logger.info("A review was displayed on the screen "+stringReviewMessage);

	}

	@When("User click on buy again button")
	public void userClickOnBuyAgainButton() {
		waitTillClickable(factory.orderPage().buyAgainButton);
    click(factory.orderPage().buyAgainButton);
    logger.info("User clicked on buy again button");

	}

	@Then("User click on place your order")
	public void userClickOnPlaceYourOrder() {
		waitTillClickable(factory.orderPage().placeYourOrderBtnAgain);
    click(factory.orderPage().placeYourOrderBtnAgain);
    logger.info("User clicked on place your order button");

	}


	@When("User click on Second order in list")
	public void userClickOnSecondOrderInList() {
   click(factory.orderPage().secondItemOrder);
   logger.info("User clicked on second order");

	}


}
