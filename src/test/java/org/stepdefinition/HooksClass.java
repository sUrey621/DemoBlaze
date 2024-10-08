package org.stepdefinition;

import org.BaseTest.BaseTestclass;

import io.cucumber.java.After;

public class HooksClass extends BaseTestclass {

	@io.cucumber.java.Before
	public void beforemethod() {

		initializeDriver("Chrome");
		url("https://www.demoblaze.com/");

	}

	@After
	public void aftermethod() throws InterruptedException {

		Sleep(500);
		driver.quit();

	}

}
