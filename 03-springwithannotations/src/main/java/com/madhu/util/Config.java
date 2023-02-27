package com.madhu.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
	public Config() {

	System.out.println("config object is created...");
	}
	@Bean
	public EncPassword getInstance() {
		EncPassword encPaswword = new EncPassword("SHA-01");
		return encPaswword;
	}

}
