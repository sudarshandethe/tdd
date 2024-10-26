package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testAddEmptyString() {
		 StringCalculator calculator = new StringCalculator();
		 assertEquals(0, calculator.addEmptyString(""));
	}

	@Test
	void testAddSingleString() {
		 StringCalculator calculator = new StringCalculator();
		 assertEquals(0, calculator.addSingleString("1"));
	}

	@Test
	void testSumOfNumber() {
		 StringCalculator calculator = new StringCalculator();
		 assertEquals(3,calculator.sumOfNumber("//;\n1;2"));
	}

}
