package br.com.algaworks.javabasico.exercicios;

public class AppStrings {

	public static void main(String[] args) {
	//ListaExericicios02.pdf
		
   String digitada ="UniFlamengo";
   System.out.println("a) Numero Caracteres :"+ digitada.length());
   System.out.println("b) Todas Letras Maiusculas :" + digitada.toUpperCase());
   System.out.println("c) Numero de Vogais da String : ");
   System.out.println("d) Se a String começa com UNI (ignorando maiúsculas/minúsculas) ? " );
   //return boolean startWith com parametro String
   //return boolean equalsIgnoreCase  com parametro String
   digitada.equalsIgnoreCase(digitada);
   
	//int result= condicao?value1:value2;

   System.out.println("e) String digitada termina com “RIO” (ignorando maiúsculas/minúsculas)");
   System.out.println("f) O número de dígitos (0 a 9) da string "   );
   System.out.println("g) String é um palíndromo ou não");

	}

}