package com.build;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsProjApplication {
	public static final Logger logger=LoggerFactory.getLogger(SpringJenkinsProjApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("init method executed.......");
	}
	public static void main(String[] args) {
		logger.info("main method executed.........");
		SpringApplication.run(SpringJenkinsProjApplication.class, args);
	}

}

