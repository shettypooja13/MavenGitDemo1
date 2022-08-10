package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTests {

	Calculator c = new Calculator();
	
	@Disabled
	@Test
	public void testSayHello() {
		Assertions.assertEquals("Say Hello", c.sayHello());
		
	}
	
	@Test
	public void testAdd() {
		int result = c.add(100, 200);
		Assertions.assertEquals(300,result);
	}
	
	@Test
	public void testSub() {
		int result = c.sub(200, 100);
		Assertions.assertEquals(100, result,"Please check Subtraction method");
	}
	
	@Disabled
	@Test
	public void testAssertNulls() {
		String s1 = null;
		String s2 = "Pooja";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Disabled
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10); //this will pass the test
		Assertions.assertTrue(10<20, "10 is smaller");
		Assertions.assertNotEquals("Hello", "Hello0");
	}
	
	@Disabled
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size(),"Size don't match");
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		
		Assertions.assertEquals(2, myList.size());
	}
}
