package org.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class OrderPage extends CommonClass {
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCart;
	
	@CacheLookup
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeOrder;
	
	@CacheLookup
	@FindBy(xpath="//input[@class='_2IX_2- _17N0em']")
	private WebElement userName;
	
	@CacheLookup
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement continueBtn;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@CacheLookup
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@CacheLookup
	@FindBy(xpath="(//div[@class='_1XFPmK'])[1]")
	private WebElement radioBtn;
	
	@CacheLookup
	@FindBy(xpath="(//button[@class='_2KpZ6l RLM7ES _3AWRsL'])")
	private WebElement delivery;
	
	@CacheLookup
	@FindBy(xpath="(//div[@class='_1XFPmK'])[6]")
	private WebElement cashondeliverybtn;


	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getDelivery() {
		return delivery;
	}

	public WebElement getCashondeliverybtn() {
		return cashondeliverybtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
