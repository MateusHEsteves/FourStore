package br.com.fourstore.enums;

import util.Util;

public enum CategoryProduct {
	
	MALE("MS - Masculino", "M"),
	FEMININE("FM - Feminino", "F"),
	BABY("BB - Baby", "B"),
	OTHERS("OT - Outros", "O");
	
	
	private String description;
	private String SKUCode;
	static CategoryProduct[] cp = CategoryProduct.values();
	
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
	
	public static CategoryProduct menuCategories() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║               × Categorias ×             ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Masculino                          ║");
		System.out.println("║ » 2 - Feminino                           ║");
		System.out.println("║ » 3 - Baby                               ║");
		System.out.println("║ » 4 - Outros                             ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = Util.readInteger(1,4);
		
		return cp[--opcao];
	}
}
