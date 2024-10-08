package org.pages;

import org.BaseTest.BaseTestclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page extends BaseTestclass {

	public Signin_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='signin2']")

	private WebElement signInbtn;

	@FindBy(id = "sign-username")
	private WebElement userNameText;

	@FindBy(id = "sign-password")

	private WebElement passWordText;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	private WebElement btnSignup;

	@FindBy(xpath = "(//button[@class='btn btn-secondary'])[2]")
	private WebElement btnCancel;

	public WebElement getSignInbtn() {
		return signInbtn;
	}

	public WebElement getUserNameText() {
		return userNameText;
	}

	public WebElement getPassWordText() {
		return passWordText;
	}

	public WebElement getBtnSignup() {
		return btnSignup;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public Signin_Page signinpage(String username, String password) throws InterruptedException {

		click(signInbtn);
		Sleep(1000);
		sendkeys(getUserNameText(), username);
		sendkeys(getPassWordText(), password);
		click(btnSignup);
		//alerts();
		return null;

	}

	public void signinPageCancel(String username, String password) throws InterruptedException {

		click(signInbtn);
		sendkeys(getUserNameText(), username);
		sendkeys(getPassWordText(), password);
		click(btnCancel);

	}

	public void SiginBtn() throws InterruptedException {

		click(btnSignup);
		Sleep(1500);
		alerts();
	
	}

}
