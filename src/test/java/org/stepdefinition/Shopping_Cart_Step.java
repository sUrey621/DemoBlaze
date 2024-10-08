package org.stepdefinition;

import org.pagemaner.PageObjectManager;
import org.pages.Cart_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shopping_Cart_Step {

	PageObjectManager page = new PageObjectManager();

	@Given("I have added {string} and {string} to the cart")
	public void i_have_added_and_to_the_cart(String string, String string2) throws InterruptedException {
		page.getCart_Page().Addtocart();

	}

	@When("I navigate to the cart")
	public void i_navigate_to_the_cart() throws InterruptedException {

		page.getCart_Page().Cartpage();
	}

	@Then("I should see {string} in the cart")
	public void i_should_see_in_the_cart(String string) {

		page.getCart_Page().ProdDetails();
	}

	@Then("the correct prices for both products should be displayed")
	public void the_correct_prices_for_both_products_should_be_displayed() {
		page.getCart_Page().ProdDetails();
	}

	@Then("the total price should be correct")
	public void the_total_price_should_be_correct() {

		page.getCart_Page().totalprice();

	}

	@Then("I remove {string} from the cart")
	public void i_remove_from_the_cart(String string) {

		page.getCart_Page().deleteitem();

	}

	@Then("the total price should be updated correctly")
	public void the_total_price_should_be_updated_correctly() {

		page.getCart_Page().placeorder();
	}

}
