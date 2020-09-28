package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.utils.TestBase;

public class ProductsPage extends TestBase {

	// Page Factory
	@FindBy(className = "product_sort_container")
	static WebElement sortProducts;

	@FindBy(css = ".inventory_list .inventory_item:nth-of-type(6) .btn_inventory")
	static WebElement cheapestProduct;

	@FindBy(css = ".inventory_list .inventory_item:nth-of-type(2) .btn_inventory")
	static WebElement secondExpensiveProduct;

	public static void sortProductsHighToLow() {
		Select objSelect = new Select(sortProducts);
		objSelect.selectByVisibleText("Price (high to low)");
	}

	public static void addCheapestProduct() {
		cheapestProduct.click();
	}

	public static void addSecondExpensiveProduct() {
		secondExpensiveProduct.click();
	}
}
