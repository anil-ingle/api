package com.krushidj.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.krushidjapi.util.MethodUtil;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.krushidj.util")
public class AppConfig {
	@Bean
	public MethodUtil methodUtil() {
		return new MethodUtil<>();
	}
}
