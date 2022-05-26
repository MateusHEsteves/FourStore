package br.com.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fourstore.model.Product;

public class ProductData {

	List<Product> estoqueDeProdutos = new ArrayList<>();

	public void save(Product produto) {
		estoqueDeProdutos.add(produto);
	}

	public List<Product> findAll() {
		return estoqueDeProdutos;
	}

	public Product findBySku(Integer sku) {
		for (Product produto : estoqueDeProdutos) {
			if (produto.getSku() == sku) {
				return produto;
			}
		}
		return null;
	}

	public int getIndexOfProduto(Product produto) {
		return estoqueDeProdutos.indexOf(produto);
	}

	public void update(Product produto) {
		delete(produto);
		save(produto);
	}

	public void delete(Product produto) {
		estoqueDeProdutos.remove(getIndexOfProduto(produto));
	}

	public void deleteBySku(Integer sku) {
		estoqueDeProdutos.remove(getProdutoBySku(sku));
	}

	private Product getProdutoBySku(Integer sku) {
		for (Product produto : estoqueDeProdutos) {
			if (produto.getSku() == sku) {
				return produto;
			}
		}
		return null;
	}
}
