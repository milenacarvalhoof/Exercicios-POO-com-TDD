package com.gft.desafio_tdd.atividade1.exercicio3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MagoTest {

	private Mago mago;
	
	@Before
	public void setup() {
		mago = new Mago();
	}
	
	@Test
	public void deve_testar_aprender_magia() throws Exception {		
		String magiaNova = mago.aprenderMagia("M1");
				
		assertEquals("Magia: M1 Aprendida!", magiaNova);
		
		List<String> listaMagias = Arrays.asList("M1");
		
		assertEquals(listaMagias, mago.magia);
	}
	
	@Test
	public void testar_attack() throws Exception {
		boolean danoCausado = false;
		
		int dano = mago.attack();
		
		if (dano > 0) {
			danoCausado = true;
		}
		
		assertEquals(true, danoCausado);
	}
	
	@Test
	public void testar_lvlUp() throws Exception {
		mago.lvlUp();
		
		assertEquals(3, mago.getMana());
		assertEquals(3, mago.getInteligencia());
		assertEquals(2, mago.getForca());
		assertEquals(2, mago.getVida());
	}	
}
