package edu.udc.psw;
import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Entre com o tamanho da matriz: \n");
		int linha = sc.nextInt(); 
		int coluna = sc.nextInt();
		
		Cortador C = new Cortador(linha, coluna);
		C.Cria_Matriz();
		
		System.out.printf("Entre com o total de formigueiros: \n");
		int auxiliar = sc.nextInt();
		do {
			System.out.println("Entre com a coordenada do Formigueiro: ");
			int x = sc.nextInt(); 
			int y = sc.nextInt();
			C.Formigueiro(x, y);
			auxiliar -=1; 
			
		}while(auxiliar!=0);
		
		C.Cortador_Grama(0, 0);
		C.Imprime_Matriz();
	}
}