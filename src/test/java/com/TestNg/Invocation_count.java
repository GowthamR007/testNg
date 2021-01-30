package com.TestNg;

import org.testng.annotations.Test;

public class Invocation_count {
	@Test
	public static void browse_Launch() {
		System.out.println("browser launch");
	}

	@Test(invocationCount=3)
	public static void refresh() {
		System.out.println("refresh");
	}

	@Test
	public static void url() {
		System.out.println("url");
	}

}
