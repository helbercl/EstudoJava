package br.com.algaworks.javabasico.exercicios;

public class AppCalculadoraProfessor {

	public static void main(String[] args) {
		
		float pi=3.14f;
		float raio=5.3f;
		float piMath = (float) Math.PI;
		float areaCirculo = (raio*raio)*pi;
		boolean exibirFormula=false;
				
		
		System.out.println("Resultado com casas decimais: " + areaCirculo);
		System.out.println("Resultado sem casas decimais: " + (int)areaCirculo);
		if (exibirFormula) {
			System.out.println("Pi classe Math: " + piMath);
		}
		
		
	}

}
