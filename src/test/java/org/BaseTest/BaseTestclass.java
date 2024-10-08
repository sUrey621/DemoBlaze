package org.BaseTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestclass {

	public static RemoteWebDriver driver;
	public static WebDriverWait wait;

	public static void initializeDriver(String browserName) {
		browserName = browserName.toLowerCase();

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(driver.getSessionId());
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser name! Launching Chrome as default.");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

		if (driver == null) {
			throw new RuntimeException("Driver could not be initialized!");
		}
		driver.manage().window().maximize();

		return;
	}

	public void Wait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("elementId")));

	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public void sendkeys(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void click(WebElement element) {
		element.click();

	}

	public void Clear(WebElement element) {
		element.clear();
	}

	public static void Sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findElementById(String AttributeValue) {
		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public WebElement findElementByName(String AttributeValue) {
		WebElement element = driver.findElement(By.name(AttributeValue));
		return element;
	}

	public WebElement findElenmentByClass(String AttributeValue) {
		WebElement element = driver.findElement(By.className(AttributeValue));
		return element;
	}

	public WebElement findElementByXpath(String Xpath) {
		WebElement element = driver.findElement(By.xpath(Xpath));
		return element;
	}

	public String getUrl(String url) {
		String Curenturl = driver.getCurrentUrl();
		return Curenturl;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;

	}

	public String getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public String getAttributeName(WebElement element, String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;
	}

	public void selectOptionByText(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectOptionByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public String getPropertyFileValue(String key) throws IOException {

		FileInputStream inputStream = new FileInputStream(
				System.getProperty("/Users/presidio/eclipse-workspace/DemoBlaze/Config.properties"));
		Properties properties = new Properties();
		properties.load(inputStream);
		Object name = properties.get(key);
		String value = (String) name;
		return value;
	}

	public void selectOptionByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void typeJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("aruguments[0].getAttribute('value'," + data + "')", element);
	}

	public void backWard() {
		driver.navigate().back();
	}

	public void forWard() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public void dragnDrop(WebElement source, WebElement dest) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).build().perform();
	}

	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}

	public static void keyboardActions(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
		robot.keyRelease(keycode);
	}

	public static void doubleclick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	public static void alerts() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void alertcancel() {
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
	}

	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("aruments[0].scrollIntoView(true)", element);
	}

	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("aruments[0].scrollIntoView(false)", element);
	}

	public List<WebElement> webgetAllSelectedOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		return selectedOptions;
	}

	public void implicitwait(int num) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));

	}

	public void isMultiple(WebElement element) {
		Select select = new Select(element);
		select.isMultiple();
	}

	public void deSelectbyIndex(WebElement element, int index, String value) {
		Select select = new Select(element);
		select.deselectByIndex(index);

		select.deselectAll();

		select.deselectByValue(value);

		select.deselectByVisibleText(value);

	}

	public void TakesScreenShot(File source, WebElement element, File dest, String pathname) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File soruce = new File(pathname);
		File dest1 = screenshot.getScreenshotAs((OutputType.FILE));
		FileUtils.copyFile(soruce, dest);

	}

	public static void explicitWait(int sec) {
		new WebDriverWait(driver, java.time.Duration.ofSeconds(sec));
	}

	public void fluentWait(int sec, WebElement element) {
		new FluentWait<>(driver).withTimeout(java.time.Duration.ofSeconds(sec));
		pollingEvery(Duration.ofSeconds(sec)).ignoring(NoSuchElementException.class);

	}

	private FluentWait<WebDriver> pollingEvery(java.time.Duration ofSeconds) {
		return null;
	}

	public static void frame(int index, int id, String name, WebElement element) {
		driver.switchTo().frame(index);
		driver.switchTo().frame(id);
		driver.switchTo().frame(name);
		driver.switchTo().frame(element);

	}

	public static void parentframe() {
		driver.switchTo().parentFrame();

	}

	public static void ExitFrame() {
		driver.switchTo().defaultContent();

	}

	public WebDriver getWindowHandle() {
		String parentId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		for (String string : allWindowId) {
			if (!(string.equals(parentId))) {
				driver.switchTo().window(string);
			}
		}
		return driver;
	}
	public static void switchTowinByurl(String url, String title) {
		driver.switchTo().window(url);
		driver.switchTo().window(title);
	}

	public static void closeWindow() {
		driver.close();
	}

	public static void quitWindow() {
		driver.quit();

	}

}
