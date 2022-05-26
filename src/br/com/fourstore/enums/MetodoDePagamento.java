package br.com.fourstore.enums;

public enum MetodoDePagamento {
	
	MONEY(1, "Dinheiro"), DEBIT(2, "D�bito"), CREDIT(3, "Cr�dito"), PIX(4, "Pix");

	private Integer id;
	
	private String description;
	
	MetodoDePagamento(Integer id, String description) {
		this.id = (id);
		this.description = (description);
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

}
