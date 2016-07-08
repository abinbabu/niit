package com.niit.shoppingcart;

public class Product {
	
	private String id;
	private String name;
	private double price;
	
	
	public Product(String id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0)
		{
			System.out.println("error");
		}
		else{
		this.price = price;
		}
	}
	
	
	

}
