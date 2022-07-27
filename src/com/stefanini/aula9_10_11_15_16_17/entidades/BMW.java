package com.stefanini.aula9_10_11_15_16_17.entidades;

import com.stefanini.aula9_10_11_15_16_17.Carro;
import com.stefanini.aula9_10_11_15_16_17.Conversivel;
import com.stefanini.aula9_10_11_15_16_17.Utilitario;

public class BMW extends Carro implements Conversivel, Utilitario {

	public BMW() {
		super();
	}

	@Override
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		System.out.println("BMW sobrescrita");
		return velocidadeFinal / tempoFinal;
	}

	@Override
	public void piscarAlerta() {
		System.out.println("BMW piscando alerta....!");

	}

	@Override
	public void acionarTurbo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void passear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abrirCapo() {
		// TODO Auto-generated method stub

	}
}
