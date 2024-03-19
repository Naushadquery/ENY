package com.nau;

public class Calculator {
	
	private int result = 0;  // instance variable
	
	public void add(int num) { // instance methods
		result = result + num;
	}
	public void sub(int num) {
		result = result - num;
	}
	
	public void result() {
		System.out.println("Result : " + result);
	}
}
