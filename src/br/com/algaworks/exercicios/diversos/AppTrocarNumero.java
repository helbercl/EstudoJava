package br.com.algaworks.exercicios.diversos;

public class AppTrocarNumero {
	
	public static void main(String[] args) {
		trocarNUmero(5, 9);
	}
    
	private static void trocarNUmero (int numA,int numB) {
	 System.out.println("Dados de Entrada : Numa A :" + numA + " Num B :" + numB );
     int auxiliar=numA;
     numA=numB;
     numB=auxiliar;
     
     System.out.println("Num A :" + numA );
     System.out.println("Num B :" + numB );
    }
}
