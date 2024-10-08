package org.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pagemaner.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page_Step {
	PageObjectManager page = new PageObjectManager();
	

	@Given("I navigate to the Login page")
	public void i_navigate_to_the_login_page() {
		
	}

	@When("I enter the username {string} and password {string}")
	public void i_enter_the_username_and_password(String username, String password) throws InterruptedException {

		page.getLoginPage().LoginPage(username, password);
		
		

	}

	@When("I click the Login button")
	public void i_click_the_login_button() {

		page.getLoginPage().loginbtn();

	}

}
