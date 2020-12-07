package com.ju3.beans;

import org.junit.Assert;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	int positiveA;
	int positiveB;
	int expectedPositiveSum;

	int negativeA;
	int negativeB;
	int expectedNegativeSum;
	int actualSum;
	Calculator calculator;

	@Override
	protected void setUp() throws Exception {
		calculator = new Calculator();
		positiveA = 10;
		positiveB = 20;
		expectedPositiveSum = 40;

		negativeA = -30;
		negativeB = -40;
		expectedNegativeSum = -70;
	}

	public void testAddPositiveNumbers() {
		actualSum = calculator.add(positiveA, positiveB);
		Assert.assertEquals(expectedPositiveSum, actualSum);
	}

	public void testAddNegativeNumbers() {
		actualSum = calculator.add(negativeA, negativeB);
		Assert.assertEquals(expectedNegativeSum, actualSum);
	}

	@Override
	protected void tearDown() throws Exception {
		calculator = null;
	}

}
