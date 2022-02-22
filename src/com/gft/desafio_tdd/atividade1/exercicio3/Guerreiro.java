package com.gft.desafio_tdd.atividade1.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	
	List<String> habilidades = new ArrayList<>();
	Random random = new Random();
	
	@Override
	void lvlUp() {
		setVida(getVida()+2);
		setForca(getForca()+2);
		setMana(getMana()+1);
		setInteligencia(getInteligencia()+1);
	}

	@Override
	int attack() {
		int dano = (getForca() * getLevel()) + random.nextInt(300);
		return dano;
	}
	
	public String aprenderHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
		return "Habilidade: " + habilidade + " Aprendida!";
	}

	@Override
	public String toString() {
		return "Guerreiro " + this.getNome() + ": " + "\nVida: " + this.getVida() + "\nMana: " + this.getMana() + "\nXP: " + this.getXp() + "\nInteligência: " + this.getInteligencia() + "\nForça: " + this.getForca() + "\nLevel: " + this.getLevel();
	}	
}
