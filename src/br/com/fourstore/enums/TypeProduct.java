package br.com.fourstore.enums;

import util.Util;

public enum TypeProduct {

	SUMMER("VERÃO", "SU"), WINTER("INVERNO", "WI"), AUTUMN("OUTONO", "AU"), SPRING("PRIMAVERA", "SP"),
	OTHERS("OUTROS", "OT");

	private String description;
	private String SKUCode;
	static TypeProduct[] tp = TypeProduct.values();

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

	public static TypeProduct menuType() {

		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║           × Seleção de tamanho ×         ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - VERÃO                              ║");
		System.out.println("║ » 2 - INVERNO                            ║");
		System.out.println("║ » 3 - OUTONO                             ║");
		System.out.println("║ » 4 - PRIMAVERA                          ║");
		System.out.println("║ » 5 - OUTROS                             ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = Util.readInteger(1, 5);

		return tp[--opcao];
	}

}
