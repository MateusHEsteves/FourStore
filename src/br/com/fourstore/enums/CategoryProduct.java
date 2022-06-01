package br.com.fourstore.enums;

public enum CategoryProduct {
	
	MALE("MS - Masculino", "M"),
	FEMININE("FM - Feminino", "F"),
	BABY("BB - Baby", "B"),
	OTHERS("OT - Outros", "O");
	
	
	private String description;
	private String SKUCode;

	private CategoryProduct(String description, String SKUCode) {
		this.description = description;
		this.SKUCode = SKUCode;
	}
	
	public String getSKUCode() {
		return SKUCode;
	}

	public String getDescription() {
		return description;
	}
}
