package org.stepdefinition;

import java.io.IOException;

import org.pages.Checkout_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout_Step extends Checkout_Page{
	
	
	@Given("I have added {string} to the cart")
	public void i_have_added_to_the_cart(String string) throws InterruptedException {
		ckeckOutPage();
	}
	@When("I proceed to checkout")
	public void i_proceed_to_checkout() {

		ClickProceed();
	}
	@When("I fill in the shipping information with {string}, {string}, {string}, {string}, {string}, {string}")
	public void i_fill_in_the_shipping_information_with(String Name, String Country, String City, String Creditcard, String Month, String Year) throws InterruptedException {

		Shippingimformation(Name, Country, City, Creditcard, Month, Year);
		
	}
	@When("I complete the purchase")
	public void i_complete_the_purchase() {

	}
	@Then("I should see the order confirmation with a valid order ID")
	public void i_should_see_the_order_confirmation_with_a_valid_order_id() throws IOException {

		OrderId();
		
		
	}







}
