package br.com.algaworks.javabasico.gerais;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		String name,control;		
		double weigth = 0, height = 0, imc = 0;
		
		
		Scanner  input = new Scanner(System.in);
		
		System.out.println("Do you want calculate IMC?");
		control=input.nextLine();
		
		while ("S".equalsIgnoreCase(control) && !"".equalsIgnoreCase(control)) {

			try {
				System.out.println("===================IMC==================");
				
				
				System.out.print("Name:");
				name = input.nextLine();
				
				System.out.print("Weight:");//Peso
				weigth = input.nextDouble();

				System.out.print("Height:");//Altura
				height = input.nextDouble();
				
                
				if (!validateFields(name, weigth, height)) {
					imc = weigth / (height * height);						
				}else {
					System.out.println("Incorrect Parameters!");
				}
				
				System.out.println("IMC :" + imc);
				System.out.println("========================================");
				
                
			} catch (Exception e) {
				System.err.println(e.getMessage() + e.getCause());
				control="N";
			}
			System.out.print("Do you want calculate IMC again?");
			control=input.nextLine();
		}

	}

	private static boolean validateFields(String name, double weigth, double height) {
		boolean findCriteriaWarn = false;
		if ("".equalsIgnoreCase(name) || name.length() < 4) { // regra inventada
			System.out.println("Invalid Name!");
			findCriteriaWarn = true;
		} else if (weigth <= 0) {
			System.out.println("Invalid Weigth!");
			findCriteriaWarn = true;
		} else if (height <= 0 ) {
			System.out.println("Invalid Height");
			findCriteriaWarn = true;
		}
		return findCriteriaWarn;
	}

}
