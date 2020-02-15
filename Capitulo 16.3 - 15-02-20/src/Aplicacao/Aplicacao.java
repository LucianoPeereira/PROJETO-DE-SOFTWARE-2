package Aplicacao;

import Colecao.*;
import java.util.Iterator;

public class Aplicacao {

	public static void main(String[] args) {
		ListaEncadeada<Ponto2D> lista = new ListaEncadeada<Ponto2D>();
		
		
		Ponto2D ponto = new Ponto2D(5,5);
		lista.inserir(ponto, 0);
		
		ponto = new Ponto2D(6,7);
		lista.inserir(ponto, 1);
		
		
		for(int i = 10; i < 25; i++) {
			ponto = new Ponto2D(i, i+55);
			lista.inserir(ponto, 0);
		}

		for(Ponto2D p:lista)
			System.out.println(p);
		
	}

}