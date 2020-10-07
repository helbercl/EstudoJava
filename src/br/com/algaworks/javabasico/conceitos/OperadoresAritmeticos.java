package br.com.algaworks.javabasico.conceitos;

import java.util.Scanner;


public class OperadoresAritmeticos {
	static double media;	
	static int subtracao, multiplicacao,soma;
	static int produto1, produto2, produto3;
	static double divisao, resto;

	public static void main(String[] args) {

		// preço dos 3 ultimos produtos vendidos
		
		try (Scanner entrada = new Scanner(System.in)) {

			System.out.println("Digite o valor do primeiro produto:");
			produto1 = entrada.nextInt();

			System.out.println("Digite o valor do segundo produto:");
			produto2 = entrada.nextInt();

			System.out.println("Digite o valor do terceiro produto:");
			produto3 = entrada.nextInt();	
			
			calcularPreco(produto1, produto2, produto3);			
			imprimirCalculos();
		} catch (Exception e) {			
			System.err.println("Erro: " + e.getMessage());
		}
		

	}
	
	private static void calcularPreco(int produto1, int produto2,int produto3) {
		media = (produto1 + produto2 + produto3) / 3;
		soma = produto1 + produto2 + produto3;
		subtracao = produto1 - produto2 - produto3;
		multiplicacao = produto1 * produto2 * produto3;
		divisao = (produto1 / produto2) / produto3;
		resto = (produto1 % produto2) % produto3;	
		
	}

	private static void imprimirCalculos() {
		
		System.out.println("======================\"Sistema de Calculo de Média\"=======================");
		System.out.println("Preco 1 :" + produto1);
		System.out.println("Preco 2 :" + produto2);
		System.out.println("Preco 3 :" + produto3);
		System.out.println("Média de Preços: " + media);
		System.out.println("Soma de Preços: " + soma);
		System.out.println("Subtração de Preços: " + subtracao);
		System.out.println("Multiplicação de Preços: " + multiplicacao);
		System.out.println("Divisão de Preços: " + divisao);
		System.out.println("Resto de Preços: " + resto);
		System.out.println("======================\"Sistema de Calculo de Média\"=======================");
		
	}
	
	
}
