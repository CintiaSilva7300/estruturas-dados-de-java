package colections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		 Queue<String> filaClientes = new LinkedList<>();
	        Scanner scan = new Scanner(System.in);

	        int opcao;
	        do {
	            exibirMenu();
	            System.out.print("Entre com a opção desejada: ");
	            opcao = scan.nextInt();
	            scan.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    adicionarCliente(filaClientes, scan);
	                    break;
	                case 2:
	                    listarClientes(filaClientes);
	                    break;
	                case 3:
	                    chamarCliente(filaClientes);
	                    break;
	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 0);
	        
	        scan.close();
	    }

	    private static void exibirMenu() {
	        System.out.println("Menu:");
	        System.out.println("1 - Adicionar Cliente");
	        System.out.println("2 - Listar Clientes");
	        System.out.println("3 - Chamar Cliente");
	        System.out.println("0 - Sair");
	    }

	    private static void adicionarCliente(Queue<String> filaClientes, Scanner scan) {
	        System.out.print("Digite o nome do Cliente: ");
	        String nomeCliente = scan.nextLine();
	        filaClientes.add(nomeCliente);
	        System.out.println("Cliente adicionado à fila.");
	    }

	    private static void listarClientes(Queue<String> filaClientes) {
	        if (filaClientes.isEmpty()) {
	            System.out.println("A fila está vazia.");
	        } else {
	            System.out.println("Clientes na fila:");
	            for (String cliente : filaClientes) {
	                System.out.println(cliente);
	            }
	        }
	    }

	    private static void chamarCliente(Queue<String> filaClientes) {
	        if (filaClientes.isEmpty()) {
	            System.out.println("A fila está vazia. Não há clientes para chamar.");
	        } else {
	            String clienteChamado = filaClientes.poll();
	            System.out.println("Cliente chamado: " + clienteChamado);
	        }
	    }

	   
}
