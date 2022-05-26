package br.com.fourstore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.com.fourstore.model.Product;
import br.com.fourstore.service.ProductService;

public class MenuController {

	private Scanner scanner = new Scanner(System.in);

	ProductService productService = new ProductService();

	public MenuController(String opcao) {
		System.out.println("Programa foi inicializado pela " + opcao + "ª opção.");
		inicializeMenu();
	}

	private void inicializeMenu() {
		while (true) {

			Integer opcao = menuPrincipal();

			switch (opcao) {
			case 1:
				cadastrarProduto();
				continue;

			case 2:
				updateEstoque();
				continue;
			case 3:
				findAllProdutos();
				continue;
			case 4:
				sellProduct();
				continue;

			default:
				break;
			}
		}
	}

	/**
	 * Exibe um menu no console e solicita uma entrada do tipo inteiro usando o
	 * Scanner e retorna essa entrada.
	 * 
	 * @return Integer inputado pelo usuÃ¡rio do sistema.
	 */
	public Integer menuPrincipal() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║             × Menu Inicial ×             ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Cadastrar Produto                  ║");
		System.out.println("║ » 2 - Atualizar Estoque                  ║");
		System.out.println("║ » 3 - Listar Estoque                     ║");
		System.out.println("║ » 4 - Comprar Produto                    ║");
		System.out.println("║ » 5 - Exibir Histórico                   ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 0 - Sair Sistema                       ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}

	/**
	 * Cadastra um novo produto
	 */
	public void cadastrarProduto() {

		Integer sku = Integer.parseInt(readString("Informe o Sku: "));
		String nome = readString("Informe o nome: ");
		Double preco = Double.parseDouble(readString("Informe o preÃ§o: "));
		String tamanho = readString("Informe o tamanho: ");
		String cor = readString("Informe a cor: ");
		Integer quantidade = Integer.parseInt(readString("Informe a quantidade: "));
		String tipo = readString("Informe o tipo: ");
		String descricao = readString("Informe a descriÃ§Ã£o: ");
		String categoria = readString("Informe a categoria: ");
		String departamento = readString("Informe o departamento: ");

		Product product = new Product(sku, nome, preco, tamanho, cor, quantidade, tipo, descricao, categoria,
				departamento);

		productService.create(product);

	}

	private String readString(String mensagem) {
		System.out.print(mensagem);
		String retorno = scanner.nextLine();
		return retorno;
	}

	public List<Product> findAllProdutos() {
		List<Product> estoqueList = productService.readAll();
		for (Product produto : estoqueList) {
			System.out.println(produto);
		}
		return productService.readAll();
	}

	public void updateEstoque() {
		System.out.println("Informe o sku do produto a ser alterado: ");
		Integer sku = scanner.nextInt();
		scanner.nextLine();
		Product produtoASerAlterado = productService.readBySku(sku);
		System.out.println("Informe a quantidade do produto a ser alterado: ");
		Integer quantidade = (produtoASerAlterado.getQuantidade() + scanner.nextInt());
		scanner.nextLine();
		produtoASerAlterado.setQuantidade(quantidade);
		productService.update(produtoASerAlterado);
		System.out.println("Produto atualizado com sucesso! ");
	}

	/*
	 * Criar um carrinho de compras Forma de pagamento perguntar se deseja cpf na
	 * nota recibo de pagamento
	 */
	private void sellProduct() {

		Map<Product, Integer> cart = new HashMap<>();

		Integer option = 1;

		while (option == 1) {

			System.out.println("Informe o SKU do produto a ser vendido: ");
			Integer sku = scanner.nextInt();
			System.out.println("Quantidade de produto a ser vendido: ");
			Integer quantity = scanner.nextInt();

			System.out.println("Deseja comprar mais produtos? 1 - sim / 2 - Não.");
			option = scanner.nextInt();

			cart.put(productService.readBySku(sku), quantity);

		}

		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║          × Metodo de pagamento ×         ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Money                              ║");
		System.out.println("║ » 2 - Debit card                         ║");
		System.out.println("║ » 3 - Credit card                        ║");
		System.out.println("║ » 4 - Pix                                ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer metodoDePagamento = scanner.nextInt();

		switch (metodoDePagamento) {
		case 1:
			System.out.println("Pagamento no dinheiro realizado com sucesso!");
			break;
		case 2:
			while (true) {

				System.out.println("Informe o nome do titular: ");
				String titularName = scanner.nextLine();
				System.out.println("Informe o número do cartão: ");
				Integer numberCard = scanner.nextInt();
				System.out.println("Informe o número do cvv: ");
				Integer numberCvv = scanner.nextInt();
				System.out.println("Nome: " + titularName + ", " + numberCard + ", " + numberCvv + ".");
				System.out.println("Os dados acima estão corretos? 1 - Sim / 2 - Não.");
				option = scanner.nextInt();
				if (option == 2) {
					continue;
				}
				break;
			}

			System.out.println("Pagamento no débito realizado com sucesso!");

			break;
		case 3:

			while (true) {

				System.out.println("Informe o nome do titular: ");
				String titularName = scanner.nextLine();
				System.out.println("Informe o número do cartão: ");
				Integer numberCard = scanner.nextInt();
				System.out.println("Informe o número do cvv: ");
				Integer numberCvv = scanner.nextInt();
				System.out.println("Nome: " + titularName + ", " + numberCard + ", " + numberCvv + ".");
				System.out.println("Os dados acima estão corretos? 1 - Sim / 2 - Não.");
				option = scanner.nextInt();
				if (option == 2) {
					continue;
				}
				break;
			}

			System.out.println("Pagamento no crédito realizado com sucesso!");
		case 4:

			System.out.println("█▀▀▀▀▀█ ▀▀    ▀ █ █▀▀▀▀▀█");
			System.out.println("█ ███ █ █▄ █▀█▄▀  █ ███ █");
			System.out.println("█ ▀▀▀ █ ▀█▀▀▄██▀█ █ ▀▀▀ █");
			System.out.println("▀▀▀▀▀▀▀ ▀▄▀▄▀ ▀ ▀ ▀▀▀▀▀▀▀");
			System.out.println("▀▀▀▀▄ ▀▄█▄    ▀▀██ ▄▀▀▀▄▀");
			System.out.println(" ▀█ ▀▄▀█   ▄▄▄█ ▄  █ ▄▄▄ ");
			System.out.println("  █  ▄▀█▀█▄█▀██▀▄█████▀▄█");
			System.out.println("▄▀ ██ ▀█▄█  ▀▀▄  █▄▄ ▀▀█▄");
			System.out.println("   ▀ ▀▀ ▄▄▄▄▄▀ ▄█▀▀▀███ █");
			System.out.println("█▀▀▀▀▀█  ▄▀ ▄ █▄█ ▀ █▄ ██");
			System.out.println("█ ███ █ ▄▀ █ ▄  ▀██▀██ ▄█");
			System.out.println("█ ▀▀▀ █ ██ █▀█ ▀ ▄▀▀▀▀█▀ ");
			System.out.println("▀▀▀▀▀▀▀ ▀ ▀ ▀▀▀    ▀▀▀▀▀▀");
			
			System.out.println("Confirmando pagamento PIX");
			try {
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			} catch (Exception e) {
				
			}
			
			System.out.println("Pagamento no PIX realizado com sucesso!");

		default:
			break;
		}
		Integer cpf;
		System.out.println("Deseja CPF na nota? 1 - Sim / 2 - Não");
		option = scanner.nextInt();
			if (option == 1) {
				System.out.println("Informe o CPF: ");
				cpf = scanner.nextInt();
			}
			
			printReceipt();

	}

	private void printReceipt() {
		
		
	}
}
