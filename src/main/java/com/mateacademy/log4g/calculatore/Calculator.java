package com.mateacademy.log4g.calculatore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author spasko
 */
public class Calculator {

	private static final Logger LOG = LogManager.getLogger(Calculator.class);
	private static final Logger LOGMAIL = LogManager.getLogger("error-logger");

	public int div(int a, int b) {
		int result = -666;
		LOG.debug("input values a={}, b={}", a, b);
		try {
			result = a / b;
		} catch (Exception e) {
			LOGMAIL.error("Exception when div working {}", e.getMessage());
		}
		LOG.info("Method div return {}", result);
		return result;
	}

}
