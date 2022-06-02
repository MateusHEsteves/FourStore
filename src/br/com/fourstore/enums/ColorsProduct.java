package br.com.fourstore.enums;

import util.Util;

public enum ColorsProduct {
	
	BLUE("azul", "BLU"),
	RED("vermelho", "RED"),
	GREEN("verde", "GRE"),
	WHITE("branco", "WHI"),
	BLACK("preto", "BLA"),
	YELLOW("amarelo", "YEL"),
	BROWN("marron", "BRO"),
	GRAY("cinza", "GRA");
	
	private String description;
	private String SKUCode;
	private ColorsProduct[] cp = ColorsProduct.values();

	private ColorsProduct(String description, String SKUCode) {
		this.description = description;
		this.SKUCode = SKUCode;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public String getSKUCode() {
		return SKUCode;
	}
	
	public ColorsProduct menuColors() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║               × Categorias ×             ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Azul                               ║");
		System.out.println("║ » 2 - Vermelho                           ║");
		System.out.println("║ » 3 - Verde                              ║");
		System.out.println("║ » 4 - Branco                             ║");
		System.out.println("║ » 5 - Preto                              ║");
		System.out.println("║ » 6 - Amarelo                            ║");
		System.out.println("║ » 7 - Marron                             ║");
		System.out.println("║ » 8 - Cinza                              ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = Util.readInteger(1,8);
		
		return cp[--opcao];
	}
	
}
