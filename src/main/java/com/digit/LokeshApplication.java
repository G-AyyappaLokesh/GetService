package com.digit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"com.digit"})
public class LokeshApplication extends SpringBootServletInitializer {
	
	   @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(LokeshApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(LokeshApplication.class, args);
	}

}
