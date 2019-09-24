package br.com.algaworks.exercicios.diversos;

import java.util.Scanner;

public class AppNumeroDescrescente {
	
	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		System.out.println("Informe o numero inteiro:");
		int numeroInteiro = entrada.nextInt();
	    imprimir(numeroInteiro);
		
	}
	
	
	private static void  imprimir(int numeroInteiro) {
		//extrai a condição i <= numeroInteiro &&
		for (int i = numeroInteiro; i >=0; i--) {
			System.out.println(i);	
		}			
	}
	
	static {
		System.out.println("O classloader carregou essa classe!");
	}

}
