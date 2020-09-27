package com.saucedemo.pages;

import com.saucedemo.utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header extends TestBase {

	// Page Factory
	@FindBy(css = "svg[role='img']")
	private WebElement cartButton;

	// Initializing the Page Objects
	public Header() {
		PageFactory.initElements(driver, this);
	}

	public void clickCartButton() {
		cartButton.click();
	}
}
