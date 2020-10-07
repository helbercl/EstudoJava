package br.com.algaworks.javabasico.conceitos;
import java.util.Scanner;

public class OperadoresLogicos {

	// && e || ou

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome :");
		String nome = entrada.next();

		System.out.print("Peso :");
		double peso = entrada.nextDouble();

		System.out.print("Altura :");
		double altura = entrada.nextDouble();

		System.out.println("Sexo(1 -M 2-F))");
		char sexo = entrada.nextShort() == 1 ? 'M' : 'F';// operador ternario

		double imc = peso / (altura * altura);
		
		System.out.println(" O IMC  de " + nome + " com peso  " +peso+" e altura "+ altura +" é " + calcularImc(sexo,imc));
	
		entrada.close();
	}
	
	private static String calcularImc(char sexo,double imc) {
		String resultado="";
		if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
			resultado="Peso Muito Baixo";
		}
		else 
			if ((sexo == 'F' && (imc >= 19.1 && imc < 25.8)) || (sexo == 'M' && imc >= 20.7 && imc < 26.4)) {
				resultado="Peso Ideal";
		} else 
			if ((sexo == 'F' && (imc >= 25.8 && imc <= 27.3)) || (sexo == 'M' && (imc >= 26.4 && imc <= 27.8))) {
			   resultado="Pouco Acima do Peso";

		}else {
			resultado="Vai morrer!";
		}

	 return resultado ;	 
		
	}

}
