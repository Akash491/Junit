package com.akash.testMethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	StringMethod stringMethod = new StringMethod("Akash");
	@Test
	
	public void testStringMethod() {
		assertEquals("Hi Akash", stringMethod.greetUser());
	}
}
