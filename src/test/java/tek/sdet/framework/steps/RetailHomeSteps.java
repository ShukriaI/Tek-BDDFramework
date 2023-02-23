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
	   
		List<WebElement> ActualSideBar = factory.homePage().sidebarAllListDepartment;
		
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
	    List<WebElement> sideBarOptions= factory.homePage().sidebarAllListDepartment;
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
	   List<WebElement> actualDepartmentOption = factory.homePage().sidebarAllListDepartment;
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

	
	
	
	
}
