package br.com.fourstore.enums;

public enum PaymentMethod {
	
	MONEY("Pagamento no dinheiro realizado com sucesso!"), 
	DEBIT("Pagamento no débito realizado com sucesso!"), 
	CREDIT("Pagamento no crédito realizado com sucesso!"), 
	PIX("Pagamento no PIX realizado com sucesso!");

	private String description;
	
	PaymentMethod(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
