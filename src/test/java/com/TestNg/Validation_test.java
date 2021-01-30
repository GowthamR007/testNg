package com.TestNg;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Validation_test {
	@Test
	public static void validate_1() {

		String actual = "gowtham";

		String expected = "karthi";

//	assertEquals(actual, expected);

//	assertNotEquals(actual, expected);

//	assertSame(actual, expected);

//	assertNull(actual);	

//	assertNotNull(actual);
		int age = 19;
		assertTrue(age >= 23);

//		assertFalse(age >= 23);

	}

}
