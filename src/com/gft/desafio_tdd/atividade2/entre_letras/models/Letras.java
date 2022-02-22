package com.gft.desafio_tdd.atividade2.entre_letras.models;

public class Letras {
	
	private String letra1;
	private String letra2;
		
	public Letras(String letra1, String letra2) {
		this.letra1 = letra1;
		this.letra2 = letra2;
	}

	public String getLetra1() {
		return letra1;
	}

	public void setLetra1(String letra1) {
		this.letra1 = letra1;
	}

	public String getLetra2() {
		return letra2;
	}

	public void setLetra2(String letra2) {
		this.letra2 = letra2;
	}	
}
