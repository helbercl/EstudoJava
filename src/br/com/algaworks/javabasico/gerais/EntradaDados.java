package br.com.algaworks.javabasico.gerais;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		try {
			String nome = "";
			int peso = 0;
			double altura = 0, imc = 0;
			Scanner entrada = new Scanner(System.in);

			System.out.print("Nome :");
			nome = entrada.nextLine();

			System.out.println("Peso :");
			peso = entrada.nextInt();

			System.out.print("Altura");
			altura = entrada.nextDouble();

			imc = peso / (altura * altura);

			System.out.print("IMC :" + imc);

		} catch (Exception e) {

			System.err.println(e.getMessage());
		}

	}

}
