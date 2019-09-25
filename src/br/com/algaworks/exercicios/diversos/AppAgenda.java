package br.com.algaworks.exercicios.diversos;

import java.util.Iterator;
import java.util.Scanner;

public class AppAgenda {

	static Contatos contato;
	static Scanner entrada;
	static Contatos[] vetorContatos;
	static int qtdeContatos, menu = 0;

	public static void main(String[] args) {		

		System.out.println("Informe as opções desejadas : 1 - inserir , 2 - buscar , 3 - excluir");

		switch (menu) {
		case 1:
			adicionarContato();
			break;
		case 2:
			String nome = entrada.next();
			buscarContato( nome);
			break;
		case 3:
			break;
		default:
			System.out.println("Opção Invalida!");
			break;
		}
	}

	private static void adicionarContato() {
		
		contato = new Contatos();
        entrada = new Scanner(System.in);

		System.out.println("Informe a quantidade de contatos para inserir :");
		qtdeContatos = entrada.nextInt();		
		vetorContatos = new Contatos[qtdeContatos];
        
		for (int i = 0; i < vetorContatos.length; i++) {			

			System.out.println("Informe o nome do Contato :");
			contato.nome = entrada.next();

			System.out.println("Informe o email do Contato :");
			contato.email = entrada.next();
			
			
			if (!"".equals(contato.nome) && !"".equals(contato.email)) {
				vetorContatos[i]=contato;
			} else {
				System.out.println("Não é possivel inserir valor vazio!");
				i -= 1;

			}

		}
	}

	private static void buscarContato(String nome) {
		 //for (String nome : vetorContatos) {}
        //  vetorContatos[i].equals(contato.nome)=nome;
	}

}

class Contatos {

	String nome, email;
}
