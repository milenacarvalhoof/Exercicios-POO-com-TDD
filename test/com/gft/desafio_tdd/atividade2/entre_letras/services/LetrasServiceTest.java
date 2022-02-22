package com.gft.desafio_tdd.atividade2.entre_letras.services;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gft.desafio_tdd.atividade2.entre_letras.models.Letras;

public class LetrasServiceTest {
	
	private Letras letrasMaiusculas;
	private Letras letrasMinusculas;
	private Letras letrasForaDeOrdem;
	
	@Before
	public void setup() {
		letrasMaiusculas = new Letras("A", "D");
		letrasMinusculas = new Letras("a", "d");
		letrasForaDeOrdem = new Letras("d", "a");
	}
	
	@Test
	public void verifica_se_esta_em_ordem_alfabetica() throws Exception {
		LetrasService letrasService = new LetrasService(letrasMinusculas);
		
		boolean resultado = letrasService.estaEmOrdemAlfabetica();
		
		assertEquals(true, resultado);
	}
	
	@Test
	public void verifica_se_nao_esta_em_ordem_alfabetica() throws Exception {
		LetrasService letrasService = new LetrasService(letrasForaDeOrdem);
		
		boolean resultado = letrasService.estaEmOrdemAlfabetica();
		
		assertEquals(false, resultado);
	}
	
	@Test
	public void testar_transformar_letras_maiusculas_em_numeros() throws Exception {
		LetrasService letrasService = new LetrasService(letrasMaiusculas);
		
		List<Integer> numeros = Arrays.asList(1, 4);
		assertEquals(numeros, letrasService.transformaLetrasEmNumeros());
	}
	@Test
	public void testar_transformar_letras_minusculas_em_numeros() throws Exception {
		LetrasService letrasService = new LetrasService(letrasMinusculas);
		
		List<Integer> numeros = Arrays.asList(1, 4);
		assertEquals(numeros, letrasService.transformaLetrasEmNumeros());
	}
	
	@Test
	public void testar_quantidade_de_letras_entre_letras_em_ordem_alfabetica() throws Exception {
		LetrasService letrasService = new LetrasService(letrasMinusculas);
		
		assertEquals("2 letras", letrasService.quantidadeDeLetrasEntreLetras());
	}
	
	@Test
	public void testar_quantidade_de_letras_entre_letras_fora_de_ordem_alfabetica() throws Exception {
		LetrasService letrasService = new LetrasService(letrasForaDeOrdem);
		
		assertEquals("Não está na ordem alfabética!", letrasService.quantidadeDeLetrasEntreLetras());
	}

}
