package com.example.gestionF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GestionFApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionFApplication.class, args);

	}

}
