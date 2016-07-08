package com.niit.shoppingcart;

public class TestProduct {

	public static void main(String[] args) {
		
		Product p=new Product();
		p.setId("PRODUCT1");
		p.setName("mobile");
		p.setPrice(-5000);
		
		
		System.out.println(  p.getId()        );
		System.out.println(  p.getName()      );
		System.out.println(  p.getPrice()        );
		

	}

}
