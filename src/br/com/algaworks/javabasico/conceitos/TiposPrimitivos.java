package br.com.algaworks.javabasico.conceitos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Valor Literal - valor direto
		
		boolean check = 4<3;
		//variaveis ponto flutuante
		float  f=(float) 0.0;
		double d=0.00;
		//variaveis ponto flutuante
		
		char c='@';//entre aspas simples
		
		//variaveis inteiras
		byte b=-9;
		short s;
		int i=32000;
		long l=64_0000;
		//variaveis inteiras
		
		//Exemplo Variavel Long (problema)
		long populacaoUberlandia= 650_000;
		System.out.println("Problema Long :"+populacaoUberlandia);
		long populacaoMundial=7000000000L;
		System.out.println("População Mundial :"+populacaoMundial);
		//Exemplo Variavel Long (problema)
		
		float saldoConta=1030.40F;
		System.out.println("Saldo Conta " + saldoConta);

		System.out.println("Booleano :" + check);
		System.out.println("Float :" + f);
		System.out.println("Char :" + c);
		System.out.println("Byte :" + b);
		System.out.println("Inteiro :" + i);
		System.out.println("Long :" + l);

	}

}
