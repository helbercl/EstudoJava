package br.com.algaworks.javabasico.exercicios;

public class Televisor {

	public static void main(String[] args) {
		
		Integer canal=130;
		Integer volume=20;
		
		
	  public void mudarCanal(Integer novoCanal) {
			
			if (canal==novoCanal) {
				System.out.println("Novo canal é também o canal atual.");
			} else {
				canal=novoCanal;
			    System.out.println("Canal Alterado para " + canal);
			}
		}
	
		
	
	}

}
