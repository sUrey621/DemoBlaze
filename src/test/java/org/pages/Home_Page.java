package org.pages;

import static org.testng.Assert.assertTrue;

import org.BaseTest.BaseTestclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home_Page extends BaseTestclass {

	public Home_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "nava")
	private WebElement banners;

	@FindBy(id = "navbarExample")
	private WebElement homemenus;

	@FindBy(id = "carouselExampleIndicators")
	private WebElement homepagebanners;

	@FindBy(xpath = "//a[@class='nav-link']")
	private WebElement homelinks;

	@FindBy(xpath = "//a[@id='cartur']")
	private WebElement Cartbtn;

	@FindBy(id = "cat")
	private WebElement categories;

	@FindBy(xpath = "//div[@id='tbodyid']//div[contains(@class, 'col-lg-4')][1]//h4/a")
	private WebElement Featureproducts;

	public WebElement getFeatureproducts() {
		return Featureproducts;
	}

	public WebElement getHomelinks() {
		return homelinks;
	}

	public WebElement getCartbtn() {
		return Cartbtn;
	}

	public WebElement getBanners() {
		return banners;
	}

	public WebElement getHomemenus() {
		return homemenus;
	}

	public WebElement getHomepagebanners() {
		return homepagebanners;
	}

	public WebElement getCategories() {
		return categories;
	}

	public void HomePageBanner() {

		assertTrue(driver.getPageSource().contains("Samsung1.jpg"));
		boolean contains = driver.getPageSource().contains("Samsung1.jpg");
		System.out.println(contains);

		assertTrue(driver.getPageSource().contains("CATEGORIES"));
		boolean contains2 = driver.getPageSource().contains("CATEGORIES");
		System.out.println(contains2);

	}

	public void HomePageMenu() {
		WebElement manu = driver.findElement(By.id("navbarExample"));
		boolean manudisplayed = manu.isDisplayed();
		System.out.println(manudisplayed);
		manu.click();

	}

	public void HomepageFeatured() {
		WebElement featureproducts = driver.findElement(By.id("tbodyid"));
		boolean displayed = featureproducts.isDisplayed();
		System.out.println(displayed);

	}

	public void Homepagecategories() {

		WebElement categories = driver.findElement(By.id("cat"));
		boolean display = categories.isDisplayed();
		System.out.println(display);
	}

	
	public void HomePageResize(String screenSize) {
        switch (screenSize.toLowerCase()) {
            case "desktop":
                driver.manage().window().setSize(new Dimension(1440, 900)); 
                break;
            case "tablet":
                driver.manage().window().setSize(new Dimension(768, 1024)); 
                break;
            case "mobile":
                driver.manage().window().setSize(new Dimension(375, 667)); 
                break;
            default:
                throw new IllegalArgumentException("Unknown screen size: " + screenSize);
        }
    }

   
    public void HomePageLayout(String screenSize) {
        
        WebElement banner = driver.findElement(By.id("carouselExampleIndicators")); 
        WebElement featuredProducts = driver.findElement(By.id("tbodyid")); 
        WebElement categoryList = driver.findElement(By.id("cat")); 

        switch (screenSize.toLowerCase()) {
            case "desktop":
                assert banner.isDisplayed() : "Banner not displayed correctly on desktop";
//                assert featuredProducts.isDisplayed() : "Featured products not displayed correctly on desktop";
//                assert categoryList.isDisplayed() : "Category list not displayed correctly on desktop";
                break;
            case "tablet":
                // Add validation logic specific to tablet layout
                assert banner.isDisplayed() : "Banner not displayed correctly on tablet";
                break;
            case "mobile":
                // Add validation logic specific to mobile layout
                assert banner.isDisplayed() : "Banner not displayed correctly on mobile";
                break;
            default:
                throw new IllegalArgumentException("Unknown screen size: " + screenSize);
        }
    }
	
	
	
	
	
	
	
	
	
}
