package br.com.fourstore.enums;

import util.Util;

public enum PaymentMethod {
	
	MONEY("Dinheiro","Pagamento no dinheiro realizado com sucesso!"), 
	DEBITCARD("Cartão de débito","Pagamento no dÃ©bito realizado com sucesso!"), 
	CREDITCARD("Cartão de crédito","Pagamento no crÃ©dito realizado com sucesso!"), 
	PIX("Pix","Pagamento no PIX realizado com sucesso!");

	private String name;
	private String description;
	static PaymentMethod[] pm = PaymentMethod.values();
	
	PaymentMethod(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return description;
	}
	
	public static PaymentMethod menuPaymentMethod() {
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
