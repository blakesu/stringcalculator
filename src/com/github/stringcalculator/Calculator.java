package com.github.stringcalculator;

import java.math.BigDecimal;

public class Calculator {
   
	public static BigDecimal calculate( String expression ) throws ParseException{
		_Calculator cal = new _Calculator(expression);
		return cal.caculate();
	}
	
	
	public static boolean check( String expression ) throws ParseException{
		_Calculator cal = new _Calculator(expression);
		return cal.check();
	}
}
