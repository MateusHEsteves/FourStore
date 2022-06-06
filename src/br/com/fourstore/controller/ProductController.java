package br.com.fourstore.controller;

import java.util.List;

import br.com.fourstore.enums.CategoryProduct;
import br.com.fourstore.enums.ColorsProduct;
import br.com.fourstore.enums.DepartmentEnum;
import br.com.fourstore.enums.Size;
import br.com.fourstore.enums.TypeProduct;
import br.com.fourstore.model.Product;
import br.com.fourstore.service.ProductService;
import util.Util;

public class ProductController {

	ProductService productService = new ProductService();

	/**
	 * Cadastra um novo produto
	 */
	public void registerProduct() {

		String name = Util.readString("  » Informe o nome do produto: ");
		String description = Util.readString("  » Informe a descrição: ");
		Double price = Util.readDouble("  » Informe o preço: ");
		Integer quantity = Util.readInteger("  » Informe a quantidade: ");
		Size size = Size.menuSize();
		ColorsProduct color = ColorsProduct.menuColors();
		TypeProduct type = TypeProduct.menuType();
		CategoryProduct category = CategoryProduct.menuCategories();
		DepartmentEnum department = DepartmentEnum.menuDepartment();

		Product product = new Product(name, price, size, color, quantity, type, description, category, department);

		productService.create(product);

	}

	/**
	 * 
	 * @return
	 */
	public List<Product> findAllProdutos() {

		List<Product> stockList = productService.readAll();

		for (Product product : stockList) {
			System.out.println(product);
		}

		return stockList;

	}

	/**
	 * 
	 */
	public void updateStock() {

		String SKU = Util.readString("  » Informe o SKU do produto a ser alterado: ");

		Integer quantity = Util.readInteger("  » Informe a quantidade do produto a ser alterado: ");

		String stockChange = Util.readString("  » Informe o tipo e atualização (+/-): ");
		
		Integer quantityInStock;
		
		if(stockChange.equals("+")) {
			quantityInStock = productService.stockPlus(SKU, quantity);
		} else {
			quantityInStock = productService.stockMinus(SKU, quantity);
		}
		

		System.out.println(
				"Produto atualizado com sucesso!  O nosso estoque agora tem " + quantityInStock + " peças do produto.");

	}

}
