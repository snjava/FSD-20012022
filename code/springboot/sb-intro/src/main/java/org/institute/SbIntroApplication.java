package org.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This annotation is to configure the application and also scan the bean classes.
public class SbIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbIntroApplication.class, args); // This line will start the spring boot application.
	}

}
