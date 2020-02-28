package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.adidas.demoblaze.cucumberFramework.BasePage;

import Utils.Utilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DemoBlazePage;

public class DemoBlazePagestepDefinitions {

	private DemoBlazePage objDemoBlaze= DemoBlazePage.getInstance();
	public WebDriver driver = BasePage.getDriver();
	
	@Given("^DemoBlaze Web Page is opened$")
	public void demoblaze_Web_Page_is_opened() throws Throwable {
		driver.get(Utilities.getConfigValue("url"));
	    
	}

	@When("^I note down the price$")
	public void i_note_down_the_price() throws Throwable {
		objDemoBlaze.savePrice();
	}
	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws Throwable {
		objDemoBlaze.clickLink(arg1);
	    
	}

	@When("^I click on OK in alertbox$")
	public void i_click_on_OK_in_alertbox() throws Throwable {
		objDemoBlaze.acceptAlert();
	    
	}

	@When("^I go to Homepage$")
	public void i_go_to_Homepage() throws Throwable {
		objDemoBlaze.goToHomePage();
	}
	
	@When("^I delete \"([^\"]*)\"$")
	public void i_delete(String arg1) throws Throwable {
		objDemoBlaze.deleteProductFromCart(arg1);
	    
	}

	@When("^I Enter the name as \"([^\"]*)\"$")
	public void i_Enter_the_name_as(String arg1) throws Throwable {
		objDemoBlaze.enterName(arg1);
	    
	}

	@When("^I Enter the Country as \"([^\"]*)\"$")
	public void i_Enter_the_Country_as(String arg1) throws Throwable {
		objDemoBlaze.enterCountry(arg1);
	    
	}

	@When("^I Enter the City as \"([^\"]*)\"$")
	public void i_Enter_the_City_as(String arg1) throws Throwable {
		objDemoBlaze.enterCity(arg1);
	    
	}

	@When("^I Enter the Credit Card as \"([^\"]*)\"$")
	public void i_Enter_the_Credit_Card_as(String arg1) throws Throwable {
		objDemoBlaze.enterCreditCard(arg1);
	    
	}

	@When("^I Enter the Month as \"([^\"]*)\"$")
	public void i_Enter_the_Month_as(String arg1) throws Throwable {
		objDemoBlaze.enterMonth(arg1);
	    
	}

	@When("^I Enter the Year as \"([^\"]*)\"$")
	public void i_Enter_the_Year_as(String arg1) throws Throwable {
		objDemoBlaze.enterYear(arg1);
	    
	}

	@Then("^I capture the Purchase Id$")
	public void i_capture_the_Purchase_Id() throws Throwable {
		objDemoBlaze.printPurchaseId();
	    
	}

	@Then("^I capture the Amount$")
	public void i_capture_the_Amount() throws Throwable {
		objDemoBlaze.printAmount();
	    
	}

	@Then("^I validate the Amount should be correct$")
	public void i_validate_the_Amount_should_be_correct() throws Throwable {
		Assert.assertTrue(objDemoBlaze.validateAmount(), "Price is not displayed Correctly");
	    
	}

	@Then("^I click on button \"([^\"]*)\"$")
	public void i_click_on_button(String arg1) throws Throwable {
		objDemoBlaze.clinkButton(arg1);
	    
	}
}
