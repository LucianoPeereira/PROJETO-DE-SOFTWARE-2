package edu.udc.psw;

import java.util.Scanner;

public class Aplicação {
	
	//Exceção da mais especifica para a mais generica

	public static void main(String[] args) {
		new Aplicação();
	}
	
	public Aplicação() {
		Raquete raquete = lerRaquete();

		System.out.println("A sua raquete: " + raquete);
	}
	
	static Raquete lerRaquete() {
		float peso;
		String cor;
		int comprimento;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o peso da raquete?");
		peso = sc.nextFloat();
	
		System.out.println("Qual o comprimento da raquete?(mm)");
		comprimento = sc.nextInt();
		
		System.out.println("Qual a cor da raquete?");
		cor = sc.next();
		
		Raquete raquete = new Raquete(peso, cor, comprimento);
		sc.close();
		return raquete;
	}

}
