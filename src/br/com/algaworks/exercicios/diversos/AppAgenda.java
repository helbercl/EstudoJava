package br.com.algaworks.exercicios.diversos;

import java.util.Scanner;


public class AppAgenda {

	static Contatos contato;
	static Scanner entrada;
	static Contatos[] vetorContatos;
	static int qtdeContatos, menu, controller;
	static String nome;

	public AppAgenda() {
		qtdeContatos = 0;
		menu = 0;
		controller = 0;
	}

	public static void main(String[] args) {

		System.out.println(
				"Informe as opções desejadas : 1 - inserir  2 - buscar  3 - excluir  4 - imprimir lista 5- sair");
		entrada = new Scanner(System.in);// variavel coleta dado inserido
		menu = entrada.nextInt(); // opção desejada

		while (menu != 5) {
			switch (menu) {
			case 1:
				System.out.println("Informe a quantidade de contatos para inserir :");
				qtdeContatos = entrada.nextInt();
				vetorContatos = new Contatos[qtdeContatos];
				adicionarContato();
				break;
			case 2:
				System.out.println("Informe o nome para busca:");
				nome = entrada.next();
				Contatos achou = buscarContato(nome);
				System.out.println("Nome Encontrado :" + achou.nome + " Email: " + achou.email);
				break;
			case 3:
				System.out.println("Informe o nome para busca e exclusão:");
				nome = entrada.next();
				excluirContato(nome);
				break;
			case 4:
				imprimirLista();
				break;
			default:
				System.out.println("Opção Invalida!");
				break;
			}

			System.out.println(
					"Informe as opções desejadas : 1 - inserir  2 - buscar  3 - excluir  4 - imprimir lista 5- sair");
			entrada = new Scanner(System.in);// variavel coleta dado inserido
			menu = entrada.nextInt();
		}

		System.out.println("Fim Programa!");

	}

	private static void adicionarContato() {

		do {
			contato = new Contatos();
			System.out.println("Informe o nome do Contato :");
			contato.nome = entrada.next();

			System.out.println("Informe o email do Contato :");
			contato.email = entrada.next();

			if (!"".equals(contato.nome) && !"".equals(contato.email)) {
				vetorContatos[controller] = contato;
			} else {
				System.out.println("Não é possivel inserir valor vazio!");
				controller -= 1;
			}

			controller++;
		} while (controller < vetorContatos.length);
	}

	private static Contatos buscarContato(String nome) {
		for (Contatos contato : vetorContatos) {
			if (contato.nome.contentEquals(nome)) {
				return contato;
			}
		}
		return contato;
	}

	private static void excluirContato(String nome) {
		//TODO ajustar metodo para nao setar null
		for (int i = 0; i < vetorContatos.length; i++) {
			Contatos contato = vetorContatos[i];
			if (nome.equalsIgnoreCase(contato.nome)) {
				vetorContatos[i] = null;
				System.out.println("Nome Excluido :" + contato.nome);
			}
		}

	}

	private static void imprimirLista() {
		if (vetorContatos == null) {
			System.out.println("Nenhuma informação foi inserida!");
		} else {
			for (int i = 0; i < vetorContatos.length; i++) {
				if (vetorContatos[i]!=null) {
					System.out.println("Lista de Contatos :" + vetorContatos[i].nome + vetorContatos[i].email);	
				}
				
			}
		}
	}

}

class Contatos {

	String nome, email;
}
