package com.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ignore_1 {
	@BeforeSuite
	public static void set_Property() {
		System.out.println("set property");
	}

	@BeforeTest
	public static void driver_Launch() {
		System.out.println("driver launch");
	}

	@BeforeClass
	public static void url() {
		System.out.println("url");
	}

	@BeforeMethod
	public static void login() {
		System.out.println("login");
	}

	@Test
	public static void mobile_Search() {
		System.out.println("mobile search");
	}

	@Test
	public static void lap_Search() {
		System.out.println("lap search");
	}

	@Test
	public static void laptop_Search() {
		System.out.println("laptop search 1");
	}

	
	@Test
	public static void mobilephone() {
		System.out.println("mobile search 1");
	}

	@AfterMethod
	public static void logout() {
		System.out.println("logout");
	}

	@AfterClass
	public static void verifyhomepage() {
		System.out.println("verify home page");
	}

	@AfterTest
	public static void browser_Close() {
		System.out.println("browser close");
	}

	@AfterSuite
	public static void delete_Cookies() {
		System.out.println("delete cookies");
	}

}
