package com.bit.StudentSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bit")
public class StudentSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSpringBootApplication.class, args);
	}

}
