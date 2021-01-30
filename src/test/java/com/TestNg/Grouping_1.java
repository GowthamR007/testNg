package com.TestNg;

import org.testng.annotations.Test;

public class Grouping_1 {
	@Test(groups = "Electronics")
	public static void laptop_Search() {
		System.out.println("laptop");
	}

	@Test(groups = "Electronics")
	public static void mobile_Search() {
		System.out.println("mobile");
	}

	@Test(groups = "Electronics")
	public static void earphone() {
		System.out.println("earphone");
	}

	@Test(groups = "book")
	public static void books() {
		System.out.println("books");
	}

	@Test(groups = "book")
	public static void navel() {
		System.out.println("ramayanam");
	}
}
