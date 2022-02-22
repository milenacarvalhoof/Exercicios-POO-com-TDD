package com.gft.desafio_tdd.atividade1.exercicio7;

public class Vendedor extends Funcionario{

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		double bonificacao = 3000.00;
		setSalario(getSalario() + bonificacao);
		return bonificacao;
	}
}
