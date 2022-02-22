package com.gft.desafio_tdd.atividade1.exercicio7;

public class Main {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("João", 40, 1000.00);
		Supervisor supervisor = new Supervisor("Maria", 30, 1000.00);
		Vendedor vendedor = new Vendedor("Ana", 20, 1000.00);
		
		System.out.println("Salários antes das bonificações:");
		System.out.println("Gerente = " + gerente.getSalario());
		System.out.println("Supervisor = " + supervisor.getSalario());
		System.out.println("Vendedor = " + vendedor.getSalario());
		
		gerente.bonificacao();
		supervisor.bonificacao();
		vendedor.bonificacao();
		
		System.out.println("\nSalários depois das bonificações:");
		System.out.println("Gerente = " + gerente.getSalario());
		System.out.println("Supervisor = " + supervisor.getSalario());
		System.out.println("Vendedor = " + vendedor.getSalario());
		
	}

}
