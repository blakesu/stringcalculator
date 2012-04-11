package com.github.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculate() throws ParseException {
		assertEquals("2", Calculator.calculate(" 1 + 1 ").toString() );
	}

	@Test
	public void testCalculate1() throws ParseException {
		assertEquals("29", Calculator.calculate(" 3*9 +2 ").toString() );
	}
	
	@Test
	public void testCalculate2() throws ParseException {
		assertEquals("58", Calculator.calculate(" 2* ( 3*9 +2 ) ").toString() );
	}
	
	@Test
	public void testCalculate3() throws ParseException {
		assertEquals("2.5", Calculator.calculate(" 5/2 ").toString() );
	}
	
	@Test
	public void testCalculate4() throws ParseException {
		assertEquals("3.4", Calculator.calculate(" 8.4-5 ").toString() );
	}
}
