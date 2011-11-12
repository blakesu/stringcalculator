package com.github.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculate() throws ParseException {
		assertEquals("2", Calculator.calculate(" 1 + 1 ").toString() );
	}

	@Test
	public void testCheck() throws ParseException {
		assertTrue( Calculator.check(" 2 > 1 "));
	}

}
