package com.gft.desafio_tdd.atividade1.exercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gft.desafio_tdd.atividade1.exercicio2.models.VideoGame;

public class VideoGameTest {
	
	@Test
	public void deve_permitir_criar_video_game() throws Exception {
		VideoGame videoGame = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		
		assertEquals("PS4", videoGame.getNome());
		assertEquals(1800, videoGame.getPreco(), 0.0001);
		assertEquals(100, videoGame.getQtd());
		assertEquals("Sony", videoGame.getMarca());
		assertEquals("Slim", videoGame.getModelo());
		assertEquals(false, videoGame.isUsado());
	}
	
	@Test
	public void deve_calcular_imposto_de_vinte_e_cinco_porcento_para_video_game_usado() throws Exception {
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
				
		double imposto = ps4Usado.calcularImposto();
		
		assertEquals(250.0, imposto, 0.0001);
	}
	
	@Test
	public void deve_calcular_imposto_de_quarenta_e_cinco_porcento_para_video_game() throws Exception {
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		double imposto = xbox.calcularImposto();
		
		assertEquals(675.0, imposto, 0.0001);
	}

}
