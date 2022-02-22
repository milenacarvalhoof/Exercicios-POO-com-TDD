package com.gft.desafio_tdd.atividade2.entre_letras.services;

import java.util.Arrays;
import java.util.List;

import com.gft.desafio_tdd.atividade2.entre_letras.models.Letras;

public class LetrasService {
	
	private final Letras letras;
	
	public LetrasService(Letras letras) {
		this.letras = letras;
	}

	public boolean estaEmOrdemAlfabetica() {
		if (letras.getLetra1().compareToIgnoreCase(letras.getLetra2()) > 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public List<Integer> transformaLetrasEmNumeros() {
				
		char char1 = letras.getLetra1().charAt(0);
		char char2 = letras.getLetra2().charAt(0);
		
		char char1Minuscula = Character.toLowerCase(char1);
		char char2Minuscula = Character.toLowerCase(char2);
		
		int n1 = char1Minuscula - 'a' + 1;
		int n2 = char2Minuscula - 'a' + 1;
		
		List<Integer> nums = Arrays.asList(n1, n2);
		
		return nums;
	}
	
	public String quantidadeDeLetrasEntreLetras() {
		int cont = 0;
		List<Integer> list = this.transformaLetrasEmNumeros();
		
		if (!estaEmOrdemAlfabetica()) {
			return "Não está na ordem alfabética!";
		}
		
		for (int i = 2; i < list.get(1); i++) {
			cont ++;
		}
		
		return cont + " letras";
	}

}
