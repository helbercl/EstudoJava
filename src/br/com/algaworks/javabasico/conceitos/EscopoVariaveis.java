package br.com.algaworks.javabasico.conceitos;
import java.util.Scanner;

public class EscopoVariaveis {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nomePai = "";
		System.out.println("Idade :");
		int idade = entrada.nextInt();

		boolean podeDirigir = idade >= 18;

		if (!podeDirigir) {
			System.out.println("Nome do Pai :");
			nomePai = entrada.next();
		}
		System.out.println("Pode dirigir ?");

		if (podeDirigir) {
			System.out.println("Sim! Claro!");
		} else {

			System.out.println("Não. Se fizer isso, seu pai " + nomePai + " será preso!");
		}

	}

}
