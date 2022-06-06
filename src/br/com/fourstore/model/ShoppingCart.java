package br.com.fourstore.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mesteves
 *
 */
public class ShoppingCart {
	
	/**
	 * 
	 */
	private Map<Product, Integer> cart;
	
	/**
	 * 
	 */
	public ShoppingCart() {
		this.cart = new HashMap<>();
	}
	
	public Map<Product, Integer> getCart() {
		return cart;
	}



	public void add(Product product, Integer quantity) {
		cart.put(product, quantity);
	}

	/**
	 * 
	 */
	public void listProduct() {
		
		for (Map.Entry<Product, Integer> productList : this.cart.entrySet()) {

			Product product = productList.getKey();
			Integer quantity = productList.getValue();

			System.out.println(product.getName() + ", Quantidade " + quantity + ", valor" + product.getPrice());
		}
		
		System.out.println("Subtotal: " + subTotalValue());

	}

	/**
	 * 
	 * @return
	 */
	public Double subTotalValue() {
		
		Double subTotal = 0.0;
		
		for (Map.Entry<Product, Integer> productList : this.cart.entrySet()) {

			Product product = productList.getKey();
			Integer quantity = productList.getValue();
			
			subTotal += product.getPrice() * quantity;
		}
		
		return subTotal;
		
	}

}
