package edu.udc.psw;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicação {
	
	//Exceção da mais especifica para a mais generica
	
	private FileWriter output;

	public static void main(String[] args) {
		new Aplicação();
	}
	
	public Aplicação() {
		Raquete raquete = lerRaquete();

		System.out.println("A sua raquete: " + raquete);
		
		openFile();
		
		try {
			output.append(raquete.toString());
			output.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
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
	
	public void openFile() {
		try {
			output = new FileWriter("raquetes.txt");
		}
		catch(SecurityException SecurityExpress) {
			System.err.println("You do not have write acess to this file");
			System.exit(1);
		}
		catch(FileNotFoundException filesNotFoundException) {
			System.err.println("You do not have write acess to this file");
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
