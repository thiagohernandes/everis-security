package com.security.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EverisSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverisSecurityApplication.class, args);
	}

}
