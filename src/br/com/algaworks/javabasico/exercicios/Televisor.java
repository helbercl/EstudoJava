package br.com.algaworks.javabasico.exercicios;

import java.util.Scanner;

public class Televisor {

	public static void main(String[] args) {
		Integer canal=0;Integer volume=0;
		while (canal >= 0) {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Informe o novo canal:");
			canal = entrada.nextInt();
			System.out.println("Informe o volume:");
			volume = entrada.nextInt();
			mudarCanal(canal);
		}

	}

	static void mudarCanal(Integer canal) {
		Integer novoCanal = null;		
		if (novoCanal == canal) {
			System.out.println("Novo canal é também o canal atual.");
			
		} else {
			novoCanal = canal;
			System.out.println("Canal Alterado para " + canal);
		}
	}

}
