package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.saucedemo.utils.TestBase;

public class YourCart extends TestBase {

	// Page Factory
	@FindBy(css = ".btn_action.checkout_button")
	private static WebElement checkout;

	public static void clickCheckout() {
		checkout.click();
	}
}
