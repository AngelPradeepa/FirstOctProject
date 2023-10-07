package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPack.MyAccountScreenPageFactory;

public class MyAccountScreenSteps extends MyAccountScreenPageFactory{
	@Given("user launch the nopcommerce website")
	public void user_launch_the_nopcommerce_website() {
		
		initializeDriver();
		browserlaunch("https://demo.nopcommerce.com/");
		PageFactory.initElements(driver, MyAccountScreenSteps.class);
		
	}

	@When("user click the myaccount link on footer")
	public void user_click_the_myaccount_link_on_footer() {
//		scrollByElement(lnk_Myaccount);
		clickMethod(lnk_Myaccount);
	}

	@Then("user verify that {string} heading is displayed on the page")
	public void user_verify_that_heading_is_displayed_on_the_page(String pageHeading) {
	    
		String MyAccountpageHeading = txt_MyaccountPageHeading.getText();
		Assert.assertEquals(pageHeading, MyAccountpageHeading);
	}

	@Then("user verify that Email input box is displayed on the My account page")
	public void user_verify_that_email_input_box_is_displayed_on_the_my_account_page() {
	   
		Assert.assertTrue(txt_email.isDisplayed());
	}

	@Then("user verify that password input box is displayed on the My account page")
	public void user_verify_that_password_input_box_is_displayed_on_the_my_account_page() {
	   
		Assert.assertTrue(txt_Password.isDisplayed());
	}

	@Then("user verify that remember me check box is displayed on the My account page")
	public void user_verify_that_remember_me_check_box_is_displayed_on_the_my_account_page() {
	   
		Assert.assertTrue(cbk_RememberMe.isDisplayed());
	}

	@Then("user verify that forgot password link is displayed on the My account page")
	public void user_verify_that_forgot_password_link_is_displayed_on_the_my_account_page() {
	 
		Assert.assertTrue(lnk_ForgotPassword.isDisplayed());
	}

	@Then("user verify that login button is displayed on the My account page")
	public void user_verify_that_login_button_is_displayed_on_the_my_account_page() {
	    
		Assert.assertTrue(btn_login.isDisplayed());
	}

	@When("user enters the invalid {string} and {string}")
	public void user_enters_the_invalid_and(String username, String password) {
	    
		sendKeys(txt_email, username);
		sendKeys(txt_Password, password);
	}

	@When("user click the login button")
	public void user_click_the_login_button() {
	   
		clickMethod(btn_login);
	}

	@Then("user verify the error {string} message has been displayed below the email input box field")
	public void user_verify_the_error_message_has_been_displayed_below_the_email_input_box_field(String errormsg) {
	   
			Assert.assertEquals(txt_emailErrorMsg.getText(), errormsg);
	}

	@When("user enters the valid and unregistered {string} and {string}")
	public void user_enters_the_valid_and_unregistered_and(String username, String password) {
	    
		sendKeys(txt_email, username);
		sendKeys(txt_Password, password);
	}

	@Then("user verify the error message {string} has been displayed on the page")
	public void user_verify_the_error_message_has_been_displayed_on_the_page(String errormsg) {
	    System.out.println(errormsg);
	    System.out.println(txt_ErrorMessage.getText());
		Assert.assertEquals(txt_ErrorMessage.getText(), errormsg);
	}
	
}
