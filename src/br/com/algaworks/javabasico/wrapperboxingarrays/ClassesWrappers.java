package br.com.algaworks.javabasico.wrapperboxingarrays;

public class ClassesWrappers {

	public static void main(String[] args) {
        // Wrappers - Envelopar um tipo primitivo em um tipo derivado do mesmo tipo.
		// byte,short,int,long ,float ,double e char
		// Byte,Short,Integer,Long,Float,Double e Character
		int x = 5;
		Integer wr = new Integer(x);
		
		System.out.println("Envelopar o int X no Integer :" + wr.byteValue());
		
		System.out.println("====Mostrando o comportamento da classe ====");
		System.out.println("Integer Valor em Double :" + wr.doubleValue());
		System.out.println("Integer Valor em Bytes : " + wr.byteValue());
		
		//Transformando uma String como valor 

		String valor = "15.5";

		Float fValor = new Float(valor);
		
		System.out.println("Convertendo String em valor e fazendo soma:" + (fValor + 9));

		int idade = Integer.parseInt("27");//parsexx - todas as classes tem esse metodo por herdar de Object
		System.out.println("Sua Idade Será daqui a 5 anos :"+(idade + 4));
		
		try {
			double custo=Double.parseDouble("Vinte reais e trinta centavos");
			System.out.println("Custo Total :" + custo);
		} catch (Exception e) {
			System.out.println("Erro :" + e.getMessage()+e.getCause());			
			StringBuffer append = new StringBuffer();
			System.out.println(append.append(e.getStackTrace()).toString());
		}
		
	}

}
