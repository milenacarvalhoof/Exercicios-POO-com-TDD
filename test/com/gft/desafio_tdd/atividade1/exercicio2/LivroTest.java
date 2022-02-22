package com.gft.desafio_tdd.atividade1.exercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gft.desafio_tdd.atividade1.exercicio2.models.Livro;

public class LivroTest {
		
	@Test
	public void deve_permitir_criar_livro() throws Exception {
		Livro livro = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		
		assertEquals("Harry Potter", livro.getNome());
		assertEquals(40, livro.getPreco(), 0.0001);
		assertEquals(50, livro.getQtd());
		assertEquals("J. K. Rowling", livro.getAutor());
		assertEquals("Fantasia", livro.getTema());
		assertEquals(300, livro.getQtdPag());
	}
	
	@Test
	public void deve_calcular_imposto_zerado_para_livro_educativo() throws Exception {
		Livro livro = new Livro("Java POO", 20, 50, "GFT", "Educativo", 500);
				
		double imposto = livro.calcularImposto();
		
		assertEquals(0, imposto, 0.0001);
	}
	
	@Test
	public void deve_calcular_imposto_de_dez_porcento_para_outros_livros() throws Exception {
		Livro livro = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "Fantasia", 500);
				
		double imposto = livro.calcularImposto();
		
		assertEquals(6.0, imposto, 0.0001);
	}	
}
