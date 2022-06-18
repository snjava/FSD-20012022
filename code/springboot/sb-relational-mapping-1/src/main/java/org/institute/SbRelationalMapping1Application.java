package org.institute;

import java.util.List;

import org.institute.entity.Education;
import org.institute.repository.EducationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbRelationalMapping1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbRelationalMapping1Application.class, args);
		//EducationRepository repo = ctx.getBean(EducationRepository.class);
		//List<Education> edu = repo.findAll();
	}

}
