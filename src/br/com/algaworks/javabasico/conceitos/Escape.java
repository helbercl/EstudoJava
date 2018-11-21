package br.com.algaworks.javabasico.conceitos;
public class Escape {

	public static void main(String[] args) {

		// contrabarra em frente a aspas duplas faz com que ignore/escape o caracter
		System.out.println("Como fazer \"escape\" com aspas duplas!");
		// por duas contrabarras em frente ignore/escape o caracter imprimindo uma
		// contrabarra
		System.out.println("Imprimir \\barra \\invertida\\!");
		// \n pula uma linha
		System.out.println("Contrabarra \n N");
		// contrabarra igonora a aspas duplas como inicio de nova String
		System.out.println("Oi \"Mundo\"");
		// duas contras barras faz com que seja impresso uma contra barra
		System.out.println("\\ contrabarra invertida\\");
		// \n pula uma linha

		System.out.println("Oi \n mundo");

		// Escapes conhecidos no java
		System.out.println("backspace \b backspace");
		System.out.println("Tabulação \t Horizontal");
		System.out.println("Form \f Feed");

	}

}
