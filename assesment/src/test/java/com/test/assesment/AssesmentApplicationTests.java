package com.test.assesment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssesmentApplicationTests {

	StringCalculator stringCalculator = new StringCalculator();

	@Test
	void testStringCalculatorForSimpleString() throws Exception {
		int addition = stringCalculator.add("1,2");
		assertEquals(3,addition);
	}

	@Test
	void testStringCalculatorForEmptyString() throws Exception {
		int addition = stringCalculator.add("");
		assertEquals(0,addition);
	}

	@Test
	void testStringCalculatorForSingleString() throws Exception {
		int addition = stringCalculator.add("6");
		assertEquals(6,addition);
	}

	@Test
	void testStringCalculatorForBigNumbersString() throws Exception {
		int addition = stringCalculator.add("11,22");
		assertEquals(33,addition);
	}

	@Test
	void testStringCalculatorForBigNewLineString() throws Exception {
		int addition = stringCalculator.add("1\n2,3");
		assertEquals(6,addition);
	}

	@Test
	void testStringCalculatorForDelimerString() throws Exception {
		int addition = stringCalculator.add("//;\n1;2");
		assertEquals(3,addition);
	}

	@Test
	void testStringCalculatorForNegativeNumbersString() throws Exception {
		try {
			int addition = stringCalculator.add("1,-2");

		}catch (Exception exception){
			assertEquals("negative numbers not allowed -2",exception.getMessage());
		}

	}

}
