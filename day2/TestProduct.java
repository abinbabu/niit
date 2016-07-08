package com.niit.shoppingcart;

import java.util.ArrayList;

public class TestProduct {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();

		Product p = new Product("pr", "lap", 5000);
		products.add(p);

		for (Product s : products) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPrice());
		}

	}

}
