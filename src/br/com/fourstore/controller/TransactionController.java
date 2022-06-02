package br.com.fourstore.controller;

import br.com.fourstore.enums.PaymentMethod;
import br.com.fourstore.model.Transaction;
import br.com.fourstore.service.ProductService;
import br.com.fourstore.service.TransactionService;
import util.Util;
import util.UtilValidacao;

public class TransactionController {
	
	TransactionService transactionService;
	
	ProductService productService;

	public TransactionController() {
		this.transactionService = new TransactionService();
		this.productService = new ProductService();
	}

	/*
	 * Cria um carrinho de compras Define a forma de pagamento Pergunta se deseja
	 * cpf na nota Imprime o recibo de pagamento
	 */
	public void sellProduct() {

		Transaction transaction = addProductsToCart();

		transaction = selectPaymentType(transaction);

		String cpf;

		do {

			cpf = Util.readString("Deseja CPF na nota? Se sim digite seu cpf, se não aperte ENTER:");
			
		} while (UtilValidacao.validaCPF(cpf));

		transaction.setCpf(cpf);

		printReceipt(transaction);

		transactionService.create(transaction);

	}

	private Transaction addProductsToCart() {

		Transaction transaction = new Transaction();

		do {

			String SKU = Util.readString("Informe o SKU do produto a ser vendido: ");
			Integer quantity = Util.readInteger("Quantidade de produto a ser vendido: ");

			transaction.getShoppingCart().add(productService.readBySku(SKU), quantity);

		} while (Util.readInteger("Deseja comprar mais produtos? 1 - sim / 2 - Não.") == 1);

		return transaction;
	}

	private void printReceipt(Transaction transaction) {

	}

	public void showHistory() {

		transactionService.readAll().forEach(t -> System.out.println(t));

	}

	public Transaction selectPaymentType(Transaction transaction) {

		// TODO setar tipo de pagamento na transaction

		Integer option;

		PaymentMethod paymentMethod = PaymentMethod.CREDITCARD.menuPaymentMethod();

		switch (paymentMethod) {
		case MONEY:

			System.out.println(PaymentMethod.MONEY.getDescription());

			break;
		case DEBITCARD:

			while (true) {

				String titularName = Util.readString("Informe o nome do titular: ");

				Integer numberCard = Util.readInteger("Informe o número do cartão: ");

				Integer numberCvv = Util.readInteger("Informe o número do cvv: ");

				System.out.println("Nome: " + titularName + ", " + numberCard + ", " + numberCvv + ".");

				option = Util.readInteger("Os dados acima estão corretos? 1 - Sim / 2 - Não.");

				if (option == 2) {
					continue;
				}
				break;
			}

			System.out.println(PaymentMethod.DEBITCARD.getDescription());

			break;
		case CREDITCARD:

			while (true) {

				String titularName = Util.readString("Informe o nome do titular: ");

				Integer numberCard = Util.readInteger("Informe o número do cartão: ");

				Integer numberCvv = Util.readInteger("Informe o número do cvv: ");

				System.out.println("Nome: " + titularName + ", " + numberCard + ", " + numberCvv + ".");

				option = Util.readInteger("Os dados acima estão corretos? 1 - Sim / 2 - Não.");

				if (option == 2) {
					continue;
				}
				break;
			}

			System.out.println(PaymentMethod.CREDITCARD.getDescription());

		case PIX:

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

			try {
				Thread.sleep(2000);
				System.out.print("Confirmando pagamento PIX");
				Thread.sleep(500);
				System.out.print(".");
				Thread.sleep(500);
				System.out.print(".");
				Thread.sleep(500);
				System.out.print(".");
			} catch (Exception e) {

			}

			System.out.println(PaymentMethod.PIX.getDescription());

		default:
			break;
		}
		return transaction;
	}
		
	
}
