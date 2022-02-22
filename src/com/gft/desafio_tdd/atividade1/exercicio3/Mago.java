package com.gft.desafio_tdd.atividade1.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
	
	List<String> magia = new ArrayList<>();
	Random random = new Random();

	@Override
	void lvlUp() {
		setMana(getMana()+2);
		setInteligencia(getInteligencia()+2);
		setForca(getForca()+1);
		setVida(getVida()+1);
	}

	@Override
	int attack() {
		int dano = (getInteligencia() * getLevel()) + random.nextInt(300);
		return dano;
	}
	
	String aprenderMagia(String magia) {
		this.magia.add(magia);
		return "Magia: " + magia + " Aprendida!";
	}

	@Override
	public String toString() {
		return "Mago " + this.getNome() + ": " + "\nVida: " + this.getVida() + "\nMana: " + this.getMana() + "\nXP: " + this.getXp() + "\nInteligência: " + this.getInteligencia() + "\nForça: " + this.getForca() + "\nLevel: " + this.getLevel();
	}
}
