package br.com.algaworks.javabasico.conceitos;
public class Escape {

	public static void main(String[] args) {

		/* contrabarra em frente a aspas duplas faz com que ignore/escape o caracter
		 contrabarra ignora a aspas duplas como inicio de nova String */
		System.out.println("Como fazer \"escape\" com aspas duplas!");
		System.out.println("Oi \"Mundo\"");
		
		/* por duas contrabarras em frente ignore/escape o caracter imprimindo uma
		 contrabarra */
		System.out.println("Imprimir \\\\barra \\\\invertida\\!");
		System.out.println("\\ contrabarra invertida\\");
		
		// \n quebra uma linha
		System.out.println("Contrabarra \n N");
		System.out.println("Oi \n mundo");
	
		// Escapes conhecidos no java
		System.out.println("backspace \b \b backspace");
		System.out.println("Tabulação \t Horizontal");
		System.out.println("Form \f Feed");

	}

}
