package org.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Scanner;

import org.BaseTest.BaseTestclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Page extends BaseTestclass {

	public Checkout_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	private WebElement productselect;

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//a[@id='cartur']")
	private WebElement clickcart;

	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeorderbtn;

	@FindBy(id = "name")
	private WebElement nametext;

	@FindBy(id = "country")
	private WebElement countrytext;

	@FindBy(id = "city")
	private WebElement citytext;

	@FindBy(id = "card")
	private WebElement CCtext;

	@FindBy(id = "month")
	private WebElement monthtext;

	@FindBy(id = "year")
	private WebElement yeartext;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
	private WebElement purchasebtn;
	
	@FindBy(xpath = "//p[@class='lead text-muted ']")
	private WebElement Orderidtext;
	
	
	

	public WebElement getProductselect() {
		return productselect;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getClickcart() {
		return clickcart;
	}

	public WebElement getPlaceorderbtn() {
		return placeorderbtn;
	}

	public WebElement getNametext() {
		return nametext;
	}

	public WebElement getCountrytext() {
		return countrytext;
	}

	public WebElement getCitytext() {
		return citytext;
	}

	public WebElement getCCtext() {
		return CCtext;
	}

	public WebElement getMonthtext() {
		return monthtext;
	}

	public WebElement getYeartext() {
		return yeartext;
	}

	public WebElement getPurchasebtn() {
		return purchasebtn;
	}
	public WebElement getOrderidtext() {
		return Orderidtext;
	}

	public void ckeckOutPage() throws InterruptedException {
		implicitwait(2);
		click(productselect);
		click(addToCart);
		Sleep(1000);
		alerts();

	}

	public void ClickProceed() {
		
		click(clickcart);
		implicitwait(1);
		click(placeorderbtn);
		
		
	}
	
	public void Shippingimformation(String Name, String Country, String City, String Creditcard, String Month, String Year) throws InterruptedException {
		
		Sleep(1000);
		sendkeys(getNametext(), Name);
		sendkeys(getCountrytext(), Country);
		sendkeys(getCitytext(), City);
		sendkeys(getCCtext(), Creditcard);
		sendkeys(getMonthtext(), Month);
		sendkeys(getYeartext(), Year);
		click(purchasebtn);
		
		
	}
	
	public void OrderId() throws IOException {
		
		implicitwait(1);
		String orderid = getText(Orderidtext);
		System.out.println(orderid);
		//assertEquals(orderid,getPropertyFileValue("OrderDetails"));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
