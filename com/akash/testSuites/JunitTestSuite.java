package com.akash.testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestJunit1.class, TestJunit2.class
})
public class JunitTestSuite {
	//A test suite bundles a few unit test cases and runs them together. 
	//In JUnit, both @RunWith and @Suite annotation are used to run the suite test.
}
