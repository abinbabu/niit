package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.shoppingcart");

		context.refresh();

		Category c = (Category) context.getBean("category");

		c.setID("01");
		c.setName("Tom");
		c.setDescription("Mobile");

		System.out.println(c.getID() + ' ' + c.getName() + ' ' + c.getDescription());

		System.out.println("category is created");

		Product p = (Product) context.getBean("product");

		p.setID("PRD1");
		p.setName("Laptop");
		p.setPrice("50000");

		System.out.println(p.getID() + ' ' + p.getName() + ' ' + p.getPrice());

		System.out.println("Product is created");

	}
}