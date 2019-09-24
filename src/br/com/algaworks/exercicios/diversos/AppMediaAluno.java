package br.com.algaworks.exercicios.diversos;

import java.util.Scanner;

public class AppMediaAluno {

	static int[] notas;
	static int nota, qtdeNotas;
	static Scanner entrada;
	static int controller = 0;
	static int notasSomadas = 0;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		System.out.println("Quantas notas serão inseridas?");
		qtdeNotas = entrada.nextInt();
		notas = new int[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Informe a nota:");
			nota = entrada.nextInt();
			
			if (!adicionarNotas(nota)) {
				i-=1;
			}
		}
		calcularMedia();
	}

	private static boolean adicionarNotas(int nota) {
		boolean adicionou=false;
		if (nota >= 0 && nota <= 100) {
			notas[controller] = nota;
			controller++;
			adicionou=true;
		} else {
			controller-=1;
			System.out.println("Valor não incluido.O valor da nota deve estar entre 0 e 100! ");
		}
		return adicionou;
	}

	private static void calcularMedia() {
		for (int i : notas) {
			notasSomadas += i;
		}
		System.out.println("===================");
		System.out.println("Media :" + (notasSomadas / qtdeNotas));
	}
}
