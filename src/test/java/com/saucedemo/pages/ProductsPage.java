package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.saucedemo.utils.TestBase;

public class ProductsPage extends TestBase {

	// Page Factory
	@FindBy(className = "product_sort_container")
	private WebElement sortProducts;

	@FindBy(css = ".inventory_list .inventory_item:nth-of-type(6) .btn_inventory")
	private WebElement cheapestProduct;

	@FindBy(css = ".inventory_list .inventory_item:nth-of-type(2) .btn_inventory")
	private WebElement secondExpensiveProduct;

	// Initializing the Page Objects
	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	public void sortProductsHighToLow() {
		Select objSelect = new Select(sortProducts);
		objSelect.selectByVisibleText("Price (high to low)");
	}

	public void addCheapestProduct() {
		cheapestProduct.click();
	}

	public void addSecondExpensiveProduct() {
		secondExpensiveProduct.click();
	}

}
