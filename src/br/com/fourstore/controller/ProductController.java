package br.com.fourstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fourstore.model.Product;
import br.com.fourstore.service.ProductService;
import br.com.fourstore.service.TransactionService;
import util.Util;

public class ProductController {
	
	ProductService productService = new ProductService();
	
	/**
	 * Cadastra um novo produto
	 */
	public void cadastrarProduto() {

		Integer SKU = Util.readInteger("Informe o Sku: ");
		String nome = Util.readString("Informe o nome: ");
		Double preco = Util.readDouble("Informe o preço: ");
		String tamanho = Util.readString("Informe o tamanho: ");
		String cor = Util.readString("Informe a cor: ");
		Integer quantidade = Util.readInteger("Informe a quantidade: ");
		String tipo = Util.readString("Informe o tipo: ");
		String descricao = Util.readString("Informe a descrição: ");
		String categoria = Util.readString("Informe a categoria: ");
		String departamento = Util.readString("Informe o departamento: ");

		Product product = new Product(SKU, nome, preco, tamanho, cor, quantidade, tipo, descricao, categoria,
				departamento);

		productService.create(product);

	}

	public List<Product> findAllProdutos() {
		
		List<Product> estoqueList = productService.readAll();
		
		for (Product produto : estoqueList) {
			System.out.println(produto);
		}
		
		return productService.readAll();
		
	}

	public void updateEstoque() {
		
		Integer SKU = Util.readInteger("Informe o SKU do produto a ser alterado: ");
		
		Integer quantidade = Util.readInteger("Informe a quantidade do produto a ser alterado: ");
		
		productService.stockChange(SKU, quantidade);
		
		System.out.println("Produto atualizado com sucesso! ");
		
	}

	/*
	 * Cria um carrinho de compras
	 * Define a forma de pagamento
	 * Pergunta se deseja cpf na nota
	 * Imprime o recibo de pagamento
	 */
	public void sellProduct() {

		Map<Product, Integer> cart = new HashMap<>();
		
		Integer option = 1;

		while (option == 1) {

			Integer SKU = Util.readInteger("Informe o SKU do produto a ser vendido: ");
			
			Integer quantity = Util.readInteger("Quantidade de produto a ser vendido: ");

			option = Util.readInteger("Deseja comprar mais produtos? 1 - sim / 2 - Não.");

			cart.put(productService.readBySku(SKU), quantity);

		}

		TransactionService.selectPaymentType();
		
		Integer cpf = null;
		
		option = Util.readInteger("Deseja CPF na nota? 1 - Sim / 2 - Não");
		
			if (option == 1) {
				cpf = Util.readInteger("Informe o CPF: ");
			}
			
			printReceipt(cpf);

	}

	private void printReceipt(Integer cpf) {
		
		
	}

	public void showHistory() {
		// TODO Auto-generated method stub
		
	}
	
}
