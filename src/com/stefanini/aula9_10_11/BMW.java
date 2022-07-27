package com.stefanini.aula9_10_11;

public class BMW extends Carro {
	
	public BMW() {
		super();
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW sobrescrita");
		return velocidadeFinal / tempoFinal;
	}
}
