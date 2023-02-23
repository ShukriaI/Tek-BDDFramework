package tek.sdet.framework.steps;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
    POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
    click(factory.homePage().signInButton);
    logger.info("User click on Sign in option");

	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passworValue) {
    sendText(factory.signInPage().emailField,emailValue);
    sendText(factory.signInPage().passwordField,passworValue);
    logger.info("User entered email "+emailValue+" and password "+passworValue);

	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
    click(factory.signInPage().loginPageButton);
    logger.info("User click on login button");
    

	}

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().creatNewAccountButton);
		logger.info("User click on Create New Account button");
	   
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
	List<Map<String,String>> signUpInformation = dataTable.asMaps(String.class, String.class);	
	sendText(factory.signInPage().nameField,signUpInformation.get(0).get("name"));
	sendText(factory.signInPage().emailInput,signUpInformation.get(0).get("email"));
	sendText(factory.signInPage().passwordInput,signUpInformation.get(0).get("password"));
	sendText(factory.signInPage().confirmPassword,signUpInformation.get(0).get("confirmPassword"));
	logger.info("user filled the signUp information form");

	  
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
	click(factory.signInPage().signUpBtn);
	logger.info("user clicked on signUp button");
		
	}
 
	@Then("User should be logged in into Account page")
	public void userShouldBeLoggedInIntoAccountPage() {
	 Assert.assertTrue(isElementDisplyed(factory.homePage().accountOption));
	
 
}
	
	
	
}	
	
	
	
	