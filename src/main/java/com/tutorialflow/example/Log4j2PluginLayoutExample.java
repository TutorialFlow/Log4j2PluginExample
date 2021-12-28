package com.tutorialflow.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2PluginLayoutExample {

	private static Logger logger = LogManager.getLogger(Log4j2PluginLayoutExample.class);
	
	public static void main(String[] args) {

		logger.info("Log4j2Example Info 82348 421347 Message Printed ");
		
		logger.debug("Log4j2Example Debug 123456789  Message Printed");
		
		logger.error("Log4j2Example Error 123123 1234534524 Message Printed");
	}

}
