package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Double> valor = new ArrayList<Double>();
		ArrayList<Long> codigo = new ArrayList<Long>();
		
		String nomes2;
		System.out.println("Digite um nome");
		nomes2 = leia.nextLine();
		
		nomes.add("Cintia1");
		nomes.add("Cintia");
		nomes.add("Cintia");
		nomes.add("Cintia");
		
//		System.out.println(nomes);
//		System.out.println(nomes.indexOf("teste"));
		
//		System.out.println(nomes.contains("Cintia1"));
		
//		System.out.println(nomes.get(0));
	
//		nomes.set(0, "teste"); //trocar informacao
//		System.out.println(nomes);
		
		//System.out.println(nomes.isEmpty()); //verica se esta vazio
		//System.out.println(codigo.isEmpty()); //verica se esta vazio
	
//		nomes.clear();
//		System.out.println(nomes);
	
//		nomes.remove(1);
//		System.out.println(nomes);
		
		for(int contador = 1; contador < 3; contador++) {
			System.out.println("Digite outro nome");
			nomes2= leia.nextLine();
			nomes.add(nomes2);
		} //adiciona nome com scanner
		
		for(String n: nomes) {
			System.out.println("->> " + n);
		}
		
//		nomes.add(nomes2);
//		for(String n: nomes) {
//			System.out.println("inserido no teclado ->> " + n);
//		}
		
		Iterator<String> iNomes = nomes.iterator();
		
		while (iNomes.hasNext()) { //hasNext = tem proximo
			System.out.println(iNomes.next());//next = proximo
			
			
		}
		
	}

}
