package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.utils.TestBase;

public class YourCart extends TestBase {

	// Page Factory
	@FindBy(css = ".btn_action.checkout_button")
	private WebElement checkout;

	// Initializing the Page Objects
	public YourCart() {
		PageFactory.initElements(driver, this);
	}

	public void clickCheckout() {
		checkout.click();
	}
}
