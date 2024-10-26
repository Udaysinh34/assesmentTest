package com.test.assesment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssesmentApplicationTests {

	StringCalculator stringCalculator = new StringCalculator();

	@Test
	void testStringCalculatorForSimpleString() {
		int addition = stringCalculator.add("1,2");
		assertEquals(3,addition);
	}

	@Test
	void testStringCalculatorForEmptyString() {
		int addition = stringCalculator.add("");
		assertEquals(0,addition);
	}

}
