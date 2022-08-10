package com.lti.demos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

	Calculator c = new Calculator();
	int sum = 0;
	
	@BeforeAll   //only once before all the test cases
	public static void testStartDbConn() {
		System.out.println("DB connection is up only once");
	}
	
	@BeforeEach //before each test case
	public void beforeStart() {
		sum = 0;
		System.out.println("Sum is Zero" + sum);
	}
	
	@Test
	public void testAdd() {
		System.out.println("Test case 1");
		int result = c.add(100, 200);
		Assertions.assertEquals(300,result);
	}
	
	@Test
	public void testSub() {
		System.out.println("Test case 2");
		int result = c.sub(200, 100);
		Assertions.assertEquals(100, result,"Please check Subtraction method");
	}
	
	@AfterEach  //after each test case
	public void afterTest() {
		System.out.println("Some object null");
	}
	
	@AfterAll  // after all test cases, only once
	public static void testShutDown() {
		System.out.println("DB connections shut down");
	}

}
