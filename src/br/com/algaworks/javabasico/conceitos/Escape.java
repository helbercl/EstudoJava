package br.com.algaworks.javabasico.conceitos;
public class Escape {

	public static void main(String[] args) {

		/* contrabarra em frente a aspas duplas faz com que ignore/escape o caracter aspas
		   contrabarra ignora a aspas duplas como inicio de nova String */
		System.out.println("Como fazer \"escape\" com aspas duplas!");
		System.out.println("Oi \"Mundo\"");
		
		/* por um contrabarras em frente a outra ignore/escape o caracter contrabarra imprimindo uma
		 contrabarra */
		System.out.println("Imprimir \\\\barra \\\\invertida\\!");
		System.out.println("\\ contrabarra invertida\\");
		
		// \n quebra/pula quebra uma linha
		System.out.println("Oi \n Mundo");

	
		// Escapes conhecidos no java
		
		System.out.println("backspace \b backspace");
		System.out.println("Tabulação \t\t Horizontal");//espaço
		System.out.println("Form \f Feed");
		
		

	}

}
