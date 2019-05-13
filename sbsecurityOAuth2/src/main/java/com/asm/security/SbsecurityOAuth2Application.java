package com.asm.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SbsecurityOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SbsecurityOAuth2Application.class, args);
	}

}
