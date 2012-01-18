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
		assertTrue( Calculator.check(" 2 > 1  "));
	}

	@Test
	public void testCheck2() throws ParseException {
		assertFalse( Calculator.check( "false and true" ));
	}
	
	@Test
	public void testCheck3() throws ParseException {
		assertTrue( Calculator.check( "true and true and false " ));
	}
}
