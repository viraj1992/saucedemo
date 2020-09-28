package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.saucedemo.utils.TestBase;

public class CheckoutPage extends TestBase {

	// Page Factory
	@FindBy(id = "first-name")
	static WebElement firstName;

	@FindBy(id = "last-name")
	static WebElement lastName;

	@FindBy(id = "postal-code")
	static WebElement postCode;

	@FindBy(css = ".cart_button")
	static WebElement finishBtn;

	@FindBy(css = "[type='submit']")
	static WebElement continueBtn;

	public static void enterContactDetails(String fName, String lName, String pCode) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		postCode.sendKeys(pCode);
	}

	public static void clickContinueBtn() {
		continueBtn.click();
	}

	public static void clickFinishBtn() {
		finishBtn.click();
	}
}
