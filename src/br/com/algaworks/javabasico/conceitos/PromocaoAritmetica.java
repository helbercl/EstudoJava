package br.com.algaworks.javabasico.conceitos;

public class PromocaoAritmetica {

	public static void main(String[] args) {
		// normal - mesmo tipo

		int x = 10;
		long y = 5;
		// int z = x + y;
		long z = x + y; // forma correta
		/*
		 * a variavel x é promovida a long entretanto a variavel z é do tipo int como a
		 * variavel long ocupa um espaço maior de memoria então não compila *
		 */
		System.out.println("Resultado :" + z);
		// normal - mesmo tipo

		// exceção com ponto flutuante
		long a = 10;// 64bits
		float b = 9.34f;// 32 bits perde casas decimais
		// long w = a * b; errado
		float w = a * b; // certo
		System.out.println("Resultado :" + w);

		int o = 3;
		//float p = 2;
		int p = 2;
		float r = o /  p;
		float s = o / (float) p;
		System.out.println("Sem float "+r);
		System.out.println("Com float "+s);//promoção da variavel p par float consequentemente a o é  promovida retorando um float.

	}

}
