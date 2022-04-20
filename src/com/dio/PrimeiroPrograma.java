package com.dio;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro(null, null, null);
		Livros livros = new Livros();
		
		System.out.println(cachorro);
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/	
		}

}

class Livros {
	private String nome;
	private String npag;
}