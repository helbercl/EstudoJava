package br.com.algaworks.javabasico.conceitos;
import java.util.Scanner;

public class Debugando {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero:");
		int divisor = entrada.nextInt();

		for (int i = 100; i <= 120; i++) {

			if (i % divisor == 0) {
				continue; // passa para proxima interação e vai para o for
			}

			System.out.println(i);
		}
		System.out.println("Fim do Programa!");

	}

}
