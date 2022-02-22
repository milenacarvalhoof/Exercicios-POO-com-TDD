package com.gft.desafio_tdd.atividade1.exercicio1.services;

import com.gft.desafio_tdd.atividade1.exercicio1.models.Veiculo;

public class VeiculoService {
	
	private Veiculo veiculo;
	
	public VeiculoService(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void acelerar() {
		if (veiculo.isLigado()) {
			veiculo.setVelocidade(veiculo.getVelocidade() + 20);			
		}
	}
	
	public void abastecer (int combustivel) {
		int limite = 60;
		if (veiculo.getLitrosCombustivel() + combustivel <= limite && combustivel > 0) {
			int novaQtdeCombustivel = veiculo.getLitrosCombustivel() + combustivel;
			veiculo.setLitrosCombustivel(novaQtdeCombustivel);
		}
	}
	
	public void frear() {
		if (veiculo.getVelocidade() > 20) {
			veiculo.setVelocidade(veiculo.getVelocidade() - 20);
		} else {
			veiculo.setVelocidade(0);
		}
	}
	
	public void pintar(String cor) {
		veiculo.setCor(cor);
	}

	public void ligar() {
		if (!veiculo.isLigado()) {
			veiculo.setLigado(true);
		}
	}
	
	public void desligar() {
		if (veiculo.isLigado() && veiculo.getVelocidade() == 0) {
			veiculo.setLigado(false);
		}
	}
	
}
