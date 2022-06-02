package br.com.fourstore.enums;

import util.Util;

public enum DepartmentEnum {
	
	CLOTHES("vestuário", "CLO"),
	SHOES("Calçados", "SHO"),
	PERFUMERY("Perfumária", "PER"),
	ACCESSORIES("Acessórios", "ACC");

	private String description;
	private String SKUCode;
	DepartmentEnum[] dp = DepartmentEnum.values();
	
	DepartmentEnum(String description2, String SKUCode) {	
		this.description = description2;
		this.SKUCode = SKUCode;
		
	}

	public String getDescription() {
		return description;
	}
	
	public String getSKUCode() {
		return SKUCode;
	}
	
	public DepartmentEnum menuDepartment() {
		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║             × Departamentos ×            ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ » 1 - Vestuário                          ║");
		System.out.println("║ » 2 - Calçados                           ║");
		System.out.println("║ » 3 - Perfumária                         ║");
		System.out.println("║ » 4 - Acessórios                         ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("  » ");
		Integer opcao = Util.readInteger(1,4);
		
		return dp[--opcao];
	}

}
