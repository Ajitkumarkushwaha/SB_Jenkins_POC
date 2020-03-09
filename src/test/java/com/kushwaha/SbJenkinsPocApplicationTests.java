package com.kushwaha;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbJenkinsPocApplicationTests {
	
	private static final Logger logger = LoggerFactory.getLogger(SbJenkinsPocApplication.class);

	@Test
	void contextLoads() {
		logger.info("Jenkins Job Is Started With Junit Test !!!!");
	}

}
