package br.com.fourstore.model;

import java.math.BigDecimal;
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
	public BigDecimal subTotalValue() {
		
		BigDecimal subTotal = new BigDecimal(0);
		
		for (Map.Entry<Product, Integer> productList : this.cart.entrySet()) {

			Product product = productList.getKey();
			Integer quantity = productList.getValue();
			
			subTotal.add(new BigDecimal(product.getPrice() * quantity));
		}
		
		return subTotal;
		
	}

}
