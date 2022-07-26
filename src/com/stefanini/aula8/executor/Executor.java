package com.stefanini.aula8.executor;

import com.stefanini.aula8.Carro;

public class Executor {
	
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setMarca("BMW");
		carro1.setModelo("3201");
		carro1.setChassi(9999);
		carro1.setPlaca("XXX9999");
		carro1.setBancos(5);
		carro1.setVelocidade(200);
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getChassi());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getBancos());
		
		
		System.out.println(carro1.getVelocidade());
		carro1.acelerar();
		
		
		
		
		
		
	}
	
	
	
	
}
