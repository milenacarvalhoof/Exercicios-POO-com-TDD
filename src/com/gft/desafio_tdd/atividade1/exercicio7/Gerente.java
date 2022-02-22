package com.gft.desafio_tdd.atividade1.exercicio7;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		double salario = 10000.00;
		setSalario(getSalario() + salario);
		return salario;
	}

}
