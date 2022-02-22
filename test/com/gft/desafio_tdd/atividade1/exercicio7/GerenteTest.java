package com.gft.desafio_tdd.atividade1.exercicio7;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GerenteTest {
	
	Gerente gerente;
	
	@Before
	public void setup() {
		gerente = new Gerente("Pedro", 38, 6000);
	}
	
	@Test
	public void testar_bonificacao() throws Exception {
		gerente.bonificacao();
		
		assertEquals(16000, gerente.getSalario(), 0.0001);
	}

}
