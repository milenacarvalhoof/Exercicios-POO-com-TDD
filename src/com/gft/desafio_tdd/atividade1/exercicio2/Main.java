package com.gft.desafio_tdd.atividade1.exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gft.desafio_tdd.atividade1.exercicio2.models.Livro;
import com.gft.desafio_tdd.atividade1.exercicio2.models.Loja;
import com.gft.desafio_tdd.atividade1.exercicio2.models.VideoGame;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "Fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "Educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
	
		List<Livro> livros = Arrays.asList(l1, l2, l3);		
		List<VideoGame> games = Arrays.asList(ps4, ps4Usado, xbox);
		
		List<Livro> listaLivrosVazia = new ArrayList<>();		
		List<VideoGame> listaGamesvazia = new ArrayList<>();
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		
		Loja casasBahia = new Loja("Casas Bahia", "12345678", listaLivrosVazia, listaGamesvazia);
		
		System.out.println("\nA loja Americanas possui estes livros para venda:");
		americanas.listaLivros();
		
		System.out.println("\nA loja Americanas possui estes video-games para venda:");
		americanas.listaVideoGames();
		
		double patrimonioAmericanas = americanas.calcularPatrimonio();
		System.out.println("\nO patrimonio da loja: " + americanas.getNome() + " é de R$ " + patrimonioAmericanas);
		
		System.out.println("\nA loja Casas Bahia possui estes livros para venda:");
		casasBahia.listaLivros();
	}
}
