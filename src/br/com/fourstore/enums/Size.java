package br.com.fourstore.enums;

public enum Size {
	
	RN0("Rescem Nascido", "RN0" ), 
	PP0("Extra Pequeno", "PP0"), 
	P00("Pequeno", "P00"), 
	M00("Médio", "M00"), 
	G00("Grande", "G00"), 
	GG0("GG", "GG0"), 
	XG0("Extra Grande", "XG0"),
	XXG("Extra Extra Grande", "XXG");

	private String description;
	private String SKUCode;

	Size(String description, String SKUCode) {
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
