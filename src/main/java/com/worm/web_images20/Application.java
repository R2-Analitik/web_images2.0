package com.worm.web_images20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableJpaRepositories("com.worm.web_images20.repository")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
