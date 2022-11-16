package com.tcs.finance.moneymanager;

import com.tcs.core.calculator.CalculatorUtils;

public class MoneyManager {

	public void manage() {
		
		CalculatorUtils calculatorUtils = new CalculatorUtils();
		
		calculatorUtils.predictInflation();
	}
}
