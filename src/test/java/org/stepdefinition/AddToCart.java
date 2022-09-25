package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.CommonClass;
import org.utility.SelectionPage;
import org.utility.OrderPage;
import org.utility.PageObjectManager;
import org.utility.RemoveFromCartPage;
import org.utility.SearchPage;
import org.utility.ValidationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddToCart extends CommonClass {

	static PageObjectManager manager;
	static SearchPage search;
	static SelectionPage select;
	static OrderPage order;
	static ValidationPage validate;
	static RemoveFromCartPage remove;
	static String productName;
	static String productPrice;

	WebDriverWait wait = new WebDriverWait(driver, 20);

	@Given("Launch the URL")
	public void launch_the_URL() {
		urlLaunch("https://www.flipkart.com/");

	}

	@Then("Validate the URL")
	public void validate_the_URL() {
		Assert.assertEquals("Verify the URL", "https://www.flipkart.com/", getCurrentUrl());
	}

	@When("Do a Product search")
	public void do_a_Product_search() {
		manager = PageObjectManager.getManager();
		search = manager.getSearch();
		click(wait.until(ExpectedConditions.elementToBeClickable(search.getCloseButton())));
		sendKeys(search.getSearch(), "samsung mobiles");
		click(wait.until(ExpectedConditions.elementToBeClickable(search.getSearchBtn())));

	}

	@When("Select any product & Add that to the cart")
	public void select_any_product_Add_that_to_the_cart() {

		SelectionPage select = PageObjectManager.getManager().getSelect();
		productName = select.getListOfOptions().get(2).getText();
		click(wait.until(ExpectedConditions.elementToBeClickable(select.getListOfOptions().get(2))));
		productPrice = getText(select.getListOfPriceOptions().get(2));
		windowHandles(1);
		order = PageObjectManager.getManager().getOrder();
		click(wait.until(ExpectedConditions.elementToBeClickable(order.getAddToCart())));

	}

	@Then("Check the right product is added with respective prices")
	public void check_the_right_product_is_added_with_respective_prices() {

		validate = PageObjectManager.getManager().getValidate();
		Assert.assertEquals("Verify the Product name", productName, getText(validate.getNameInCart()));
		Assert.assertEquals("Verify the Product Price", productPrice, getText(validate.getPriceInCart()));

	}

	@When("Place Order & Login to the application by using {string} and {string}")
	public void place_Order_Login_to_the_application_by_using_and(String username, String password)
			throws InterruptedException {

		click(wait.until(ExpectedConditions.elementToBeClickable(order.getPlaceOrder())));
		sendKeys(order.getUserName(), username);
		click(wait.until(ExpectedConditions.elementToBeClickable(order.getContinueBtn())));
		sendKeys(order.getPassword(), password);
		click(wait.until(ExpectedConditions.elementToBeClickable(order.getLogin())));

	}

	@When("Select Address & Select Payment option")
	public void select_Address_Select_Payment_option() throws InterruptedException {

		// click(wait.until(ExpectedConditions.elementToBeClickable(order.getRadioBtn())));
		// click(wait.until(ExpectedConditions.elementToBeClickable(order.getDelivery())));
		// click(wait.until(ExpectedConditions.elementToBeClickable(order.getContinueBtn())));
		// click(wait.until(ExpectedConditions.elementToBeClickable(order.getCashondeliverybtn())));

	}

	@When("Remove the product from the cart")
	public void remove_the_product_from_the_cart() throws InterruptedException {

		windowHandles(0);
		remove = PageObjectManager.getManager().getRemove();
		click(wait.until(ExpectedConditions.elementToBeClickable(remove.getCartBtn())));
		int size = remove.getRemoveFromCart().size();
		for (int i = 0; i < size; i++) {
			jsClick(wait.until(ExpectedConditions.visibilityOf(remove.getRemoveFromCart().get((size - 1) - i))));
			jsClick(wait.until(ExpectedConditions.visibilityOf(remove.getConfirmremoveFromCart())));
		}

	}

	@Then("Check the Product is removed from the cart")
	public void check_the_Product_is_removed_from_the_cart() {
		String text = getText(validate.getMessage());
		if (text.contains("Your cart is empty!"))
			Assert.assertTrue("Verify Cart Page", text.contains("Your cart is empty!"));

		else
			Assert.assertTrue("Verify Cart Page", text.contains("Missing Cart items?"));

	}

}
