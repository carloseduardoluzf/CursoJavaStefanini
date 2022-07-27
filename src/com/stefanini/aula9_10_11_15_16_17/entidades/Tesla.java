package com.stefanini.aula9_10_11_15_16_17.entidades;

import com.stefanini.aula9_10_11_15_16_17.Carro;

public class Tesla extends Carro {

	private boolean dirigeSozinho;

	public Tesla() {
		super();
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("Tesla sobrescrita!");
		return velocidadeFinal * tempoFinal;
	}

	public boolean isDirigeSozinho() {
		return dirigeSozinho;
	}

	public void setDirigeSozinho(boolean dirigeSozinho) {
		this.dirigeSozinho = dirigeSozinho;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("Tesla piscando alerta.....!!");

	}

}
