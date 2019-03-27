package br.com.algaworks.javabasico.wrapperboxingarrays;

public class ClassesBoxing {
	
	public static void main(String[] args) {
		
		int boxing,unboxing;
		
		Integer i = new Integer(10);
		
		unboxing = i;// tira do objeto e vincula a um tipo primitivo
		
		Integer i1=127;
		Integer i2=127;
		Integer i3=128;
		Integer i4=128;
		
		System.out.println(i1==i2);
		
		// o integer armazena a faixa de -127 a 127. A faixa do 128 é fora do intervalo armazenado em objeto diferente.
		System.out.println(i3==i4);
		
		//forma correta
		
		System.out.println(i3.equals(i4));
		

	}
}
