package br.com.algaworks.javabasico.conceitos;

public class Strings {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("Resultado Concatenado 10 e 5 :" + x + y);
		System.out.println(x + y + " é o resultado da soma 10 e 5.");
		System.out.println("Resultado Correto com priorização de expressão"
				+ " aritmetica:" + (x + y));

		String nome = "Helber";
		String sobrenome=" Cardoso Lemos";
		Integer idade = 30;

		if (nome.startsWith("H") && idade.equals(30)) {
			System.out.println(nome + " tem " + idade + " anos!");

			System.out.println("Ola meu amigo\\a . Tudo Bem?");
		}
		
		System.out.println("Metodo Substring :"+nome.substring(2));
		System.out.println("Hash Substring :"+ nome.hashCode());
		
		System.out.println(nome.concat(sobrenome));
	

	

	}
}
