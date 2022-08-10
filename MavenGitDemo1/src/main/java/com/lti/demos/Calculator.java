package com.lti.demos;

public class Calculator {

	public String sayHello(){
		return "Say Hello";
	};
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public int sub(int a , int b) {
		return a-b;
	}
	
	public void searchEmp(int empId) {
		if(empId==0 ) {
			throw new ArithmeticException("u entered zero");
		}
		else {
			System.out.println("do something");
		}
	}
}
