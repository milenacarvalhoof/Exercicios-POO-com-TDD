package com.gft.desafio_tdd.atividade1.exercicio3;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Mago m1 = new Mago();
		m1.setNome("Mago 1");
		
		m1.lvlUp();
		System.out.println(m1);
		
		String magia1 = m1.aprenderMagia("Magia Especial");
		System.out.println(magia1);
		
		int dano1 = m1.attack();
		System.out.println("Dano causado = " + dano1);
		
		List<String> magias = m1.magia;
		System.out.println("Magias aprendidas: " + magias + "\n");
		
		Guerreiro g1 = new Guerreiro();
		g1.setNome("Guerreiro 1");
		
		g1.lvlUp();
		System.out.println(g1);
		
		String habilidade1 = g1.aprenderHabilidade("Habilidade Especial");
		System.out.println(habilidade1);
		
		int dano2 = g1.attack();
		System.out.println("Dano causado = " + dano2);		
		
		List<String> habilidades = g1.habilidades;
		
		System.out.println("Habilidades aprendidas: " + habilidades);
		
	}

}
