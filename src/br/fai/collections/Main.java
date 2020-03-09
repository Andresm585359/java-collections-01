package br.fai.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Main app = new Main();
		app.Start();
		

	}
	private Scanner scan = new Scanner(System.in);
	private final String VALOR_INVALIDO = "VALOR_INVALIDO"; 
	
	private void Start() {
		List<String> lista = new ArrayList<String>();
		
		while(lista.size() < 5)
		{
			String valor = obterDados();
			
			if(valor == VALOR_INVALIDO || valor.isEmpty())
			{
				System.out.println("Valor nao foi adicionado.");
			}
			else {
				System.out.println(valor);
				lista.add(valor);
			}
		}
	
		lista.add("item adicionado automaticamente 01");
		lista.add("item adicionado automaticamente 02");
		lista.remove(1);
		lista.remove(1);
		
		for(String item : lista) {
			System.out.println("O item da lista eh: " + item);
		}
	}
	
	private String obterDados() {

		try {
			int valor = scan.nextInt();
			return String.valueOf(valor);		
			
		} catch (Exception e) {
			scan.next();
			System.out.println("Valor invalido digitado.");
			return VALOR_INVALIDO;
		}

	}

}
