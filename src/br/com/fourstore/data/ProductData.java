package br.com.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fourstore.model.Product;

public class ProductData implements DaoInterface<Product> {

	static List<Product> estoqueDeProdutos = new ArrayList<>();

	@Override
	public void save(Product produto) {
		estoqueDeProdutos.add(produto);
	}

	@Override
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

	@Override
	public void update(Product produto) {
		delete(produto);
		save(produto);
	}

	@Override
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
