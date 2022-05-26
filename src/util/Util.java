package util;

import java.util.Scanner;

public class Util {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static String readString(String mensagem) {
		System.out.print(mensagem);
		String retorno = scanner.nextLine();
		return retorno;
	}
	
	public static String readString() {
		String retorno = scanner.nextLine();
		return retorno;
	}
	
	public static Integer readInteger(String mensagem) {
		System.out.print(mensagem);
		Integer retorno = Integer.parseInt(scanner.nextLine());
		return retorno;
	}
	
	public static Integer readInteger() {
		Integer retorno = Integer.parseInt(scanner.nextLine());
		return retorno;
	}
	
	public static Double readDouble(String mensagem) {
		System.out.print(mensagem);
		Double retorno = Double.parseDouble(scanner.nextLine());
		return retorno;
	}
	
	public static Double readDouble() {
		Double retorno = Double.parseDouble(scanner.nextLine());
		return retorno;
	}

}
