package com.saucedemo.stepDefinations;

import org.openqa.selenium.support.PageFactory;

import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.Header;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.YourCart;
import com.saucedemo.utils.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test extends TestBase {

	@Given("I navigate to sauce demo web site")
	public void i_navigate_to_sauce_demo_web_site() throws Throwable {
		TestBase.initialisation();
	}

	@When("I enter user name and password")
	public void i_enter_user_name_and_password() throws Throwable {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.enterUsernamePassword(prop.getProperty("username"), prop.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() throws Throwable {
		LoginPage.clickLoginButton();
	}

	@Then("I sort the products from high to low")
	public void i_sort_the_products_from_high_to_low() throws Throwable {
		PageFactory.initElements(driver, ProductsPage.class);
		ProductsPage.sortProductsHighToLow();
	}

	@Then("I add the cheapest product to basket")
	public void i_add_the_cheapest_product_to_basket() throws Throwable {
		ProductsPage.addCheapestProduct();
	}

	@Then("I add the second costliest product to basket")
	public void i_add_the_second_costliest_product_to_basket() throws Throwable {
		ProductsPage.addSecondExpensiveProduct();
	}

	@Then("I open the basket")
	public void i_open_the_basket() throws Throwable {
		PageFactory.initElements(driver, Header.class);
		Header.clickCartButton();
	}

	@Then("I click on checkout button")
	public void i_click_on_checkout_button() throws Throwable {
		PageFactory.initElements(driver, YourCart.class);
		YourCart.clickCheckout();
	}

	@Then("I enter contact details")
	public void i_enter_contact_details() throws Throwable {
		PageFactory.initElements(driver, CheckoutPage.class);
		CheckoutPage.enterContactDetails(prop.getProperty("firstname"), prop.getProperty("lastname"),
				prop.getProperty("postcode"));
	}

	@Then("I click on continue button")
	public void i_click_on_continue_button() throws Throwable {
		CheckoutPage.clickContinueBtn();
	}

	@Then("I click on finish button")
	public void i_click_on_finish_button() throws Throwable {
		CheckoutPage.clickFinishBtn();
	}

	@Then("I close the browser")
	public void i_close_the_browser() throws Throwable {
		driver.quit();
	}
}
