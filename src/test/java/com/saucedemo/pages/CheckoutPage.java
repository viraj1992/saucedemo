package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.utils.TestBase;

public class CheckoutPage extends TestBase {

	// Page Factory
	@FindBy(id = "first-name")
	private WebElement firstName;

	@FindBy(id = "last-name")
	private WebElement lastName;

	@FindBy(id = "postal-code")
	private WebElement postCode;

	@FindBy(css = ".cart_button")
	private WebElement finishBtn;

	@FindBy(css = "[type='submit']")
	private WebElement continueBtn;

	// Initializing the Page Objects
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterContactDetails() {
		firstName.sendKeys(prop.getProperty("firstname"));
		lastName.sendKeys(prop.getProperty("lastname"));
		postCode.sendKeys(prop.getProperty("postcode"));
	}

	public void clickContinueBtn() {
		continueBtn.click();
	}

	public void clickFinishBtn() {
		finishBtn.click();
	}
}
