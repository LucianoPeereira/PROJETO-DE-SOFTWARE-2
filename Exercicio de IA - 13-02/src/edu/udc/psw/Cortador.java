package edu.udc.psw;

public class Cortador {
	
	String matriz[][] = new String[10][10];
	int linhas;
	int colunas;
	int formigueiros;
	
	public Cortador(int linhas, int colunas) {
		 this.linhas = linhas;
		 this.colunas = colunas;
	}
	
	public void Cria_Matriz() {
		for(int x=0; x<linhas; x++) {
			for(int y=0; y<colunas; y++)
				matriz[x][y] = "GA";
		}
	}
	
	public void Formigueiro(int x, int y) {
		matriz[x][y] = "F";
		formigueiros+= 1;
	}
	
	public void  Cortador_Grama(int lin, int col) {
		int auxiliar = (linhas*colunas)-formigueiros;
		
		do {
			if(lin>=linhas) {
				lin = 0;
				col++;
			}
			if(matriz[lin][col] == "GA") {
				matriz[lin][col] = "GB";
				lin++;
				auxiliar -= 1;
			}
			else if(matriz[lin][col] == "F")
				lin+= 1;
			
			Imprime_Matriz();
		}while(auxiliar!= 0);
	}
	
	public void Imprime_Matriz() {
		for(int x=0; x<linhas; x++) {
			for(int y=0; y<colunas; y++) {
				System.out.printf("%s ", matriz[x][y]);
			}
			System.out.println();
		}
	}
}
