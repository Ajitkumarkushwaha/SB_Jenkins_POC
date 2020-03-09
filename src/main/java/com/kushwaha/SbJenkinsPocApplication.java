package com.kushwaha;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbJenkinsPocApplication {

	private static final Logger logger = LoggerFactory.getLogger(SbJenkinsPocApplication.class);
	
	public static void main(String[] args) {
		logger.info("Jenkins Job Is Started !!!!");
		SpringApplication.run(SbJenkinsPocApplication.class, args);
	}

}
