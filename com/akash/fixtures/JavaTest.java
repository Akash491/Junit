package com.akash.fixtures;

import junit.framework.TestCase;

public class JavaTest extends TestCase{
//Fixtures is a fixed state of a set of objects used as a baseline for running tests.
//The purpose of a test fixture is to ensure that there is a well-known and fixed environment in which 
//tests are run so that results are repeatable.
//It includes −
//setUp() method, which runs before every test invocation.
//tearDown() method, which runs after every test method.
	
	protected int value1, value2;
	
	//assigning the values
	protected void setUp() {
		value1 = 3;
		value2 = 3;
	}
	
	//test method to add two values
	public void testAdd() {
		double result = value1 + value2;
		assertTrue(result == 6);
	}
}
