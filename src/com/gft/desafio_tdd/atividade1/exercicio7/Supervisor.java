package com.gft.desafio_tdd.atividade1.exercicio7;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		double bonificacao = 5000.00;
		setSalario(getSalario() + bonificacao);
		return bonificacao;
	}

}
