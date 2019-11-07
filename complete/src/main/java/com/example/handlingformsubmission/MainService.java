package com.example.handlingformsubmission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
	public class MainService extends SpringBootServletInitializer {

	    public static void main(String[] args) {
	        SpringApplication.run(MainService.class, args);
	    }


	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
	        return builder.sources(MainService.class);
	    }

	}

