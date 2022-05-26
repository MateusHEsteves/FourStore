package br.com.fourstore.controller;

import util.Util;

public class MenuController {

	ProductController productController = new ProductController();
	
	TransactionController transactionController = new TransactionController();

	public MenuController(String opcao) {
		System.out.println("Programa foi inicializado pela " + opcao + "ª opção.");
		inicializeMenu();
	}

	private void inicializeMenu() {
		
		while (true) {

			Integer opcao = menuPrincipal();

			switch (opcao) {
			case 1:
				productController.cadastrarProduto();
				continue;

			case 2:
				productController.updateEstoque();
				continue;
			case 3:
				productController.findAllProdutos();
				continue;
			case 4:
				productController.sellProduct();
				continue;
			case 5:
				productController.showHistory();
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
		Integer opcao = Util.readInteger();
		return opcao;
	}

}
