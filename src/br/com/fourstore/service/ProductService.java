package br.com.fourstore.service;

import java.util.List;

import br.com.fourstore.data.ProductData;
import br.com.fourstore.model.Product;

public class ProductService {
	
	ProductData db = new ProductData();
	
	public void create(Product product) {
		db.save(product);
	}
	
	public List<Product> readAll() {
		return db.findAll();
	}
	
	public Integer stockChange(Integer sku, Integer quantidade) {
		
		Product produto = db.findBySku(sku);
		
		if (produto == null) {
			return null;
		}
		
		if (produto.getQuantidade() + quantidade < 0) {
			return null;
		}
		
		produto.setQuantidade(produto.getQuantidade() + quantidade);
		
		db.update(produto);
		
		return produto.getQuantidade();
		
	}

	public Product readBySku(Integer sku) {
		return db.findBySku(sku);		
	}
	
	public void update(Product produto) {
	}
	
	public void delete(Product produto) {
	}



}
