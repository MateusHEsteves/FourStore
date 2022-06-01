package br.com.fourstore.enums;

public enum DepartmentEnum {
	
	CLOTHES("vestuário", "CLO"),
	SHOES("Calçados", "SHO"),
	PERFUMERY("Perfumária", "PER"),
	ACCESSORIES("Acessórios", "ACC");

	public String getSKUCode() {
		return SKUCode;
	}

	private String description;
	private String SKUCode;
	
	DepartmentEnum(String description2, String SKUCode) {	
		this.description = description2;
		this.SKUCode = SKUCode;
		
	}

	public String getDescription() {
		return description;
	}

}
