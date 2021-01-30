package com.TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_1 {
	@Test
	@Parameters({"username","password"})
	public static void credentials(String name, int password) {

		System.out.println("username :" + name);
		System.out.println("password :" + password);
		
	}
}
