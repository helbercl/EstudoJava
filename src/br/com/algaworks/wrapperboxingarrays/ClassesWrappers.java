package br.com.algaworks.wrapperboxingarrays;

public class ClassesWrappers {

	public static void main(String[] args) {

		int x = 5;
		Integer wr = new Integer(x);
		System.out.println(wr.byteValue());
		System.out.println(wr.doubleValue());

		String valor = "15.5";

		Float fValor = new Float(valor);
		System.out.println(fValor + 3);

		int idade = Integer.parseInt("27");
		System.out.println(idade + 4);
	}

}
