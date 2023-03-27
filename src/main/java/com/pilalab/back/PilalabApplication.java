package com.pilalab.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.pilalab.back.entity")
@EnableJpaRepositories(basePackages = "com.pilalab.back.service")
public class PilalabApplication {

	public static void main(String[] args) {
		SpringApplication.run(PilalabApplication.class, args);
	}

}
