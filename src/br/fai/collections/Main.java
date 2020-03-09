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
	
	private void Start() {
		
		List<String> lista = new ArrayList<String>();
		String valor = obterDados();
		System.out.println(valor);
		
	}
	
	private String obterDados() {
		
		int valor = scan.nextInt();
		return String.valueOf(valor);		
		
	}

}
