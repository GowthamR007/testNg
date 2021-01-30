package com.TestNg;

import org.testng.annotations.Test;

public class Dependency {
	@Test
	private void laptopSearch() {
		System.out.println("laptop");
	}

	@Test
	private void mobileSearch() {
		System.out.println("mobile");
	}

	@Test
	private void samsung() {
		System.out.println("samsung");
	}

	@Test(dependsOnMethods = "mobileSearch")
	private void offer() {
		System.out.println("offer");
	}

}
