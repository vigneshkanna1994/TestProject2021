package com.step.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepDef {
	@Given("User lauch an application")
	public void user_lauch_an_application() {
		System.out.println("given sd ");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String Username, String Password) {
		System.out.println("when sd " + Username + Password);
	}
}
