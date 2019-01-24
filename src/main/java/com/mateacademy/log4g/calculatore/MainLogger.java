package com.mateacademy.log4g.calculatore;

/**
 * @author spasko
 */
public class MainLogger {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.div(5, 2);

		calculator.div(3, 0);
	}

}
