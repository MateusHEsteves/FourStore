package br.com.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fourstore.model.Product;

/**
 * 
 * @author mesteves
 *
 */
public class ProductData implements DaoInterface<Product> {

	/**
	 * 
	 */
	static List<Product> stockProduct = new ArrayList<>();

	/**
	 * 
	 */
	@Override
	public void save(Product product) {
		stockProduct.add(product);
	}

	/**
	 * 
	 */
	@Override
	public List<Product> findAll() {
		return stockProduct;
	}

	/**
	 * 
	 * @param sku
	 * @return
	 */
	public Product findBySku(String sku) {
		for (Product product : stockProduct) {
			if (product.getSku().equals(sku)) {
				return product;
			}
		}
		System.err.println("Produto não encontrado!");
		return null;
	}

	/**
	 * 
	 * @param product
	 * @return
	 */
	public int getIndexOfProduto(Product product) {
		return stockProduct.indexOf(product);
	}

	/**
	 * 
	 */
	@Override
	public void update(Product product) {
		delete(product);
		save(product);
	}

	/**
	 * 
	 */
	@Override
	public void delete(Product product) {
		stockProduct.remove(getIndexOfProduto(product));
	}

	/**
	 * 
	 * @param sku
	 */
	public void deleteBySku(String sku) {
		stockProduct.remove(findBySku(sku));
	}

}
