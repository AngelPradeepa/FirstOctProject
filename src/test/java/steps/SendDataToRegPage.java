package steps;


import org.junit.Assert;

import io.cucumber.java.en.Then;

import pageFactoryPack.RegistrationPageFactory;

public class SendDataToRegPage extends RegistrationPageFactory {

	@Then("user verifies if the page is opened correctly by checking the title as {string}")
	public void user_verifies_if_the_page_is_opened_correctly_by_checking_the_title_as(String titleofNOPPage) {

		String pageTitle = driver.getTitle();
		Assert.assertEquals(titleofNOPPage, pageTitle);
	}

	@Then("user selects gender using the given checkbox")
	public void user_selects_gender_using_the_given_checkbox() {
		clickMethod(radio_btn_chkbox);

	}

	@Then("user sends data for the First name TextBox")
	public void user_sends_data_for_the_first_name_text_box() {
		sendKeys(first_nametextbox, "Niko");
	}

	@Then("user sends data for the Last name TextBox")
	public void user_sends_data_for_the_last_name_text_box() {
		sendKeys(last_nametextbox, "Hayo");
	}

	@Then("user selects the day from drop down date of birth")
	public void user_selects_the_day_from_drop_down_date_of_birth() {
		selectByvisibleTextmethod(birth_day, "5");
	}

	@Then("user selects the month from drop down date of birth")
	public void user_selects_the_month_from_drop_down_date_of_birth() {
		selectByvisibleTextmethod(birth_month, "January");
	}

	@Then("user selects the year from drop down date of birth")
	public void user_selects_the_year_from_drop_down_date_of_birth() {
		selectByvisibleTextmethod(birth_year, "1995");
	}


	@Then("user sends data for email")
	public void user_sends_data_for_email() {
		sendKeys(email_textbox, "pradeeangel@jmail.com");
	}

	@Then("user sends company name")
	public void user_sends_company_name() {
		sendKeys(company_txtbox, "ABC");
	}

	@Then("user sends data to password field")
	public void user_sends_data_to_password_field() {
		sendKeys(pwd_txtbox, "jala@123");
	}

	@Then("user sends data to confirm password field")
	public void user_sends_data_to_confirm_password_field() {
		sendKeys(confirm_txtbox, "jala@123");
	}

	@Then("user clicks the register button")
	public void user_clicks_the_register_button() {
		clickMethod(register_button);
	}

	@Then("get the title page of the registration completed page {string}")
	public void get_the_title_page_of_the_registration_completed_page(String regPageTitle) {
		String registerPageTitle = driver.getTitle();
		Assert.assertEquals(registerPageTitle,regPageTitle);
	}

	@Then("validate if the text {string} is present")
	public void validate_if_the_text_is_present(String registerText) {
		String rtext =reg_text.getText();
		Assert.assertEquals(rtext, registerText);	    
	}

//	@Then("validate if the completion text {string} is present")
//	public void validate_if_the_completion_text_is_present(String registerCompText) {
//		String comp_text =reg_comp_text.getText();
//		Assert.assertEquals(comp_text, registerCompText);
//	}

	@Then("click the Continue button on the page")
	public void click_the_continue_button_on_the_page() {
		clickMethod(continue_button);
	}
}
