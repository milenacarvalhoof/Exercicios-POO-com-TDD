package com.gft.desafio_tdd.atividade1.exercicio7;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SupervisorTest {
	
	Supervisor supervisor;
	
	@Before
	public void setup() {
		supervisor = new Supervisor("Maria", 35, 4000);
	}
	
	@Test
	public void testar_bonificacao() throws Exception {
		supervisor.bonificacao();
		
		assertEquals(9000, supervisor.getSalario(), 0.0001);
	}

}
