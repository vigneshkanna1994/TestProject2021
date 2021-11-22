package com.myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks {

	@Before(order = 2)
	public void beforeSceanrio() {
		System.out.println("beforeSceanrio order 2 all");
	}

	@Before(order = 1)
	public void beforeSceanrio1() {
		System.out.println("beforeSceanrio1 order1 all");
	}

	@After("@smoke")
	public void afterScenario() {
		System.out.println("afterScenario smoke");
	}

	@After("@prod")
	public void afterSceanrio1() {
		System.out.println("afterSceanrio prod");
	}

	@AfterStep
	public void afterSteps() {
		System.out.println("afterSteps");

	}

}
