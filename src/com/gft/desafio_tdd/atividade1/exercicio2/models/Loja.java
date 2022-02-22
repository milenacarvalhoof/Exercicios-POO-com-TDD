package com.gft.desafio_tdd.atividade1.exercicio2.models;

import java.util.List;

public class Loja {
	
	String nome; 
	String cnpj;
	
	List<Livro> livros;
	List<VideoGame> videoGames;

	public Loja() {}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() throws Exception {
		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		}
		for (Livro livro : livros) {
			System.out.println(livro);
		}
	}
	public void listaVideoGames() throws Exception {
		if (videoGames.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque.");
		}
		for (VideoGame videoGame : videoGames) {
			System.out.println(videoGame);
		}
	}
	
	public double calcularPatrimonio() {
		double soma = 0;
		for (Livro livro : this.livros) {
			soma += livro.getPreco() * livro.getQtd();
		}
		for (VideoGame videoGame : this.videoGames) {
			soma += videoGame.getPreco() * videoGame.getQtd();
		}
		
		return soma;
	}
	
}
