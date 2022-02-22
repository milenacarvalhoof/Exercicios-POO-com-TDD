package com.gft.desafio_tdd.atividade1.exercicio1.models;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado = false;
	private int litrosCombustivel = 0;
	private int velocidade = 0;
	private Double preco;

	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, String placa, String cor, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.preco = preco;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo - Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa + ", Cor: " + cor + ", KM: " + km
				+ ", Está Ligado? " + isLigado + ", Quantidade de Combustivel: " + litrosCombustivel + " litros" + ", Velocidade Atual: " + velocidade
				+ ", Preco: " + preco;
	}	
}
