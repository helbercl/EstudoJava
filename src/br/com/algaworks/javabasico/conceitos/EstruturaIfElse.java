package br.com.algaworks.javabasico.conceitos;
import java.util.Scanner;

public class EstruturaIfElse {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome :");
		String nome = entrada.nextLine();

		System.out.print("Peso :");
		int peso = entrada.nextInt();

		System.out.print("Altura :");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 18.5)
			System.out.println("Peso Muito Baixo");
		else if (imc >= 18.5 && imc < 25)
			System.out.println("Peso Ideal");
		else if (imc >= 25 && imc < 30)
			System.out.println("Acima do Peso");
		else if (imc >= 30 && imc < 40)
			System.out.println("Obsidade Grave 1 ou 2!");
		else
			System.out.println("Obsidade Morbida 3!");
		System.out.println("Cuidado Seu Peso!");

		System.out.println("IMC :" + imc);
		entrada.close();
	}

}
