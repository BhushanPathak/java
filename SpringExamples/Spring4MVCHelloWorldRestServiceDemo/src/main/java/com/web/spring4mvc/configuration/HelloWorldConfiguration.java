package com.web.spring4mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.web.spring4mvc")
public class HelloWorldConfiguration {

	// no view resolvers as rest does not need a view
}
