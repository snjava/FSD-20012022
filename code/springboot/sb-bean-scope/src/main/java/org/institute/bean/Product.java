package org.institute.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope(scopeName = "singleton") // to set the bean scope
public class Product {
	
	private String company;
	
	public Product(String company) {
		this.company = company;
		System.out.println("Product Created with compnay name...");
	}
	
	
	public void printCompany() {
		System.out.println("Compnay Name :  " + company);
	}
}
