package br.com.fourstore.service;

import java.util.List;

import br.com.fourstore.data.TransactionData;
import br.com.fourstore.enums.PaymentMethod;
import br.com.fourstore.model.Transaction;
import util.Util;

public class TransactionService {

	TransactionData db = new TransactionData();

	public void create(Transaction transaction) {
		db.save(transaction);
	}

	public List<Transaction> readAll() {
		return db.findAll();
	}

	public void update(Transaction transaction) {
	}

	public void delete(Transaction transaction) {
	}

	public static void selectPaymentType() {
		
			Integer option;
			
			System.out.println("╔══════════════════════════════════════════╗");
			System.out.println("║          × Metodo de pagamento ×         ║");
			System.out.println("╠══════════════════════════════════════════╣");
			System.out.println("║ » 1 - Money                              ║");
			System.out.println("║ » 2 - Debit card                         ║");
			System.out.println("║ » 3 - Credit card                        ║");
			System.out.println("║ » 4 - Pix                                ║");
			System.out.println("╚══════════════════════════════════════════╝");
			Integer metodoDePagamento = Util.readInteger("  » ");

			switch (metodoDePagamento) {
			case 1:
				
				System.out.println(PaymentMethod.MONEY.getDescription());
				
				break;
			case 2:
				
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

				System.out.println(PaymentMethod.DEBIT.getDescription());

				break;
			case 3:

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

				System.out.println(PaymentMethod.CREDIT.getDescription());
				
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
				
				System.out.println(PaymentMethod.PIX.getDescription());

			default:
				break;
			}
		
	}

}
