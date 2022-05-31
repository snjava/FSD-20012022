package org.institute;

import org.institute.bean.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // This annotation is to configure the application and also scan the bean classes.
public class SbIntroApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SbIntroApplication.class, args); // This line will start the spring boot application.
		
		Employee emp = ctx.getBean(Employee.class); // to get the object of class present inside Spring container 
		
		emp.empInfo();
	}

}
