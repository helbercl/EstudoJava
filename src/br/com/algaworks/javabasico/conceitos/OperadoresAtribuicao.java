package br.com.algaworks.javabasico.conceitos;


public class OperadoresAtribuicao {

	public static void main(String[] args) {
		/* operadores de atribuicao - atribui valor  
		  Simbolos: =,+=,-=,*=,/=,%=
		  será atribuido a variavel o calculo ao valor pre-existente		
		*/
		
		int total = 10;
		// total=total+3;
		total += 3;
		System.out.println("Total " + total);
		total -= 2;
		System.out.println("Total " + total);// imprimi 11
		total *= 3;
		System.out.println("Total " + total);// imprimi 33
		total /= 3;
		System.out.println("Total " + total);// imprimi 11
		total %= 5;
		System.out.println("Total " + total);// imprimi 1

		/*
		 * == equal to -- igual a 
		 * != not equal to -- diferente de
		 *  > greater than --  * maior que 
		 *  < less than -- menor que 
		 *  >= greater than or equal to -- maior ou  igual
		 * a <= less than or equal to -- menor ou  igual a
		 */
		// operator relational e equality -igualdade e relacional
		int value1 = 1;
		int value2 = 2;
		if (value1 == value2)
			System.out.println(value1 == value2);
		if (value1 != value2)
			System.out.println(value1 != value2);
		if (value1 > value2)
			System.out.println(value1 > value2);
		if (value1 < value2)
			System.out.println(value1 < value2);
		if (value1 >= value2)
			System.out.println(value1 >= value2);
		if (value1 <= value2)
			System.out.println(value1 <= value2);
		
		// operators conditional &&(and) and ||(or)

		if (value1 == 1 && value2 == 2) {
			System.out.println("Value1 igual 1 an Value2 igual 2");
		}
		if (value1 == 1 || value2 == 1) {
			System.out.println("value1 is 1 OR value2 is 1");
		}
		//operador condicional/operador ternario (?:)
		//abreviação de if else
		
		boolean condicao= 2<3;
		int result= condicao?value1:value2;
        System.out.println(result);
	}

}
