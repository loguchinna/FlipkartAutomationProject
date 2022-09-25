package org.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SelectionPage extends CommonClass {

	public SelectionPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
	}

	@FindBy(xpath = "//div[@class='_4rR01T']")
	private List<WebElement> listOfOptions;

	@FindBy(xpath = "//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> listOfPriceOptions;

	public List<WebElement> getListOfOptions() {
		return listOfOptions;
	}

	public List<WebElement> getListOfPriceOptions() {
		return listOfPriceOptions;
	}

}
