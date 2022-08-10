package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {

	@DisplayName(" should pass test cases if all parma are not null")
	@ParameterizedTest
	@ValueSource(strings = {"Hello","World"})
	public void testParams(String mssg) {
		Assertions.assertNotNull(mssg);
	}
	
	@Test     //testing for lambda equations
	public void testLambdaList() {
		Integer[] intArray = {10,20,5,25};
		List<Integer> intList = Arrays.asList(intArray);
		
		Assertions.assertAll(
				()->assertEquals(10,intList.get(0)),
				()->assertEquals(20,intList.get(1)),
				()->assertEquals(5,intList.get(2)),
				()->assertEquals(25,intList.get(3))
				);
	}

}
