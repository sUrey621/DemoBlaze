package org.stepdefinition;

import org.pagemaner.PageObjectManager;
import org.pages.Signin_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Sigin_Page_Step {

	PageObjectManager page = new PageObjectManager();

	@Given("I navigate to the signup page")
	public void i_navigate_to_the_signup_page() {

	}

	@When("I enter the username {string} and Password {string}")
	public void i_enter_the_username_and_password(String username, String password) throws InterruptedException {
				
		page.getSignin_Page().signinpage(username, password);
	}

	@When("I click the signup button")
	public void i_click_the_signup_button() throws InterruptedException {

	page.getSignin_Page().getSignInbtn().click();
	
	
	
	

	}

}
