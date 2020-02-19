package edu.udc.psw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Aplicação {
	
	//Exceção da mais especifica para a mais generica
	
	

	public static void main(String[] args) {
		new Aplicação();
	}
	
	public Aplicação() {
		Raquete raquete = lerRaquete();

		System.out.println("A sua raquete: " + raquete);
		
		FileWriter output = writeTextFile();
		
		try {
			output.append(raquete.toString());
			output.append(String.format("Agora vou salvar a raquete diferente \n"));
			//output.append(String.format("Agora vou salvar a raquete diferente \n"));
			
			output.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		ObjectOutputStream objectOutput = writeObjectFile();
		
		try {
			objectOutput.writeObject(raquete);
			objectOutput.close();
		}catch( IOException e) {
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
	
	public FileWriter writeTextFile() {
		
		FileWriter output = null;
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
		return output;
		
	}
	
	public ObjectOutputStream writeObjectFile() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream (new FileOutputStream("raquetes.serial") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return oos;
		
	}

}
