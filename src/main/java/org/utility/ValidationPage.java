package org.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage extends CommonClass{
	
	public ValidationPage() {
			PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//div[@class='_2-uG6-']")
	private WebElement nameInCart;
	
	@FindBy(xpath="//span[@class='_2-ut7f _1WpvJ7']")
	private WebElement priceInCart;
	
	@FindBy(xpath="//div[@class='_1LCJ1U']")
	private WebElement message;

	public WebElement getNameInCart() {
		return nameInCart;
	}

	public WebElement getPriceInCart() {
		return priceInCart;
	}

	public WebElement getMessage() {
		return message;
	}


}
