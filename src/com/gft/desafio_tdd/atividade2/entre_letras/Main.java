package com.gft.desafio_tdd.atividade2.entre_letras;

import java.util.Scanner;

import com.gft.desafio_tdd.atividade2.entre_letras.models.Letras;
import com.gft.desafio_tdd.atividade2.entre_letras.services.LetrasService;

public class Main {
	//Fa�a um programa que receba duas letras, 
	//e diga quantas letras h� entre elas. 
	//As letras passadas devem estar em ordem alfab�tica. 
	//Se n�o estiverem o programa deve avisar o usu�rio. 
	//Exemplo: 'a' / 'b' = 0. 'a' / 'c' = 1. 'a' / 'z' = 24.
	//'w' / 'e' = N�o est� na ordem alfab�tica.
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra1 = ler.nextLine();
		System.out.println("Digite outra letra: ");
		String letra2 = ler.nextLine();
		
		Letras letras = new Letras(letra1, letra2);
		LetrasService letrasService = new LetrasService(letras);
		
		System.out.println(letrasService.quantidadeDeLetrasEntreLetras());
		
		ler.close();
	}
}
