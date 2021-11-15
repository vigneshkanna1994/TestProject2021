package com.demo.pkd;

import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void method1() {
		System.out.println("method1");
	}

	@Test(priority = 0)
	public void method2() {
		System.out.println("method2");
	}

	@Test(priority = 1)
	public void method3() {
		System.out.println("metho3");
	}

	@Test(priority = -1)
	public void method4() {
		System.out.println("method4");
	}

}
