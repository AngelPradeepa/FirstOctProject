package steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactoryPack.RegistrationPageFactory;

public class RegistrationPageValidation extends RegistrationPageFactory{
	@Given("user launch the nopcommerce website")
	public void user_launch_the_nopcommerce_website() {
	   initializeDriver();
	   browserlaunch("https://demo.nopcommerce.com/");
	   PageFactory.initElements(driver, RegistrationPageValidation.class);
	}

	@When("user click the Register link on the nopcommerce web page")
	public void user_click_the_register_link_on_the_nopcommerce_web_page() {
	    clickMethod(register_link_clk);
	}

	@When("user verifies {string} heading is displayed in the page")
	public void user_verifies_heading_is_displayed_in_the_page(String heading) {
		String registerHeading = register_text.getText();
	    Assert.assertEquals(registerHeading, heading);	    
	}

	@When("user verifies {string} is displayed in the page")
	public void user_verifies_is_displayed_in_the_page(String personalDetails) {
	    String personalDetHeading = personaldet_text.getText();
	    System.out.println(personalDetHeading);
	    System.out.println(personalDetails);
	    Assert.assertEquals(personalDetHeading, personalDetails);    
	}

	@When("user verifies Gender check box options are displayed")
	public void user_verifies_gender_check_box_options_are_displayed() {
	    Assert.assertTrue(radio_btn_chkbox.isDisplayed());
	}

	@When("user verifies First name input box is displayed in the Register page")
	public void user_verifies_first_name_input_box_is_displayed_in_the_register_page() {
	    Assert.assertTrue(first_nametextbox.isDisplayed());
	}

	@When("user verifies Last name input box is displayed in the Register page")
	public void user_verifies_last_name_input_box_is_displayed_in_the_register_page() {
	  //  Assert.assertTrue(last_nametextbox.isDisplayed());
		Assert.assertFalse(last_nametextbox.isDisplayed());
	}

	@When("user verifies Date of birth dropdown is displayed in the Register page")
	public void user_verifies_date_of_birth_dropdown_is_displayed_in_the_register_page() {
	    Assert.assertTrue(birth_day.isDisplayed());
	}

	@When("user verifies Email input box is displayed in the Register page")
	public void user_verifies_email_input_box_is_displayed_in_the_register_page() {
	    Assert.assertTrue(email_textbox.isDisplayed());
	}

	@When("user verifies {string} is dispalyed in the page")
	public void user_verifies_is_dispalyed_in_the_page(String companyDetails) {
		Assert.assertTrue(comp_details_text.isDisplayed());
	}

	@When("user verifies Company name is diaplyed in the page")
	public void user_verifies_company_name_is_diaplyed_in_the_page() {	
		 Assert.assertTrue(company_txtbox.isDisplayed());	
	}

	@When("user verifies {string} is displayed in the registration page")
	public void user_verifies_is_displayed_in_the_registration_page(String options) {
		String optionsHeader = options_text.getText();	   
	    Assert.assertEquals(optionsHeader, options);
	}

	@When("user verifies Newsletter is displayed in the page")
	public void user_verifies_newsletter_is_displayed_in_the_page() {
	    Assert.assertTrue(newsletter_chkbox.isDisplayed());
	}
	
	@When("user verifies {string} is displayed in register  page")
	public void user_verifies_is_displayed_in_register_page(String passwordHdr) {
		
		String passwordHeading=password_header.getText();
		Assert.assertEquals(passwordHeading,passwordHdr);
	}

	@When("user verifies Password input box is displayed in the page")
	public void user_verifies_password_input_box_is_displayed_in_the_page() {
	    Assert.assertTrue(pwd_txtbox.isDisplayed());
	}

	@When("user verifies Confirm Password input box is displayed in the page")
	public void user_verifies_confirm_password_input_box_is_displayed_in_the_page() {
	   Assert.assertTrue(confirm_txtbox.isDisplayed());
	}
}

