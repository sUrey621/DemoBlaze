package org.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pagemaner.PageObjectManager;
import org.pages.Home_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_Page_Step {

	PageObjectManager page = new PageObjectManager();

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {

	}

	@When("I check the banner display")
	public void i_check_the_banner_display() throws InterruptedException {

		page.getHome_Page().HomePageBanner();

	}

	@Then("the banner should be displayed correctly")
	public void the_banner_should_be_displayed_correctly() {

		page.getHome_Page().HomePageMenu();

	}

	@Then("featured products should be displayed")
	public void featured_products_should_be_displayed() {


		page.getHome_Page().HomepageFeatured();

	}

	@Then("product categories should be visible")
	public void product_categories_should_be_visible() {


		page.getHome_Page().Homepagecategories();
	}

	@Then("I resize the window to mobile view")
	public void i_resize_the_window_to_mobile_view() {


		page.getHome_Page().HomePageResize("mobile");

	}

	@Then("I resize the window to tablet view")
	public void i_resize_the_window_to_tablet_view() {


		page.getHome_Page().HomePageResize("tablet");
	}

	@Then("the layout should adapt to desktop view")
	public void the_layout_should_adapt_to_desktop_view() {


		//page.getHome_Page().HomePageLayout("tablet");
	}

}
