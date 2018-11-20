package br.com.algaworks.javabasico;

import javax.swing.JOptionPane;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		//preço dos 3 ultimos produtos vendidos
		
		JOptionPane dialogo = new JOptionPane("Digite o produto 1", null);
		
	  int produto1 =5;
	  int produto2 = 8;
	  int produto3 =12;
	  
	  int media = (produto1+produto2+produto3)/3;
	  System.out.println("\" Sistema de Calculo de Média\"");
	  System.out.println("Preco 1 "+produto1);
	  System.out.println("Preco 2 "+produto2);
	  System.out.println("Preco 3 "+produto3);
	  System.out.println(" Média de Preços: "+media);
	}

}
