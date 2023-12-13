package colections;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		Scanner scan = new Scanner(System.in);

		int opcao;

		do {
			exibirMenu();
			System.out.println("Escolha uma opcao: ");
			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 1:
				adicionarPilha(pilha, scan);
				break;

			case 2:
				listar(pilha);
				break;
				
			case 3:
				remove(pilha);
				break;	

			case 0:
				System.out.println("O programa foi finalizado!");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);

	}

	private static void exibirMenu() {
		System.out.println("1 - Adicionar Livro na pilha");
		System.out.println("2 - Lista todos os livros");
		System.out.println("3 - Retirar livro da pilha");
		System.out.println("0 - Sair");
	}

	private static void adicionarPilha(Stack<String> pilha, Scanner scan) {
		System.out.print("Digite o nome livro: ");
		String nomeLivro = scan.nextLine();

		pilha.push(nomeLivro);
		System.out.println("-->> Livro adicionado à pilha. <<--");
	}

	private static void listar(Stack<String> pilha) {
		if (pilha.isEmpty()) {
			System.out.println("->> A fila está vazia. <<--");
		} else {
			System.out.println("-->> Livros na pilha: <<--");
			for (String cliente : pilha) {
				System.out.println(cliente);
			}
		}
	}
	
	private static void remove(Stack<String> pilha) {
		if (!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}else {
			System.out.println("-->> A Pilha está vazia! <<--");			
		}
	}
}
