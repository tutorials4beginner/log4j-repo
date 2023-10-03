package com.apriltutorials.log.test;

import org.apache.log4j.Logger;

public class App {

	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		// BasicConfigurator.configure();
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