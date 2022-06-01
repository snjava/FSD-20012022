package org.institute;

import org.institute.bean.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbBeanScopeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbBeanScopeApplication.class, args);
		
		Product pro1 = ctx.getBean(Product.class);
		pro1.printCompany();
		/*
		Product pro1 = ctx.getBean(Product.class);
		Product pro2 = ctx.getBean(Product.class);
		Product pro3 = ctx.getBean(Product.class);
		Product pro4 = ctx.getBean(Product.class);
		Product pro5 = ctx.getBean(Product.class);
		
		System.out.println(pro1);
		System.out.println(pro2);
		System.out.println(pro3);
		System.out.println(pro4);
		System.out.println(pro5);
		 */	
	}
	
	@Bean
	public Product createProduct() {
		Product pro = new Product("Abc Company");
		return pro;
	}
	

	
	
	
	
	
	
}
