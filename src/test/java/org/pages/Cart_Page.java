package org.pages;

import static org.testng.Assert.assertEquals;

import org.BaseTest.BaseTestclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart_Page extends BaseTestclass {

	public Cart_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Samsung galaxy s6")
	private WebElement addprod1;

	@FindBy(linkText = "Nokia lumia 1520")
	private WebElement addprod2;

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addToCartbtn;

	@FindBy(xpath = "//tbody[@id='tbodyid']/tr[2]/td[4]/a[text()='Delete']")
	private WebElement deletebtn;

	@FindBy(xpath = "(//tr[@class='success'])[1]")
	private WebElement proddetails;

	@FindBy(xpath = "//tr[@class='success']")
	private WebElement proddetails1;

	@FindBy(linkText = "Cart")
	private WebElement cart;

	@FindBy(id = "totalp")
	private WebElement totalprice;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	private WebElement placeorderbtn;

	public WebElement getAddprod1() {
		return addprod1;
	}

	public WebElement getAddprod2() {
		return addprod2;
	}

	public WebElement getAddToCartbtn() {
		return addToCartbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getProddetails() {
		return proddetails;
	}

	public WebElement getProddetails1() {
		return proddetails1;
	}

	public WebElement getCart() {
		return cart;
	}

	public void Addtocart() throws InterruptedException {

		implicitwait(1);
		click(addprod1);
		implicitwait(1);
		click(addToCartbtn);
		Sleep(1000);
		alerts();
		implicitwait(1);
		backWard();
		backWard();
		implicitwait(1);
		click(addprod2);
		implicitwait(1);
		click(addToCartbtn);
		Sleep(1000);
		alerts();
	}

	public void Cartpage() throws InterruptedException {
		implicitwait(1);
		click(cart);

	}

	public void ProdDetails() {
		implicitwait(1);
		String details = getText(proddetails);
		System.out.println(details);
		assertEquals(details, "Samsung galaxy s6 360 Delete"); //, "\n Nokia lumia 1520 820 Delete"Samsung galaxy s6 360 Delete

	}

	public void totalprice() {

		implicitwait(1);
		String total = getText(totalprice);
		System.out.println(total);
		assertEquals(total, "1180");

	}

	public void deleteitem() {
		click(deletebtn);
	}

	public void placeorder() {
		implicitwait(1);
		click(placeorderbtn);
		implicitwait(5);

	}

}
