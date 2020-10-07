package br.com.algaworks.javabasico.conceitos;

public class OPeradoresComparacaoIgualdade {

	public static void main(String[] args) {
		/*
		 * Operadores de Comparação : > >= < <= 
		 * Operadores de Igualdade : == igual ou != diferente
		 * Todas operações o resultado é um boolean
		 */

		boolean maior, menor, maiorOuIgual, menorOuIgual, igual, diferente;
		boolean operadorUnario= true;
		int a = 10;
		int b = 5;
		int c = 2;

		maior = b > a;
		maiorOuIgual = b >= a;
		menor = a < b;		
		menorOuIgual = a <= 10;
		igual = a == b - c;
		diferente = a != c;

		System.out.println("Maior :" + maior);// false
		System.out.println("MaiorOuIgual :" + maiorOuIgual); // false
		System.out.println("Menor :" + menor);// false
		System.out.println("MenorOuIgual :" + menorOuIgual); // true
		System.out.println("Igual :" + igual);// false
		System.out.println("Diferente: " + diferente);// true
		System.out.println("Operador Unario:" + !operadorUnario);

	}

}
