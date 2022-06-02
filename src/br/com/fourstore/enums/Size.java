package br.com.fourstore.enums;

import util.Util;

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
	private Size[] sz = Size.values();

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
	
	public Size menuSize() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║           × Seleção de tamanho ×         ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Recem Nascido                      ║");
		System.out.println("║ » 2 - Extra Pequeno                      ║");
		System.out.println("║ » 3 - Pequeno                            ║");
		System.out.println("║ » 4 - Médio                              ║");
		System.out.println("║ » 5 - Grande                             ║");
		System.out.println("║ » 6 - GG                                 ║");
		System.out.println("║ » 7 - Extra Grande                       ║");
		System.out.println("║ » 8 - Extra Extra Grande                 ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = Util.readInteger(1,8);
		
		return sz[--opcao];
	}
	
}
