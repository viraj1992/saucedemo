package com.saucedemo.pages;

import com.saucedemo.utils.*;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test extends TestBase {

	WebElement webElement;

	@Given("I navigate to sauce demo web site")
	public void i_navigate_to_sauce_demo_web_site() {
		TestBase.initialisation();
	}

	@When("I enter user name and password")
	public void i_enter_user_name_and_password() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUsernamePassword();
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		LoginPage loginPage = new LoginPage();
		loginPage.clickLoginButton();
	}

	@Then("I sort the products from high to low")
	public void i_sort_the_products_from_high_to_low() {
		ProductsPage productsPage = new ProductsPage();
		productsPage.sortProductsHighToLow();
	}

	@Then("I add the cheapest product to basket")
	public void i_add_the_cheapest_product_to_basket() {
		ProductsPage productsPage = new ProductsPage();
		productsPage.addCheapestProduct();
	}

	@Then("I add the second costliest product to basket")
	public void i_add_the_second_costliest_product_to_basket() {
		ProductsPage productsPage = new ProductsPage();
		productsPage.addSecondExpensiveProduct();
	}

	@Then("I open the basket")
	public void i_open_the_basket() {
		Header header = new Header();
		header.clickCartButton();
	}

	@Then("I click on checkout button")
	public void i_click_on_checkout_button() {
		YourCart yourCart = new YourCart();
		yourCart.clickCheckout();
	}

	@Then("I enter contact details")
	public void i_enter_contact_details() {
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.enterContactDetails();
	}

	@Then("I click on continue button")
	public void i_click_on_continue_button() {
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.clickContinueBtn();
	}

	@Then("I click on finish button")
	public void i_click_on_finish_button() {
		CheckoutPage checkoutPage = new CheckoutPage();
		checkoutPage.clickFinishBtn();
	}

	@Then("I close the browser")
	public void i_close_the_browser() throws InterruptedException {
		driver.quit();
	}

}
