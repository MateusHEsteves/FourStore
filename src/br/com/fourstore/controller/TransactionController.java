package br.com.fourstore.controller;

import java.util.Map.Entry;

import br.com.fourstore.enums.PaymentMethod;
import br.com.fourstore.model.Product;
import br.com.fourstore.model.Transaction;
import br.com.fourstore.service.ProductService;
import br.com.fourstore.service.TransactionService;
import util.Util;
import util.Validacao;

public class TransactionController implements Validacao {
	
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

		String cpf = Util.readString("Deseja CPF na nota? Se sim digite seu cpf, se não aperte ENTER:");

		if(!cpf.isBlank()) {
			while (validaCPF(cpf)) {
				cpf = Util.readString("Inválido, tente novamente: ");
			}

		}
		
		transaction.setCpf(cpf);

		checkout(transaction);
		
		transactionService.create(transaction);

		printReceipt(transaction);
		
	}

	private void checkout(Transaction transaction) {

		for (Entry<Product, Integer> cart : transaction.getShoppingCart().getCart().entrySet()) {
			
			Product produto = cart.getKey();
			Integer quantidade = cart.getValue();
			
			productService.stockMinus(produto.getSku(), quantidade);
			
		}
		
	}

	private Transaction addProductsToCart() {

		Transaction transaction = new Transaction();

		do {

			String SKU = Util.readString("  » Informe o SKU do produto a ser vendido: ");
			Integer quantity = Util.readInteger("  » Quantidade de produto a ser vendido: ");

			transaction.getShoppingCart().add(productService.readBySku(SKU), quantity);

		} while (Util.readInteger("  » Deseja comprar mais produtos? 1 - SIM / 2 - NÃO: ") == 1);

		return transaction;
	}

	private void printReceipt(Transaction transaction) {
		System.out.println(transaction);
	}

	public void showHistory() {

		transactionService.readAll().forEach(t -> System.out.println(t));

	}

	public Transaction selectPaymentType(Transaction transaction) {

		// TODO setar tipo de pagamento na transaction

		Integer option;

		PaymentMethod paymentMethod = PaymentMethod.menuPaymentMethod();

		switch (paymentMethod) {
		case MONEY:

			System.out.println(PaymentMethod.MONEY.getDescription());

			break;
		case DEBITCARD:

			while (true) {

				String titularName = Util.readString("  » Informe o nome do titular: ");

				Integer numberCard = Util.readInteger("  » Informe o número do cartão: ");

				Integer numberCvv = Util.readInteger("  » Informe o número do cvv: ");

				System.out.println("Nome: " + titularName + ", " + numberCard + ", " + numberCvv + ".");

				option = Util.readInteger("  » Os dados acima estão corretos? 1 - Sim / 2 - Não.");

				if (option == 2) {
					continue;
				}
				break;
			}

			System.out.println(PaymentMethod.DEBITCARD.getDescription());

			break;
		case CREDITCARD:

			while (true) {

				String titularName = Util.readString("  » Informe o nome do titular: ");

				Integer numberCard = Util.readInteger("  » Informe o número do cartão: ");

				Integer numberCvv = Util.readInteger("  » Informe o número do cvv: ");

				System.out.println("Nome: " + titularName + ", " + numberCard + ", " + numberCvv + ".");

				option = Util.readInteger("  » Os dados acima estão corretos? 1 - Sim / 2 - Não.");

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
		
		transaction.setMetodoDePagamento(paymentMethod);
		
		return transaction;
	}
		
	
}
