package com.saucedemo.pages;

import com.saucedemo.utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends TestBase {

	// Page Factory
	@FindBy(css = "svg[role='img']")
	static WebElement cartButton;

	public static void clickCartButton() {
		cartButton.click();
	}
}
