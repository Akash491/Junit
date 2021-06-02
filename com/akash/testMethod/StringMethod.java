package com.akash.testMethod;

public class StringMethod {
	private String user;
	
	public StringMethod(String user) {
		this.user = user;
	}
	
	public String greetUser() {
		return "Hi " + this.user;
	}
}
