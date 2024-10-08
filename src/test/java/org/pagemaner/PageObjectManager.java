package org.pagemaner;

import org.pages.Cart_Page;
import org.pages.Home_Page;
import org.pages.Login_Page;
import org.pages.Product_Details;
import org.pages.Signin_Page;
import org.stepdefinition.Product_Page_Step;

public class PageObjectManager {

	public Signin_Page signinpage;
	public Login_Page loginpage;
	public Home_Page homepage;
	public Product_Details productpage;
	public Cart_Page cartpage;

	
	
	
	public Signin_Page getSignin_Page() {
		return (signinpage == null) ? signinpage = new Signin_Page() : signinpage;

	}

	public Login_Page getLoginPage() {
		return (loginpage == null) ? loginpage = new Login_Page() : loginpage;

	}

	public Home_Page getHome_Page() {
		return (homepage == null) ? homepage = new Home_Page() : homepage;

	}

	public Product_Details getProduct_Details() {
		return (productpage == null) ? productpage = new Product_Details() : productpage;

	}

	public Cart_Page getCart_Page() {
		return (cartpage == null) ? cartpage = new Cart_Page() : cartpage;
		
	}
	
	
	
}