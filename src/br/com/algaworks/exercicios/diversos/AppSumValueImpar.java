package br.com.algaworks.exercicios.diversos;

public class AppSumValueImpar {
	
	public static void main(String[] args) {
		imprimir(30);
	}
	
	private static void imprimir(int impar) {
		for (int i = impar; i <=30 ; i--) {
			if (i%2>0) {
				System.out.println(i);	
			}
			
		}
	}

}
