package com.controlepeso.controlePeso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.controlepeso.controllers"})
@EnableJpaRepositories("com.controlepeso.repository")
public class ControlePesoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlePesoApplication.class, args);
	}
}
