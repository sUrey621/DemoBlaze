package org.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.BaseTest.BaseTestclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Details extends BaseTestclass {

	public Product_Details() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	private WebElement productclick;

	@FindBy(linkText = "Samsung galaxy s6")
	private WebElement samsung;

	@FindBy(xpath = "//h2[text()='Samsung galaxy s6']")
	private WebElement productisdisplayed;
	
	@FindBy(xpath = "//h2[@class='name']")
	private WebElement productname;

	@FindBy(xpath = "//h3[@class='price-container']")
	private WebElement pricetag;

	@FindBy(id = "more-information")
	private WebElement productinformation;

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addToCartbtn;

	@FindBy(xpath = "((//a[@class='nav-link'])[4]")
	private WebElement Cart;

	@FindBy(linkText = "Cart")
	private WebElement Cart1;

	@FindBy(xpath = "//td[text()='Samsung galaxy s6']")
	private WebElement productincart;

	@FindBy(xpath = "(//a[@href='prod.html?idp_=2'])[1]")
	private WebElement productselect2;

	public WebElement getProductclick() {
		return productclick;
	}

	public WebElement getIsdisplayed() {
		return productisdisplayed;
	}

	public WebElement getPricetag() {
		return pricetag;
	}

	public WebElement getProductinformation() {
		return productinformation;
	}

	public WebElement getAddToCartbtn() {
		return addToCartbtn;
	}

	public void Productdetail() throws InterruptedException {

		implicitwait(2);
		//click(productclick);
		click(samsung);
	}

	public void Validatethedescription() throws InterruptedException {

		implicitwait(2);
		String prodname = getText(productname);
		System.out.println(prodname);
		assertEquals(prodname, "Samsung galaxy s6");

		String price = getText(pricetag);
		System.out.println(price);
		assertEquals(price, "$360 *includes tax");

		String des = getText(productinformation);
		System.out.println(des);
		assertEquals(des, "Product description\n"
				+ "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.");

	}

	public void AddToCart() throws InterruptedException {

		click(addToCartbtn);
		Sleep(1000);
		alerts();

	}

	public void validateincart() throws InterruptedException {

		implicitwait(2);
		click(Cart1);
		implicitwait(2);
		String productincart1 = getText(productincart);
		System.out.println(productincart1);
		assertEquals(productincart1, "Samsung galaxy s6");

	}

}
