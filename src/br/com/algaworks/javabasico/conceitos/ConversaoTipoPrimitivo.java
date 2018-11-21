package br.com.algaworks.javabasico.conceitos;

public class ConversaoTipoPrimitivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * varíavel tipo long(64) é maior que o int (32) 
		 * Casting - conveter tipos de dados
		 */

		long x = 9300000035L; //tipo long maior que int
		int y = (int) x;//posso perder precisão-eu corro o risco
		System.out.println(y); //

		int a =102344;
		long b =a;
		System.out.println(b);
		
			
		double d = 20.5;// variavel de 64 bits
    	float c = (float) d;//variavel 32 bits - converte em variavel com bit maior
		System.out.println(c);
		
		float w=934.5f;//variavel 32 bits
		double j =w;// variavel de 64 bits
		System.out.println(j);
		
		double e = 100.37;// variavel de 64 bits
		int f = (int) e;// variavel de 64 bits porem perde precisão por ser int
		System.out.println(f);
		
		//Conversão implicita
		//       char
		//byte>short>int>long>float>double
		
		//no sentido da direita para esquerda tem que explicitar
	}

}
