package br.com.algaworks.javabasico.conceitos;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		double[] notas = new double[3];// Posi��es notas 0,1,2

		for (int j = 0; j < notas.length; j++) {
			System.out.println("Informe as notas :");
			Scanner entrada = new Scanner(System.in);
			notas[j] = entrada.nextDouble();
			entrada.close();
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posi��o[" + i + "]" + notas[i]);
		}

	}

}
