package com.edureka.javasql1.webservices.products;

import java.util.ArrayList;

public class ProductsLister {

	public String list(
		String category){

		ArrayList<String> products = new ArrayList<>();		
		
		if (category.equals("Fruits & Vegetables")) {
			
			products.add("Fresh Apple Royal Gala, pack of 4");
			products.add("Fresh Pomegranate - Small, 1000 g");
			
		}else if (category.equals("Snacks & Biscuits")) {
			
			products.add("McCain French Fries Regular Pack, 420g");
			products.add("McCain Potato Cheese Shotz, 400g (Regular Pack)");			
			products.add("McCain Chilli Garlic Potato Bites, 420g (Regular Pack)");
			
		}else if (category.equals("Breakfast Food")){
		
			products.add("Kellogg's Muesli with 21% Fruit, Nut & Seeds");
		}
		
		StringBuilder result = new StringBuilder();
		
		for (String product : products) {
			result.append(product).append(" , ");
		}
		return result.toString();
	}
}
