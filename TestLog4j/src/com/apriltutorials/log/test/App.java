package com.apriltutorials.log.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class App {

	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		App obj = new App();
		obj.runMe("AprilTotorials");
	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled())
			logger.debug("This is debug : " + parameter);

		if (logger.isInfoEnabled())
			logger.info("This is info : " + parameter);

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
	}
}