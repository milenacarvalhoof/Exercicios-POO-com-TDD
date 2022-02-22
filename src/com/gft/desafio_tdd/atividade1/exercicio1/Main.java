package com.gft.desafio_tdd.atividade1.exercicio1;

import com.gft.desafio_tdd.atividade1.exercicio1.models.Veiculo;
import com.gft.desafio_tdd.atividade1.exercicio1.services.VeiculoService;

public class Main {
	
	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("Hyundai", "HB20", "MCM2021", "Vermelho", 50.000);
		VeiculoService service = new VeiculoService(v1);
		
		System.out.println(v1);
		
		service.pintar("Branco");
		service.ligar();
		service.abastecer(60);
		service.acelerar();
		
		System.out.println(v1);
		
		service.frear();
		service.desligar();		
		
		System.out.println(v1);
		
	}

}
