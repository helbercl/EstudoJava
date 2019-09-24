package br.com.algaworks.exercicios.diversos;

import java.util.Scanner;

public class AppMaiorNumero {

	static Scanner entrada;
	static int numero1,numero2;
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		System.out.println("Digite o numero 1 :");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o numero 2 :");
		numero2 = entrada.nextInt();
		
		if (numero1==numero2) {
			System.out.println("os numeros são iguais!");
		}else {
			int maiorNumero=numero1 > numero2 ? numero1 : numero2;
			System.out.println("O maior numero é ?" + maiorNumero);
		}
		

	}
	
}
