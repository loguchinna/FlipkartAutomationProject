package org.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends CommonClass {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement closeButton;

	@CacheLookup
	@FindBy(xpath = "//input[@type='text']")
	private WebElement search;

	@CacheLookup
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchBtn;

	@FindBy(xpath = "//div[@class='_4rR01T']")
	private List<WebElement> listOfOptions;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtn;

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public List<WebElement> getListOfOptions() {
		return listOfOptions;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

}
