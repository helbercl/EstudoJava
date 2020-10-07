package br.com.algaworks.javabasico.conceitos;

public class Variaveis {

	public static void main(String[] args) {
		/*
		 * Nomeando Variaveis: Pode conter letra digito underscore e $ - Não pode começar
		 * com digito Embora possa fazer todas essas formas é bom seguir a convenção de
		 * codigos. Variavel primeira letra minuscula e iniciais de novas palavras
		 * maiusculas.(camel Case) *
		 */

		int quantidade;
		//funciona a nomeação conforme abaixo:
		int qualidade_alunos,QUANTIDADE = 2,QuantidadeAlunos,$quantidade,_quantidade;
		quantidade = 10;
		System.out.println("Quantidade :" + quantidade);
		quantidade = 18;
		System.out.println("Quantidade :" + quantidade);
		QUANTIDADE += quantidade;
		System.out.println("Quantidades :"  + QUANTIDADE);

		
	}

}
