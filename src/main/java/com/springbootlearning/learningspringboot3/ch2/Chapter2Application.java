package com.springbootlearning.learningspringboot3.ch2;

import com.springbootlearning.learningspringboot3.ch2.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Chapter2Application {

	private static final Logger logger = LoggerFactory.getLogger(
			Chapter2Application.class
	);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarDatabaseApplication.class, args);
		logger.info("Application started");
	}

}
