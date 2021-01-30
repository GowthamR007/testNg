package com.TestNg;

import org.testng.annotations.Test;

public class Time_out {
	@Test(timeOut = 2000)
	public static void navigation() throws Throwable {
		System.out.println("ready to navigate");
		Thread.sleep(1000);
		System.out.println("navigation completed");
	}

}
