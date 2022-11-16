package com.customer1.myproduct;

import com.tcs.core.calculator.CalculatorUtils;
import com.tcs.core.utils.EmailUtils;
import com.tcs.finance.moneymanager.MoneyManager;

public class MyProduct {

	public static void main(String[] args) {
		
		MoneyManager manager = new MoneyManager();
		
		manager.manage();
		
		CalculatorUtils calculatorUtils = new CalculatorUtils();
		calculatorUtils.calculateTax();
		
		EmailUtils emailUtils = new EmailUtils();
		emailUtils.sendEmail();
	}
}
