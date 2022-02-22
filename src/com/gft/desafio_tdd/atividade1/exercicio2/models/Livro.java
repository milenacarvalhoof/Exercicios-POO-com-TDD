package com.gft.desafio_tdd.atividade1.exercicio2.models;

import com.gft.desafio_tdd.atividade1.exercicio2.interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro() {}
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQtd(qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public String toString() {
		return "\nTitulo: " + getNome() + " , preço: " + getPreco() + " , quantidade: " + getQtd() + " em estoque";
	}

	@Override
	public double calcularImposto() {
		
		double imposto = 0;
		
		if (!tema.equalsIgnoreCase("Educativo")) {
			imposto = getPreco() * 10 / 100;
		}
		
		return imposto;
	}

}
