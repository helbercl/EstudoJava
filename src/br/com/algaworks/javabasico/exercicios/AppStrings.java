package br.com.algaworks.javabasico.exercicios;

public class AppStrings {

	public static void main(String[] args) {
	//ListaExericicios02.pdf
		
   String digitada ="UniFlamengo";
   System.out.println("a) Numero Caracteres :"+ digitada.length());
   System.out.println("b) Todas Letras Maiusculas :" + digitada.toUpperCase());
   System.out.println("c) Numero de Vogais da String : ");
   
  //System.out.println("d)Se a String começa com UNI (ignorando maiúsculas/minúsculas) ? " + digitada.equalsIgnoreCase(digitada.startsWith("UNI"));
  // boolean result= digitada.startsWith("UNI") && ?value1:value2;
  System.out.println(digitada.startsWith("UNI"));
  System.out.println(digitada.equalsIgnoreCase("Uni"));
  
  
   System.out.println("e) String digitada termina com “RIO” (ignorando maiúsculas/minúsculas)");
   System.out.println("f) O número de dígitos (0 a 9) da string " + ""  );
   System.out.println("g) String é um palíndromo ou não");

	}

}
