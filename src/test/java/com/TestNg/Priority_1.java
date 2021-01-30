package com.TestNg;

import org.testng.annotations.Test;

public class Priority_1 {
	@Test(priority = -3)
	public static void mobile() {
		System.out.println("mobole search");
	}

	@Test(priority = -3)
	public static void phone() {
		System.out.println("phone search");
	}

	@Test
	public static void laptop() {
		System.out.println("lap search");
	}

	@Test(priority = 1)
	public static void music_Player() {
		System.out.println("music player");
	}

}
