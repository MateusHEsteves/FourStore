package br.com.fourstore.communication;

import br.com.fourstore.controller.MenuController;

/**
 * Este projeto é para o desenvolvimento de uma aplicação de controle de estoque
 * e gerenciamento de vendas de uma loja de varejo.
 * 
 * @author mesteves
 */
public class MenuCommunication {

	/**
	 * Inicializa o programa e inicia o controller do menu.
	 * @param args
	 */
	public static void main(String[] args) {
		new MenuController((args.length > 0) ? "1" : "2");
	}
}
