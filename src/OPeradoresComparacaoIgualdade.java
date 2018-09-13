
public class OPeradoresComparacaoIgualdade {

	public static void main(String[] args) {
		/*Operadores de Comparação : >  >=  < <=
		 * Operadores de Igualdade : == igual ou != diferente
		 * */

		boolean maior,menor,maiorOuIgual,menorOuIgual,igual,diferente;
		int a=10;
		int b =5;
		int c =2;

		maior =b>a;
		menor =a<b;
		maiorOuIgual=b>=a;
		menorOuIgual=a<=10;
		igual = a ==b-c;
		diferente = a!=c;

		System.out.println("Maior :" + maior);//false
		System.out.println("Menor :"+menor);//false
		System.out.println("MenorOuIgual :" + menorOuIgual); //true
		System.out.println("MaiorOuIgual :" + maiorOuIgual); //false
		System.out.println("Igual :"+igual);//false
		System.out.println("Diferente " + diferente);//true

	}

}
