package org.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveFromCartPage extends CommonClass {
	public RemoveFromCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='_1psGvi']")
	private WebElement cartBtn;

	
	@FindBy(xpath="//div[text()='Remove']")
	private List<WebElement> removeFromCart;
	
	
	@FindBy(xpath="(//div[text()='Remove'])[1]")
	private WebElement confirmremoveFromCart;
	
	

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public List<WebElement> getRemoveFromCart() {
		return removeFromCart;
	}

	public WebElement getConfirmremoveFromCart() {
		return confirmremoveFromCart;
	}

	

}
