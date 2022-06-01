package br.com.fourstore.enums;

public enum TypeProduct {
	
	SUMMER("VERÃO", "SU"),
	WINTER("INVERNO", "WI"),
	AUTUMN("OUTONO", "AU"),
	SPRING("PRIMAVERA", "SP"),
	OTHERS("OUTROS", "OT");

	private String description;
	private String SKUCode;

	TypeProduct(String description, String SKUCode) {
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
