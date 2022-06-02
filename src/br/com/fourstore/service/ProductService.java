package br.com.fourstore.service;

import java.util.List;

import br.com.fourstore.data.ProductData;
import br.com.fourstore.model.Product;

public class ProductService {
	
	ProductData db;
	
	public ProductService() {
		this.db =  new ProductData();
	}

	public void create(Product product) {
		db.save(product);
	}
	
	public List<Product> readAll() {
		return db.findAll();
	}
	
	public Integer stockChange(String sku, Integer quantidade) {
		
		Product produto = db.findBySku(sku);
		
		if (produto == null) {
			return null;
		}
		
		if (produto.getQuantity() + quantidade < 0) {
			return null;
		}
		
		produto.setQuantity(produto.getQuantity() + quantidade);
		
		db.update(produto);
		
		return produto.getQuantity();
		
	}

	public Product readBySku(String sku) {
		return db.findBySku(sku);		
	}
	
	public void update(Product produto) {
	}
	
	public void delete(Product produto) {
	}



}
