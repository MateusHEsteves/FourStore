package br.com.fourstore.enums;

import util.Util;

public enum PaymentMethod {
	
	MONEY("Pagamento no dinheiro realizado com sucesso!"), 
	DEBITCARD("Pagamento no débito realizado com sucesso!"), 
	CREDITCARD("Pagamento no crédito realizado com sucesso!"), 
	PIX("Pagamento no PIX realizado com sucesso!");

	private String description;
	private PaymentMethod[] pm = PaymentMethod.values();
	
	PaymentMethod(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public PaymentMethod menuPaymentMethod() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║          × Métodos de pagamento ×        ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Dinheiro                           ║");
		System.out.println("║ » 2 - Cartão de Débito                   ║");
		System.out.println("║ » 3 - Cartão de Crédtio                  ║");
		System.out.println("║ » 4 - Pix                                ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = Util.readInteger(1,4);
		
		return pm[--opcao];
	}

}
