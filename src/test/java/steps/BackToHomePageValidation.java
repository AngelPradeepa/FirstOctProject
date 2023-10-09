package steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPack.RegistrationPageFactory;

public class BackToHomePageValidation extends RegistrationPageFactory{
	@When("user clicks continue,user verify if the title is {string}")
	public void user_clicks_continue_user_verify_if_the_title_is(String pageTitle) {
	   String redirectedPageTitle = driver.getTitle();
	   Assert.assertEquals(redirectedPageTitle, pageTitle);
	}

	@Then("user searches for product using the search button")
	public void user_searches_for_product_using_the_search_button() {
		searchButton.sendKeys("notebook");
		searchButton.sendKeys(Keys.ENTER);
	}

//	@Then("user selects the third item displayed from the featured products and add to cart")
//	public void user_selects_the_third_item_displayed_from_the_featured_products_and_add_to_cart() {
//		clickMethod(add_to_cart_btn);
//	}

//	@Then("user clicks the Add to Cart in the product")
//	public void user_clicks_the_add_to_cart_in_the_product() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("user selects the third item displayed from the featured products and clicks the same")
	public void user_selects_the_third_item_displayed_from_the_featured_products_and_clicks_the_same() {
		clickMethod(pdt_title);
	}

	@Then("user clicks Add To Cart in PDP page")
	public void user_clicks_add_to_cart_in_pdp_page() {
	    clickMethod(add_to_cart_btn);
	  //  Assert.assertFalse(false);
	}

}
