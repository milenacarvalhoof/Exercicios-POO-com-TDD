package com.gft.desafio_tdd.atividade1.exercicio7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendedorTest {
	
	Vendedor vendedor;
	
	@Before
	public void setup() {
		vendedor = new Vendedor("João", 30, 2000);
	}
	
	@Test
	public void testar_bonificacao() throws Exception {
		vendedor.bonificacao();
		
		assertEquals(5000, vendedor.getSalario(), 0.0001);
	}

}
