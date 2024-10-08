package org.stepdefinition;

import org.pagemaner.PageObjectManager;
import org.pages.Product_Details;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product_Page_Step {

	PageObjectManager page = new PageObjectManager();

	@Given("Navigate to a product details page.")
	public void navigate_to_a_product_details_page() throws InterruptedException {
		page.getProduct_Details().Productdetail();

	}

	@Then("validate  product information like description price")
	public void validate_product_information_like_description_price() throws InterruptedException {

		page.getProduct_Details().Validatethedescription();
	}

	@When("Add product to shopping cart")
	public void add_product_to_shopping_cart() throws InterruptedException {

		page.getProduct_Details().AddToCart();

	}

	@Then("validate product is added to cart")
	public void validate_product_is_added_to_cart() throws InterruptedException {

		page.getProduct_Details().validateincart();
	}

}
