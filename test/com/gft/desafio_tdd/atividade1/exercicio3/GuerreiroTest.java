package com.gft.desafio_tdd.atividade1.exercicio3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GuerreiroTest {
	
	private Guerreiro guerreiro;
	
	@Before
	public void setup() {
		guerreiro = new Guerreiro();
	}
	
	@Test
	public void deve_testar_aprender_habilidade() throws Exception {		
		String habilidadeNova = guerreiro.aprenderHabilidade("H1");
				
		assertEquals("Habilidade: H1 Aprendida!", habilidadeNova);
		
		List<String> listaHabilidade = Arrays.asList("H1");
		
		assertEquals(listaHabilidade, guerreiro.habilidades);
	}
	
	@Test
	public void testar_attack() throws Exception {
		boolean danoCausado = false;
		
		int dano = guerreiro.attack();
		
		if (dano > 0) {
			danoCausado = true;
		}
		
		assertEquals(true, danoCausado);
	}
	
	@Test
	public void testar_lvlUp() throws Exception {
		guerreiro.lvlUp();
		
		assertEquals(3, guerreiro.getVida());
		assertEquals(3, guerreiro.getForca());
		assertEquals(2, guerreiro.getMana());
		assertEquals(2, guerreiro.getInteligencia());
	}
}
