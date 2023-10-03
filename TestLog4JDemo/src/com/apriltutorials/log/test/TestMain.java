package com.apriltutorials.log.test;

import java.util.logging.Logger;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("I am main method !");
		Logger log = Logger.getLogger("Test");
		log.info("Hello World !");
		log.warning("Hello World !");
	}
}
