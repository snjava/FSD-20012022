package org.institute.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {
	public Address() {
		System.out.println("Address Object Created");
	}
	
	
	public void demo() {
		System.out.println("This is the method from address class");
	}
	
}
