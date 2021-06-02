package com.akash.testSuites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit2 {
	String message = "Robert";
	@Test
	public void testString() {
		String str1 = "String 1";
		assertEquals("String 1", str1);
	}
}
