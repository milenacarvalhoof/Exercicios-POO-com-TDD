package com.gft.desafio_tdd.atividade1.exercicio2.models;

import com.gft.desafio_tdd.atividade1.exercicio2.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{

	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame() {}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQtd(qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calcularImposto() {
		double imposto;
		if (isUsado) {
			imposto = getPreco() * 25 / 100;
		} else {
			imposto = getPreco() * 45 / 100;
		}
		return imposto;
	}
	
	@Override
	public String toString() {
		return "\nVideo-Game: " + getNome() + " " + getModelo() + " , preço: " + getPreco() + " , quantidade: " + getQtd() + " em estoque";
	}
	
}
