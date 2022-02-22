package com.gft.desafio_tdd.atividade1.exercicio1.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.gft.desafio_tdd.atividade1.exercicio1.models.Veiculo;

public class VeiculoServiceTest {
	
	private Veiculo veiculo;
	private VeiculoService veiculoService;
	
	@Before
	public void setup() {
		veiculo = new Veiculo("Hyundai", "HB20", "MCM2021", "Vermelho", 50.000);
		veiculoService = new VeiculoService(veiculo);
	}
	
	@Test
	public void deve_testar_ligar_veiculo_desligado() throws Exception {
		veiculoService.ligar();
		
		assertEquals(true, veiculo.isLigado());
	}
	@Test
	public void deve_testar_ligar_veiculo_ligado() throws Exception {
		veiculoService.ligar();
		veiculoService.ligar();
		
		assertEquals(true, veiculo.isLigado());
	}
	
	@Test
	public void deve_testar_desligar_veiculo_em_movimento() throws Exception {
		veiculoService.ligar();
		veiculoService.acelerar();
		veiculoService.desligar();
		
		assertEquals(true, veiculo.isLigado());
	}
	
	@Test
	public void deve_testar_desligar_veiculo() throws Exception {
		veiculoService.ligar();
		veiculoService.desligar();
		
		assertEquals(false, veiculo.isLigado());
	}
	
	@Test
	public void deve_testar_acelerar_veiculo_desligado() throws Exception {
		veiculoService.acelerar();
		
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	public void deve_testar_acelerar_veiculo_ligado() throws Exception {
		veiculoService.ligar();
		veiculoService.acelerar();
		
		assertEquals(20, veiculo.getVelocidade());
	}
	
	@Test
	public void deve_testar_abastecer_veiculo_acima_do_limite_permitido_de_combustível() throws Exception {
		veiculoService.abastecer(65);
		
		assertEquals(0, veiculo.getLitrosCombustivel());
	}
	
	@Test
	public void deve_testar_abastecer_veiculo_abaixo_do_limite_permitido_de_combustível() throws Exception {
		veiculoService.abastecer(-1);
		
		assertEquals(0, veiculo.getLitrosCombustivel());
	}
	
	@Test
	public void deve_testar_abastecer_veiculo_no_limite_permitido_de_combustível() throws Exception {
		veiculoService.abastecer(60);
		
		assertEquals(60, veiculo.getLitrosCombustivel());
	}
	
	@Test
	public void deve_testar_frear_veiculo_com_velocidade_acima_de_20() throws Exception {
		veiculoService.ligar();
		veiculoService.acelerar();
		veiculoService.acelerar();
		veiculoService.frear();;
		
		assertEquals(20, veiculo.getVelocidade());
	}
	
	@Test
	public void deve_testar_frear_veiculo() throws Exception {
		veiculoService.ligar();
		veiculoService.acelerar();
		veiculoService.frear();;
		
		assertEquals(0, veiculo.getVelocidade());
	}
	
	@Test
	public void deve_testar_pintar_veiculo() throws Exception {
		veiculoService.pintar("branco");
		
		assertEquals("branco", veiculo.getCor());
	}
	

}
