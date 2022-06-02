package br.com.fourstore.controller;

import util.InicializeDb;
import util.Util;

/**
 * @author mesteves
 *
 */
public class MenuController {

	ProductController productController = new ProductController();
	
	TransactionController transactionController = new TransactionController();

	InicializeDb startDb = new InicializeDb();

	public MenuController(String opcao) {
		System.out.println("Programa foi inicializado pela " + opcao + "ª opção.");
		inicializeMenu();
	}

	/**
	 * 
	 */
	private void inicializeMenu() {
		
		menu: while (true) {

			Integer opcao = menuPrincipal();

			switch (opcao) {
			case 1:
				productController.registerProduct();
				continue;
			case 2:
				productController.updateStock();
				continue;
			case 3:
				productController.findAllProdutos();
				continue;
			case 4:
				transactionController.sellProduct();
				continue;
			case 5:
				transactionController.showHistory();
			default:
				break menu;
			}
		}
	}

	/**
	 * Exibe um menu no console e solicita uma entrada do tipo inteiro usando o
	 * Scanner e retorna essa entrada.
	 * 
	 * @return Integer inputado pelo usuário do sistema.
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
