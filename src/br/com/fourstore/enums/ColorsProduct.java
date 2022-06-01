package br.com.fourstore.enums;

public enum ColorsProduct {
	
	BLUE("azul", "BLU"),
	RED("vermelho", "RED"),
	GREEN("verde", "GRE"),
	WHITE("branco", "WHI"),
	BLACK("preto", "BLA"),
	YELLOW("amarelo", "YEL"),
	BROWN("marron", "BRO"),
	GRAY("cinza", "GRA");
	
	public String getSKUCode() {
		return SKUCode;
	}


	private String description;
	private String SKUCode;

	private ColorsProduct(String description, String SKUCode) {
		this.description = description;
		this.SKUCode = SKUCode;
	}
	
	
	public String getDescription() {
		return description;
	}
	
}
