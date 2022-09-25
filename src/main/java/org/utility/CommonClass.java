package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClass {

	public static WebDriver driver;

	public static void browserName(String a) {
		switch (a) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
			break;

		case "Firefox":
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Invalid Browser");
			break;
		}

	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void impWait(int sec) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	public static void sendKeys(WebElement a, String input) {
		a.sendKeys(input);

	}

	public static void click(WebElement a) {

		a.click();

	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getText(WebElement a) {

		String text = a.getText();
		return text;

	}

	public static String getAttribute(WebElement a) {
		String attValue = a.getAttribute("value");
		return attValue;

	}

	public static void quit() {
		driver.quit();

	}

	public static void navigateto(String url) {

		driver.navigate().to(url);

	}

	public static void forward() {
		driver.navigate().forward();

	}

	public static void backward() {
		driver.navigate().back();
	}

	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void clear(WebElement a) {

		a.clear();

	}

	public static void getScreenshotAs(String filename) throws Throwable {
		TakesScreenshot screen = (TakesScreenshot) driver;

		File screenshot = screen.getScreenshotAs(OutputType.FILE);
		System.currentTimeMillis();
		String l = System.getProperty("user.dir");
		File designationLocation = new File(l + "\\src\\test\\resources\\" + filename + ".png");
		FileUtils.copyFile(screenshot, designationLocation);

	}

	public static void moveToElement(WebElement a) {
		Actions act = new Actions(driver);
		act.moveToElement(a).perform();

	}

	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).perform();

	}

	public static void actionClick(WebElement a) {
		Actions act = new Actions(driver);
		act.click(a).perform();

	}

	public static void clickMoveRelease(WebElement from, WebElement to) {
		Actions act = new Actions(driver);
		act.clickAndHold(from).moveToElement(to).release().perform();

	}

	public static void clickAndRelease(WebElement from, WebElement to) {
		Actions act = new Actions(driver);
		act.clickAndHold(from).release(to).perform();

	}

	public static void doubleClick(WebElement a) {
		Actions act = new Actions(driver);
		act.doubleClick(a).perform();

	}

	public static void tripleClick(WebElement a) {
		Actions act = new Actions(driver);
		act.doubleClick(a).click(a).perform();

	}

	public static void contextClick(WebElement a) {
		Actions act = new Actions(driver);
		act.contextClick(a).perform();

	}

	public static void accept() {
		Alert alt = driver.switchTo().alert();
		alt.accept();

	}

	public static void dismiss() {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();

	}

	public static void promtAlertAccept(String input) {
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(input);
		alt.accept();

	}

	public static void promtAlertDismiss() {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();

	}

	public static void selectByIndex(WebElement a, int index) {
		Select sel = new Select(a);
		sel.selectByIndex(index);

	}

	public static void selectByValue(WebElement a, String value) {
		Select sel = new Select(a);
		sel.selectByValue(value);

	}

	public static void selectByvisibleText(WebElement a, String text) {
		Select sel = new Select(a);
		sel.selectByVisibleText(text);

	}

	public static void deselectByIndex(WebElement a, int index) {
		Select sel = new Select(a);
		sel.deselectByIndex(index);

	}

	public static void deselectBYValue(WebElement a, String value) {
		Select sel = new Select(a);
		sel.deselectByValue(value);

	}

	public static void deselectByVisibleText(WebElement a, String text) {
		Select sel = new Select(a);
		sel.deselectByVisibleText(text);

	}

	public static void deselectAll(WebElement a) {
		Select sel = new Select(a);
		sel.deselectAll();

	}

	public static boolean isMultiple(WebElement a) {
		Select sel = new Select(a);
		boolean multiple = sel.isMultiple();
		return multiple;

	}

	public static String getOptions(WebElement a) {
		Select sel = new Select(a);

		List<WebElement> options = sel.getOptions();
		String text = null;
		for (WebElement x : options) {
			text = x.getText();

		}
		return text;

	}

	public static String getFirstSelectedOption(WebElement a) {
		Select sel = new Select(a);
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}

	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);

	}

	public static void frameById(String id) {
		driver.switchTo().frame(id);

	}

	public static void frameByWebElement(WebElement a) {

		driver.switchTo().frame(a);

	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();

	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();

	}

	public static void setexecuteScript(String text, WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + text + "'", a);

	}

	public static String getexecuteScript(WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", a);
		String data = (String) executeScript;
		return data;

	}

	public static void jsClick(WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", a);

	}

	public static void scrollDown(WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView('true')", a);

	}

	public static void scrollUp(WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView('false')", a);

	}

	public static void windowHandles(int index) {
		Set<String> allwindows = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(allwindows);
		driver.switchTo().window(li.get(index));

	}

	public static long sleep(long x) throws InterruptedException {
		Thread.sleep(x);
		return x;

	}
}
