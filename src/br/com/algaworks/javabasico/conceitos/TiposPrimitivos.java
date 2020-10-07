package br.com.algaworks.javabasico.conceitos;

import java.math.BigDecimal;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		System.out.println("boolean(1 bit) -- char(16 bits) --//// byte(8 bits) -- short(16 bits) -- int(32 bits) -- long(64 bits)//// -- float(32 bits) -- double(64 bit)");
		
		
		//Valor Literal(true or false) - valor direto(4>3)
		
		boolean check = 4>3;
		
		//variaveis ponto flutuante
		float  f=(float) 0.0;
		
		//variaveis char -- entre aspas simples
		
		char sexo='M';
		char tipoCliente ='2';
		char simbolo ='@';
		
		//variaveis inteiras - byte, short, int e long
		
		byte b= -128;	
		short s = 32767;
		int i= 32000;
		long l= 64_0000;
		//variaveis inteiras
		
		
		
		/*Exemplo Variavel Long (problema)--Todo literal  é entendido como int
		por este motivo fazer cast e orientar o tipo*/
		
		
		long populacaoUberlandia= 650_000;
		System.out.println("Problema Long :"+populacaoUberlandia);
		
		long populacaoMundial=7000000000L;//Todo literal é do tipo int onde o maximo é 2 bilhoes.Colocar um L para indicar o tipo do literal.
		System.out.println("População Mundial :"+populacaoMundial);
		
		
		//Exemplo Variavel Long (problema)
		
		
		/* double é maior que o float 64 > 32 bits.
		 * 
		 * Quando indico um literal com ponto flutuante é reconhecido como double.
		 * O tipo de dados declarado esperava um valor float.É preciso orientar o tipo que está
		 * sendo recebido.
		 * 
		 * Classe BigDecimal é a melhor para tipo com ponto flutuante.
		 *  */
		float saldoConta= 1030.40f;
		System.out.println("Saldo Conta " + saldoConta);
		
		BigDecimal valor = new BigDecimal(saldoConta);

		System.out.println("Booleano :" + check);
		System.out.println("Float :" + f);
		System.out.println("Char :" + sexo + "--" + tipoCliente + "--" + simbolo);
		System.out.println("Byte :" + b);
		System.out.println("Inteiro :" + i);
		System.out.println("Long :" + l);
		System.out.println("BigDecimal: " + valor.doubleValue() + "//"+valor.floatValue());

	}

}
