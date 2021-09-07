package com.avm.awsPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.avm.*"})
public class AwsPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsPracticeApplication.class, args);
	}

}
