package org.pages;

import org.BaseTest.BaseTestclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends BaseTestclass {

	public Login_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login2")
	private WebElement loginpage;

	@FindBy(id = "loginusername")
	private WebElement userNameText;

	@FindBy(id = "loginpassword")
	private WebElement passwordText;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
	private WebElement loginbtn;

	@FindBy(id = "logout2")
	private WebElement LogoutBtn;

	@FindBy(xpath = "//a[text()='Welcome sk123@gmail.com']")
	private WebElement LoginMessage;

	public WebElement getLoginpage() {
		return loginpage;
	}

	public WebElement getUserNameText() {
		return userNameText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}

	public WebElement getLoginMessage() {
		return LoginMessage;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void LoginPage(String username, String password) throws InterruptedException {

		
		click(loginpage);
		Sleep(1000);
		sendkeys(getUserNameText(), username);
		sendkeys(getPasswordText(), password);
		
		
	}

	public void loginbtn() {
		click(loginbtn);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}