import java.util.Scanner;

public class AulaArrays {

	public static void main(String[] args) {

		double[] notas = new double[3];// Posições notas 0,1,2

		for (int j = 0; j < notas.length; j++) {
			System.out.println("Informe as notas :");
			Scanner entrada = new Scanner(System.in);
			notas[j] = entrada.nextDouble();
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posição["+ i +"]"+ notas[i]);
		}
			
		

	}

}
