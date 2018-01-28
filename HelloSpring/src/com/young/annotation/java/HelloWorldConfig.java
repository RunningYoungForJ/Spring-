package com.young.annotation.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorldBean() {
		return new HelloWorld();
	}
}
