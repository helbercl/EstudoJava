package br.com.algaworks.exercicios.diversos;

import java.util.Scanner;

public class AppCompararNumero {
	static Scanner entrada;
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro numero :");
		num1 = entrada.nextInt();
		System.out.println("Informe o segundo numero :");
		num2 = entrada.nextInt();
		compararNumero(num1, num2);
	}
	private static void compararNumero(int num1 , int num2) {
		if (num1==num2) {
			System.out.println("Numeros Iguais!");
		}else {
			System.out.println("Numeros Diferentes!");
			System.out.println("Maior numero :" + (num1 > num2 ? num1:num2));
			
		}
	}
}
