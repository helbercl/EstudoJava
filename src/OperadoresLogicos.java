import java.util.Scanner;


public class OperadoresLogicos {

	// && e  || ou

	public static void main(String[] args) {

		Scanner entrada  = new Scanner(System.in);

		System.out.print("Nome :");
		String nome = entrada.next();

		System.out.print("Peso :");
		int peso = entrada.nextInt();

		System.out.print("Altura :");
		double  altura = entrada.nextDouble();

		System.out.println("Sexo(1 -M 2-F))");
		char sexo = entrada.nextShort()==1 ? 'M':'F';//operador ternario

		double imc = peso/(altura * altura);

		if ((sexo=='F' && imc < 19.1)||(sexo =='M' && imc < 20.7)) {	
			System.out.println("Peso Muito Baixo");
		}

		else if ((sexo=='F' && (imc >=19.1 && imc < 25.8)) || (sexo=='M' && imc >=20.7 && imc < 26.4 ) ){ 
			System.out.println("Peso Ideal");	
		}
		else if ((sexo =='F' && (imc >=25.8 && imc<=27.3)) ||(sexo =='M' && (imc >=26.4 && imc<=27.8))) {
			System.out.println("Pouco Acima do Peso");

		}

		System.out.println("IMC :" + imc);
	}

}
