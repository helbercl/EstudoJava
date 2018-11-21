package br.com.algaworks.javabasico.exercicios;

public class AppQC {

	public static void main(String[] args) {
		System.out.println(Enigma(10, 12));

	}

	static int Enigma(int x, int y) {
		if (y == 1)
			return x;
		else
			return x + Enigma(x, --y);
	}

}
