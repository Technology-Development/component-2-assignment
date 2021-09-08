package com.tweetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class AssignmentExerciseTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentExerciseTwoApplication.class, args);
	}
}
