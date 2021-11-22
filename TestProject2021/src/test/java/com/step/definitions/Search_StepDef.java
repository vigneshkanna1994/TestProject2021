package com.step.definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.amazon.implmentation.Product;
import com.amazon.implmentation.Search;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_StepDef {
	Product product;
	Search search;

	@Given("I have search field on amazon page")
	public void I_have_search_field_on_amazon_page() {
		System.out.println("step1: I am on search page");
	}

	@When("I search for a product name {string} and price {int}")
	public void I_search_for_a_product_name_and_price(String productName, Integer price) {
		System.out.println("Step2: Search product with name: " + productName + " Price: " + price);
		product = new Product(productName, price);
	}

	@Then("Product name with {string} should be displayed")
	public void Product_with_name_should_be_displayed(String productName) {
		System.out.println("Step3: product: " + productName + " is displayed");
		search = new Search();
		String name = search.displayProduct(product);
		System.out.println("product name is " + name);
		Assert.assertEquals(name, product.getProductName());
	}

	@Then("Print below details")
	public void print_below_details(DataTable dataTable) {
		List<List<String>> listData = dataTable.asLists(String.class);
		System.out.println(listData);
		for (List<String> data : listData) {
			System.out.println(data.get(0));
			System.out.println(data);
			System.out.println("----------------------");
		}
	}

	@Then("Print below details with columns")
	public void print_below_details_with_columns(DataTable dataTable) {
		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> data : userList) {
			System.out.println(data);
			System.out.println("-------------");
//			System.out.println("vicky "+data.get(1));
//			System.out.println("-------------");
//			System.err.println(data.get("4th"));
		}
	}

}
