package com.stefanini.aula9_10_11_15_16_17;

public interface Conversivel extends Esportivo {

	void abrirCapo();

	@Override
	default void acionarTurbo() {

	}
}
