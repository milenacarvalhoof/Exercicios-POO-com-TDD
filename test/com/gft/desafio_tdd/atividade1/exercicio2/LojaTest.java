package com.gft.desafio_tdd.atividade1.exercicio2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gft.desafio_tdd.atividade1.exercicio2.models.Livro;
import com.gft.desafio_tdd.atividade1.exercicio2.models.Loja;
import com.gft.desafio_tdd.atividade1.exercicio2.models.VideoGame;

public class LojaTest {
	
	Livro l1;
	Livro l2;
	Livro l3;
	
	VideoGame ps4;
	VideoGame ps4Usado;
	VideoGame xbox;
	
	List<Livro> livros;
	List<VideoGame> games;
	
	Loja americanas;
	
	@Before
	public void setup() {
		l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "Fantasia", 500);
		l3 = new Livro("Java POO", 20, 50, "GFT", "Educativo", 500);
		
		ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		livros = Arrays.asList(l1, l2, l3);
		games = Arrays.asList(ps4, ps4Usado, xbox);
		
		americanas = new Loja("Americanas", "123456789", livros, games);
	}	
	
	@Test
	public void deve_testar_calcular_patrimonio() throws Exception {	

		double patrimonio = americanas.calcularPatrimonio();
		
		assertEquals(941800.0, patrimonio, 0.0001);
	}
}
